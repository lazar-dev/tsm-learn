package com.company.hw_7.task_3;

import java.io.*;

public class Task_3 {
    private static final String PATH = "src/com/company/hw_7/task_2/file.txt";

    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(PATH)))) {
            String line;
            while ((line = read.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
