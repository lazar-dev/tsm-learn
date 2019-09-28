package com.company.hw_7.task_2;

import java.io.*;

//+
public class Task_2 {
    private static final String PATH = "src/com/company/hw_7/task_2/file.txt";

    public static void main(String[] args) {
        try (PrintStream outPrint = new PrintStream(new FileOutputStream(PATH))) {
            String line = "Welcome to hell :)";
            for (int i = 0; i < 1000_000; i++) {
                outPrint.println(line);
            }
            outPrint.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
