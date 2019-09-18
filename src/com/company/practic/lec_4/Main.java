package com.company.practic.lec_4;

public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello World");
        StringBuilder str_1 = new StringBuilder("Hello");
        str_1.append(" World");
        System.out.println(str);
        System.out.println(str_1);
        System.out.println(str.toString().equals(str_1.toString()));
    }
}
