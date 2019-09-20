package com.company.hw_4.task_2;

// Main -> Task_2
public class Main {
    public static void main(String[] args) {
        // str -> wordToReverse
        String str = "alucard";
        str = new StringBuilder(str).reverse().toString();
        System.out.println(str);
    }
}
