package com.company.hw_3.task_2;

// Main -> Task_2
public class Main {
    public static void main(String[] args) {
        // проще и нагляднее через '^' (XOR)
        int x = -1;
        int z = 0;
        x = z - x;
        z = -x + z;
        x = z+x;
        System.out.println(x);
        System.out.println(z);

    }
}
