package ru.reinform.demo;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TestModel implements Serializable {

    private Integer fieldInt;
    private String fieldStr;
    private LocalDate fieldDate;
}
