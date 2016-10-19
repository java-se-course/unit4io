package com.epam.course.java.se.data;

import lombok.Data;

import java.io.Serializable;

@Data
public class DataClass1 implements Serializable {
    private final long l;
    private final String str;
}
