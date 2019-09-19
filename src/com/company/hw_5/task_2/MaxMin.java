package com.company.hw_5.task_2;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        //24 15 16 78 13
        int[] myNum = parceArgs(args);
        System.out.println(max(myNum));
        System.out.println(min(myNum));
    }

    private static int[] parceArgs(String[] args) {
        int[] number = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            number[i] = Integer.valueOf(args[i]);
        }
        return number;
    }

    private static int max(int[] num) {
        int maxNum = num[0];
        for (int i : num) {
            if (i > maxNum) {
                maxNum = i;
            } else {

            }
        }
        return maxNum;
    }

    private static int min(int[] num) {
        int maxNum = num[0];
        for (int i : num) {
            if (i < maxNum) {
                maxNum = i;
            }
        }
        return maxNum;
    }
}
