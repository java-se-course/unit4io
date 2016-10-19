package com.epam.course.java.se;

import org.junit.Test;

import java.io.*;

public class PrintWriters {

    @Test
    public void test1() {
        try(PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("outfile.txt")))) {
            printWriter.println("Test output string.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        OutputStream os = System.out;
        try {
            os.write(104);
            os.write(105);
            os.write(10);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

//        InputStream is = null;
//        is.read
    }
}
