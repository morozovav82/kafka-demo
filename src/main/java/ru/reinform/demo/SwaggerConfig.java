package ru.reinform.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.ServletContext;
import java.util.ArrayList;

/**
 * Конфигурация swagger-документации
 */
@Configuration
@EnableSwagger2
@Slf4j
public class SwaggerConfig {

    /**
     * Бин настройки API
     * @param servletContext контекст приложения
     * @return Бин настройки API
     */
    @Bean
    public Docket api(ServletContext servletContext) {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        return (docket)
                .select()
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.apiInfo());
    }

    /**
     * Настройка информации по API
     * @return Настройка информации по API
     */
    protected ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "kafka-demo",
                "kafka-demo",
                "1.0",
                null,
                null,
                null,
                null,
                new ArrayList<>());
        return apiInfo;
    }
}