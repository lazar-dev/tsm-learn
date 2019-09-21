package com.company.hw_5.task_7;

public class Batterfly {
    public static void main(String[] args) {
        int[] butterflyNum = createArray(8);
        printBatterfly(butterflyNum);
    }

    public static int[] createArray(int n) { //1..9
        int[] sourceArray = new int[n * 2];
        for (int i = 0; i < n; i++) {
            sourceArray[i] = i + 1;
            sourceArray[(n * 2) - 1 - i] = i + 1;
        }
        return sourceArray;
    }

    public static void printBatterfly(int[] sourceArray) {
        int k = 0;
        for (int i = 0; i < sourceArray.length; i++) {
            if (i != sourceArray[i]) {
                String line = createLineToPrint(sourceArray, i);
                System.out.println(line);
            }
        }
    }

    public static String createLineToPrint(int[] arr, int i) {
        String lineToPrint = "";
        for (int j : arr) {
            lineToPrint = (j <= arr[i]) ? lineToPrint.concat(String.valueOf(j)): lineToPrint.concat(" ");
        }
        return lineToPrint;
    }
}