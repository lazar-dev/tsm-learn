package com.company.hw_4.task_7;

public class Banchmark {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String myStr = "Hello";
        for (int i = 0; i <10000 ; i++) {
            myStr = myStr + "World";
        }
        workingTime(start, System.currentTimeMillis(), "String");

        start = System.currentTimeMillis();

        StringBuffer myStrbuf = new StringBuffer("Hello");
        for (int i = 0; i < 10000; i++) {
            myStrbuf.append("World");
        }
        workingTime(start, System.currentTimeMillis(), "StringBuffer");
        start = System.currentTimeMillis();
        StringBuilder myStrbuild = new StringBuilder("Hello");
        for (int i = 0; i < 10000; i++) {
            myStrbuild.append("World");
        }
        workingTime(start, System.currentTimeMillis(), "StringBuilder");


    }

    public static void workingTime(long startTime, long endTime, String comment){
        System.out.println("Работа " + comment + " За 1кк итераций: " + (endTime - startTime));
    }
}
