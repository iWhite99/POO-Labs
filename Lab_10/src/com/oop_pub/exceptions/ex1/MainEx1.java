package com.oop_pub.exceptions.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class MainEx1 {
    private static void readAndPrintLine() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String text = reader.readLine();
            out.println(text);
        } catch (IOException e) {
            out.println("error while reading");
            e.printStackTrace();
        }

        // TODO: Read a line from stdin and print it to stdout
        // TODO: Don't forget to close the reader (Hint: try-with-resources, try-finally)
    }

    public static void main(String[] args) {
        readAndPrintLine();
    }
}
