package ru.reinform.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import static ru.reinform.demo.TopicsConfig.OBJ_TOPIC;
import static ru.reinform.demo.TopicsConfig.ZZ_TOPIC;

@RestController
@Slf4j
public class MyController {

    @Autowired
    private KafkaTemplate<String, String> template;

    @Autowired
    private KafkaTemplate<String, TestModel> template2;

    @GetMapping("/send/{value}")
    public void sendGet(@PathVariable(name = "value") String value) {
        log.info("send message: " + value);
        template.send(ZZ_TOPIC, value);
    }

    @PostMapping("/sendText")
    public void sendPost(@RequestBody String value) {
        log.info("send message: " + value);
        template.send(ZZ_TOPIC, value);
    }

    @PostMapping("/sendObj")
    public void sendPost(@RequestBody TestModel model) {
        log.info("send message: " + model);
        template2.send(OBJ_TOPIC, model);
    }
}
