package com.company.hw_3.task_1;

public class Person {
    private  String name;
    private Integer age;

    public Person() {
        this("Alex", 22);
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        String forPrint = "Имя " + getName() + " Возраст " + getAge();
        return forPrint;
    }
}
