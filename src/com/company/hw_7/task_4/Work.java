package com.company.hw_7.task_4;

import java.io.Serializable;

public class Work implements Serializable {
    private String workName;
    private int minimalExperience;

    public Work(String workName, int minimalExperience) {
        this.workName = workName;
        this.minimalExperience = minimalExperience;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public int getMinimalExperience() {
        return minimalExperience;
    }

    public void setMinimalExperience(int minimalExperience) {
        this.minimalExperience = minimalExperience;
    }
}
