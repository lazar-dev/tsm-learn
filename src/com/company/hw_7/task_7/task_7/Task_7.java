package com.company.hw_7.task_7.task_7;

import java.io.File;

public class Task_7 {
    private static final String DIRECTORY = "src";

    public static void main(String[] args) {
        getDirectoryPath(DIRECTORY);
    }

    public static void getDirectoryPath(String path) {
        File[] files = new File(path).listFiles();

        for (File file : files) {
            System.out.println(file.getAbsolutePath());
            if(file.isDirectory()) getDirectoryPath(file.getAbsolutePath());
        }
    }
}
