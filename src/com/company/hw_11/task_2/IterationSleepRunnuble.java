package com.company.hw_11.task_2;

// RunnAble
public class IterationSleepRunnuble implements Runnable {

    @Override
    public void run() {
                // 20 -лучше через конструктор передавать
        for (int i = 0; i < 20; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
