package ru.reinform.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static ru.reinform.demo.TopicsConfig.ZZ_TOPIC;

@Component
@Slf4j
public class MyReciever {

    @KafkaListener(id = "myId", topics = ZZ_TOPIC)
    public void listen(String msg) {
        log.info("recieve message: " + msg);
    }

    @KafkaListener(id = "reciever1", topics = ZZ_TOPIC)
    public void listen2(String msg) {
        log.info("recieve message: " + msg);
    }
}
