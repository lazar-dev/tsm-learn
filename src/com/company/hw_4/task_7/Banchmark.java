package com.company.hw_4.task_7;

// Banchmark -> B_e_nchmark
public class Banchmark {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String myStr = "Hello";
        
        // 10_000 везде повторяется, вынеси в переменную
        for (int i = 0; i <10000 ; i++) {
            myStr = myStr + "World";
        }
        workingTime(start, System.currentTimeMillis(), "String");

        start = System.currentTimeMillis();

        // переименуй
        StringBuffer myStrbuf = new StringBuffer("Hello");
        for (int i = 0; i < 10000; i++) {
            myStrbuf.append("World");
        }
        workingTime(start, System.currentTimeMillis(), "StringBuffer");
        start = System.currentTimeMillis();
        
        // переименуй
        StringBuilder myStrbuild = new StringBuilder("Hello");
        for (int i = 0; i < 10000; i++) {
            myStrbuild.append("World");
        }
        workingTime(start, System.currentTimeMillis(), "StringBuilder");
// эта пустая строка не нужна        
// эта пустая строка не нужна
    }

    public static void workingTime(long startTime, long endTime, String comment){
        // За 1кк итераций - 1kk = 1000_000, а у тебя 10к, а если ты изменишь кол-во итераций, то код править? передавай аргументом
        System.out.println("Работа " + comment + " За 1кк итераций: " + (endTime - startTime));
    }
}
