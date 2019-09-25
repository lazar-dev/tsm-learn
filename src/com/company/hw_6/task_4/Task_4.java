package com.company.hw_6.task_4;

// форматируй код
public class Task_4 {
    public static void main(String[] args) {
        Washer atlant = new Washer("Atlant", "GS500");
        try{
            atlant.run();
        }catch (WashVoltageException e){
            atlant.reserveVoltage();
        }
    }
}
