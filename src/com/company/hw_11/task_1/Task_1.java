package com.company.hw_11.task_1;

// +
public class Task_1 {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new IterationRunnuble());
        myThread.start();
        myThread.join();
    }
}
