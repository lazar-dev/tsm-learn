package com.company.hw_11.task_3;

import java.util.ArrayList;

// +
public class Shop {
    private ArrayList<String> toys;

    public Shop() {
        this.toys = new ArrayList<>();
    }

    public boolean addToys(String name) {
        synchronized (this) {
            return toys.add(name);
        }
    } // здесь нужен абзац между методами
    public int getSize(){
        return toys.size();
    }

    @Override
    public String toString() {
        return "Shop{" +
                "toys=" + toys +
                '}';
    }
}
