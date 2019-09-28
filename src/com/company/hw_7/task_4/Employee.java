package com.company.hw_7.task_4;

import java.io.Serializable;

// наследовать Employee от Work так себе идея. 
public class Employee extends Work implements Serializable {
    // name
    private String peopleName;
    // peoleAge - написано с опечаткой, просто name
    private String peoleAge;
    // private Work work;

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
