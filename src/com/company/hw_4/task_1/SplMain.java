package com.company.hw_4.task_1;

// если я верно понял, то Spl = split, не делай таких сокращений. 
// Класс с методом main можно называть по номеру таски, так удобнее
public class SplMain {
    public static void main(String[] args) {
        // str -> wordToSplit
        String str = "engineering";
        System.out.println(str.substring(0,6)); //engine
        System.out.println(str.substring(7)); //ring
    }
}
