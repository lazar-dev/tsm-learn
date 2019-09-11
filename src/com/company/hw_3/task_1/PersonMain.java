package com.company.hw_3.task_1;

public class PersonMain {
    public static void main(String[] args) {
        Person noName = new Person(); //Дефолт
        System.out.println(noName.toString());

        Person Ivan = new Person("Ivan",28);
        System.out.println(Ivan.toString());
    }
}
