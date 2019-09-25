package com.company.hw_6.task_4;

public class Washer {
    String manufactured;
    String model;

    public Washer(String manufactured, String model) {
        this.manufactured = manufactured;
        this.model = model;
    }

    public void run() throws WashVoltageExceprion {
        System.out.println("Стирка запущена.");
        if(checkVoltage()){
            System.out.println("Все в порядке.");
        }else {
            throw new WashVoltageExceprion("Запущено резервное питание для слива воды.");
        }
    }

    private boolean checkVoltage(){
        if((Math.random() * 10) > 5){
            return false;
        }
        return true;
    }

    public void reserveVoltage(){
        System.out.println("Запущен слив воды!");
    }
}