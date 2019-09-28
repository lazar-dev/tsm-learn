package com.company.hw_7.task_4;

import java.io.Serializable;

public class Employee extends Work implements Serializable {
    private String peopleName;
    private String peoleAge;

    public Employee(String workName, int minimalExperience) {
        super(workName, minimalExperience);
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public String getPeoleAge() {
        return peoleAge;
    }

    public void setPeoleAge(String peoleAge) {
        this.peoleAge = peoleAge;
    }
}
