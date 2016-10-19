package com.epam.course.java.se;

import com.epam.course.java.se.data.DataClass1;
import com.epam.course.java.se.data.DataClass2;

import java.io.*;

public class MainSerialize {
    public static void main(String[] args) throws IOException {
        try (ObjectOutputStream save =
                     new ObjectOutputStream(
                             new BufferedOutputStream(
                                     new FileOutputStream("save")))) {
            save.writeObject(new DataClass2("test name", new DataClass1(666, "str x")));
            save.writeObject(new DataClass1(13, "str 2"));
        }
    }
}
