package com.company.hw_7.task_4;

import java.io.*;

public class Task_4 {
    private static final String PATH = "src/com/company/hw_7/task_4/Employee";

    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Conditer", 1);
        firstEmployee.setPeopleName("Vasya");
        firstEmployee.setPeoleAge("12");
        serializablePerson(firstEmployee, PATH);
        Employee newPerson = (Employee) deSerializablePerson(PATH);
        System.out.println(String.format("WorkName: %s, Experience: %s, Name: %s, Age: %s",
                newPerson.getWorkName(),
                newPerson.getMinimalExperience(),
                newPerson.getPeopleName(),
                newPerson.getPeoleAge()));
    }

    public static void serializablePerson(Object obj, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(obj);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object deSerializablePerson(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            return ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
