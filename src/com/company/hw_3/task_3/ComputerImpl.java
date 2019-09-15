package com.company.hw_3.task_3;

public class ComputerImpl implements Computer {
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

