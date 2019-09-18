package com.company.hw_4.task_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] strArr = {"Hello", "World", "wheel", "python", "wire"};

        ArrayList<String> newArr = new ArrayList<>();
        for (String s : strArr) {
            if (s.toLowerCase().startsWith("w")){
                newArr.add(s);
            }
        }
        System.out.println(newArr);
        }
    }
