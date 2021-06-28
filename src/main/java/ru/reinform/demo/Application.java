package ru.reinform.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Стартер SpringBoot
 */
@SpringBootApplication
public class Application {

    /**
     * Стартовый метод приложения
     *
     * @param args список атрибутов
     */
    public static void main(String[] args) {
        SpringApplication.run(new Class<?>[]{Application.class}, args);
    }
}
