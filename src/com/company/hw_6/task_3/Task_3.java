package com.company.hw_6.task_3;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        boolean state = true;
        while (state) {
            try {
                int[] arr = createArray(scanerIntThread());
                state = false;
            } catch (OversizeArrayExeption e) {
                System.out.println("Размер массива больше разрешенного");

            }
        }
    }

    private static int[] createArray(int sizeArray) throws OversizeArrayExeption {
        if (sizeArray <= 25) {
            int[] intArrays = new int[sizeArray];
            for (int i = 0; i < intArrays.length; i++) {
                intArrays[i] = i;
            }
            return intArrays;
        }
        throw new OversizeArrayExeption("Превышен размер массива");
    }

    private static int scanerIntThread() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        return in.nextInt();
    }


}
