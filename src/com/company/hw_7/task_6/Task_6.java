package com.company.hw_7.task_6;

import java.io.*;
import java.util.Arrays;

public class Task_6 {
    private static final String PATH = "src/com/company/hw_7/task_6/cat.jpg";

    public static void main(String[] args) {
        String cryptMessage = "Nice cat";
        try (FileOutputStream fos = new FileOutputStream(PATH, true)) {
            fos.write(cryptMessage.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(PATH)) {
            File file = new File(PATH);
            //long lengthFile = file.length();
            try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
                byte[] strByte = new byte[cryptMessage.length()];
                raf.seek(file.length() - (long) cryptMessage.length());
                raf.readFully(strByte, 0, cryptMessage.length());
                String newStr = new String(strByte, "UTF-8");
                System.out.println(newStr);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
