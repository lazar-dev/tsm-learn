package com.company.hw_2.task_7;

import java.math.BigDecimal;

public class task_7 {
    public static void main(String[] args) {
        double myDouble_1 = 0.234234234;
        double myDouble_2 = 2.343434;
        BigDecimal dec_1 = BigDecimal.valueOf(myDouble_1);
        BigDecimal dec_2 = BigDecimal.valueOf(myDouble_2);
        double result = dec_1.divide(dec_2, 5).doubleValue();
        System.out.println(result);
    }

}
