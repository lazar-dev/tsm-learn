package com.company.hw_3.task_1;

// PersonMain -> Task_1 - для удобства, это будет значить, что в этом классе метод main для таски
public class PersonMain {
    public static void main(String[] args) {
        Person noName = new Person(); //Дефолт - не оставляй такие комментарии. Итак видно, что конструктор дефолт
        System.out.println(noName.toString());

        Person Ivan = new Person("Ivan",28);
        System.out.println(Ivan.toString());
    }
}
