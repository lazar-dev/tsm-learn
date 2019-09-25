package com.company.hw_6.task_1;

import java.math.BigDecimal;
import java.math.MathContext;

// форматируй код
public class Task_1 {
    public static void main(String[] args) {
        // myDivide -> result
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
            // так делать не стоит. Лучше выбрасывать какой-нибудь RuntimeException("сообщение"),
            // тогда компилятор не будет ругаться что метод ничего не возвращает
            return  new BigDecimal(0);
        }
    }
}
