package com.company.hw_3.task_3;

// Main -> Task_3
public class Main {
    public static void main(String[] args) {
        ComputerImpl lenovo = new ComputerImpl();
        System.out.println(lenovo.enable());
        System.out.println(lenovo.reset());
        System.out.println(lenovo.disa());
    }
}
