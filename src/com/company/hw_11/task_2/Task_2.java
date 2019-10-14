package com.company.hw_11.task_2;

// +
public class Task_2 {
    public static void main(String[] args) throws InterruptedException {
        Thread mySleepThread = new Thread(new IterationSleepRunnuble());
        mySleepThread.start();
        mySleepThread.join();
        System.out.println("good");
    }
}
