package com.epam.course.java.se;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String s;
        try {
            s = reader.readLine();
            System.out.println("Got line: " + s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
