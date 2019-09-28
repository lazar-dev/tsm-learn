package com.company.hw_7.task_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//+
public class Task_1 {
    private static final String PATH = "src/com/company/hw_7/task_1/file.txt";

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try (FileOutputStream fos = new FileOutputStream(PATH)) {
            for (int number : numbers) {
                fos.write((byte) number);
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
