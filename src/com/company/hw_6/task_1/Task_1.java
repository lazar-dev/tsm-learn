package com.company.hw_6.task_1;

import java.math.BigDecimal;
import java.math.MathContext;

public class Task_1 {
    public static void main(String[] args) {
        BigDecimal myDivide = divide(8, 0);
        System.out.println(myDivide.toString());
    }

    public static BigDecimal divide(double x, double y){
        try {
            BigDecimal bigDecimalX = new BigDecimal(x);
            BigDecimal bigDecimalY = new BigDecimal(y);
            return bigDecimalX.divide(bigDecimalY, MathContext.DECIMAL128);
        }catch (ArithmeticException e){
            System.out.println("Делить на ноль нельзя!");
            return  new BigDecimal(0);
        }
    }
}
