package com.company.hw_4.task_6;

import java.util.ArrayList;

// Main -> Task_6
// не забывай форматировать код
public class Main {
    public static void main(String[] args) {
        String[] strArr = {"Hello", "World", "wheel", "python", "wire"};

        // раз уж ты взял ArrayList, то и удалять нужно было из него
        // newArr - плохое название переменной
        ArrayList<String> newArr = new ArrayList<>();
        // s -> word
        for (String s : strArr) {
            if (s.toLowerCase().startsWith("w")){
                newArr.add(s);
            }
        }
        System.out.println(newArr);
        }
    }
