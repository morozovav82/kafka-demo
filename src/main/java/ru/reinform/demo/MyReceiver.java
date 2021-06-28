package ru.reinform.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static ru.reinform.demo.TopicsConfig.OBJ_TOPIC;
import static ru.reinform.demo.TopicsConfig.ZZ_TOPIC;

@Component
@Slf4j
public class MyReceiver {

    @KafkaListener(id = "myId", topics = ZZ_TOPIC)
    public void listen1(String msg) {
        log.info("receive message: " + msg);
    }

    @KafkaListener(id = "reciever1", topics = ZZ_TOPIC)
    public void listen2(String msg) {
        log.info("receive message: " + msg);
    }

    @KafkaListener(id = "reciever2", topics = OBJ_TOPIC)
    public void listen3(TestModel model) {
        log.info("receive message: " + model);
    }

//    @KafkaListener(id = "reciever3", topics = OBJ2_TOPIC)
//    public void listen4(Object model) {
//        log.info("receive message: " + model);
//    }
}
