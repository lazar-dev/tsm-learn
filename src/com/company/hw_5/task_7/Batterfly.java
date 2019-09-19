package com.company.hw_5.task_7;

import java.util.Arrays;

public class Batterfly {
    public static void main(String[] args) {
        int[] butterflyNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < butterflyNum.length; i++) {
            if (i == butterflyNum[i]) {
                continue;
            }
            String butterflyStr = "";
            for (int i1 : butterflyNum) {
                if (i1 <= butterflyNum[i]) {
                    //butterflyStr = butterflyStr + " ";
                    butterflyStr = butterflyStr + String.valueOf(i1);
                } else {
                    butterflyStr = butterflyStr + " ";
                }
            }

            System.out.println(butterflyStr);
        }

    }
}
