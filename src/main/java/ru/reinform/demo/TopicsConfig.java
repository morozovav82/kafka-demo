package ru.reinform.demo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicsConfig {

    public final static String ZZ_TOPIC = "zz_topic";
    public final static String OBJ2_TOPIC = "obj2_topic";
    public final static String OBJ_TOPIC = "obj3_topic";

    @Bean
    public NewTopic topic1() {
        return TopicBuilder.name(ZZ_TOPIC)
                .partitions(1)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic topic2() {
        return TopicBuilder.name(OBJ_TOPIC)
                .partitions(1)
                .replicas(1)
                .build();
    }
}
