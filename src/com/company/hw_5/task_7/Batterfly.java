package com.company.hw_5.task_7;

public class Batterfly {
    public static void main(String[] args) {
        int[] butterflyNum = createArray();
        printBatterfly(butterflyNum);
    }

    private static int[] createArray() { //1..9
        int[] sourceArray = new int[9 * 2];
        for (int i = 0; i < 9; i++) {
            sourceArray[i] = i + 1;
            sourceArray[(9 * 2) - 1 - i] = i + 1;
        }
        return sourceArray;
    }

    private static void printBatterfly(int[] sourceArray) {
        int k = 0;
        for (int i = 0; i < sourceArray.length; i++) {
            if (i != sourceArray[i]) {
                String line = createLineToPrint(sourceArray, i);
                System.out.println(line);
            }
        }
    }

    private static String createLineToPrint(int[] arr, int i) {
        String lineToPrint = "";
        for (int j : arr) {
            lineToPrint = (j <= arr[i]) ? lineToPrint.concat(String.valueOf(j)): lineToPrint.concat(" ");
        }
        return lineToPrint;
    }
}