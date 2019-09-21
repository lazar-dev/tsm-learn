package com.company.hw_5.task_1;

//+
public class ArrayMathMain {
    public static void main(String[] args) {
        ArrayMath ints = ArrayMath.generateArray(100);
        System.out.println(ints.allSumm());
        System.out.println(ints.evenSumm());
        System.out.println(ints.oddSumm());
    }
}
