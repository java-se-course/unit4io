package com.epam.course.java.se.data;

import lombok.Data;

import java.io.Serializable;

@Data
public class DataClass2 implements Serializable {
    private final String name;
    private final DataClass1 dataClass1;
}
