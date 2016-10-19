package com.epam.course.java.se;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            System.out.println("Got int: " + scanner.nextInt());
        }

        System.out.println("Out of ints");
    }
}
