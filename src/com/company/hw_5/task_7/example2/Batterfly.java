package com.company.hw_5.task_7.example2;

public class Batterfly {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        StringBuilder reverceSoure = new StringBuilder();
        String body;
        for (int i = 0; i < arr.length; i++) {
            StringBuilder source = new StringBuilder();
            for (int j = 0; j < arr.length; j++) {
                if (j <= i) {
                    source.append(arr[j]);
                }else {
                    source.append(" ");
                }
            }
            //String n = (i == (arr.length - 1)) ?"" : "\n";
            body = source.toString() + source.reverse().toString() + "\n";
            reverceSoure.append(body);
        }
        System.out.println(reverceSoure.toString() + reverceSoure.reverse().toString());
    }
}
