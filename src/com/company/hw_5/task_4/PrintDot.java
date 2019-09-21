package com.company.hw_5.task_4;

public class PrintDot {
    public static void main(String[] args) {
        // 6 - вынеси в отдельную переменную
        for (int i = 6; i > 0 ; i--) {
            String dot = "";
            for (int j = 0; j < i; j++) {
                dot+=".";
            }
            System.out.println(dot);
        }
    }
}
