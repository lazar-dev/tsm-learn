package com.company.hw_11.task_1;

// RunnAble
public class IterationRunnuble implements Runnable {

    @Override
    public void run() {
         // 10 -лучше через конструктор передавать
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
