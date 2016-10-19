package com.epam.course.java.se;

import com.epam.course.java.se.data.DataClass1;
import com.epam.course.java.se.data.DataClass2;

import java.io.*;

public class MainDeserialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream save =
                     new ObjectInputStream(
                             new BufferedInputStream(
                                     new FileInputStream("save")))) {
            final DataClass2 dataClass2 = (DataClass2) save.readObject();
            System.out.println(dataClass2);
            final DataClass1 dataClass1 = (DataClass1) save.readObject();
            System.out.println(dataClass1);
        }
    }
}
