package com.company.hw_5.task_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMath {
    int[] ints;

    public ArrayMath(int[] ints) {
        this.ints = ints;
    }

    public int evenSumm() {
        int[] ints = this.ints;
        Integer summ = 0;
        for (int i : ints) {
            if(i % 2 == 0){
                summ = summ + i;
            }
        }
        return summ;
    }

    public int allSumm(){
        int[] ints = this.ints;
        Integer summ = 0;
        for (int i : ints) {
                summ = summ + i;
        }
        return summ;
    }

    public int oddSumm(){
        int[] ints = this.ints;
        Integer summ = 0;
        for (int i : ints) {
            if(i % 2 != 0){
                summ = summ + i;
            }
        }
        return summ;
    }

    public static ArrayMath generateArray(int length){
        int[] ints = new int[length];
        for (int i = 0; i < length ; i++) {
            ints[i] = i;
        }
        return new ArrayMath(ints);
    }

}
