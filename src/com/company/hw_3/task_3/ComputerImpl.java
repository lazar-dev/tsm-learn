package com.company.hw_3.task_3;

public class ComputerImpl implements Computer {
    /*
    а то будет если дважды вызвать метод enable/disable? В реальной жизни такие ситуации часто встречаются
    заведи поле, в котором ты будешь хранить состояние твоего компьютера, что он включен или выключен
    и если юзер дважды попробует включить, дай ему знать об этом
    */
    @Override
    public String enable() {
        return "Enable!";
    }

    @Override
    public String disa() {
        return "Disable!";
    }

    @Override
    public String reset(){
        return "Reset";
    }
}

