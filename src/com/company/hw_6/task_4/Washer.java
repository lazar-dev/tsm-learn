package com.company.hw_6.task_4;

// форматируй код
public class Washer {
    private String manufactured;
    private String model;

    public Washer(String manufactured, String model) {
        this.manufactured = manufactured;
        this.model = model;
    }

    // метод ран просто запускает стиралку, он может проверять напряжение, но до старта
    // у тебя в методе мейн должен быть цикл, в котором ты проверяешь напряжение и при его отсутствии генерироровать исключение
    // я бы так делал
    public void run() throws WashVoltageException {
        System.out.println("Стирка запущена.");
        if(checkVoltage()){
            System.out.println("Все в порядке.");
        }else {
            throw new WashVoltageException("Запущено резервное питание для слива воды.");
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
