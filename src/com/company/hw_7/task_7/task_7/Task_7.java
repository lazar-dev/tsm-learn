package com.company.hw_7.task_7.task_7;

import java.io.File;

public class Task_7 {
    private static final String DIRECTORY = "src";

    public static void main(String[] args) {
        getDirectoryPath(DIRECTORY);
    }

    public static void getDirectoryPath(String path) {
        File[] files = new File(path).listFiles();

        for (File file : files) {
            System.out.println(file.getAbsolutePath());
            if(file.isDirectory()) getDirectoryPath(file.getAbsolutePath());
        }
    }
}
/*
OUTPUT
/home/lazar/IdeaProjects/tsm-learn/src/com
/home/lazar/IdeaProjects/tsm-learn/src/com/company
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_7
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_7/Batterfly.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_7/example2
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_7/example2/Batterfly.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_1
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_1/ArrayMathMain.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_1/ArrayMath.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_3
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_3/Welcom.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_6
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_6/MultiplyingN.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_5
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_5/SumN.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_4
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_4/PrintDot.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_2
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_5/task_2/MaxMin.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/task_7
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/task_7/task_7.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/task_8
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/task_8/task_8.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/task_3
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/task_3/task_3.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/task_6
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/task_6/task_6.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/task_5
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/task_5/task_5.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/tast_1
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/tast_1/task_1.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/task_9
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/task_9/task_9.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/task_4
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/task_4/task_4.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/task_2
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_2/task_2/task_2.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/LearnTSM.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_1
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_1/task_5
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_1/task_5/WelcomeProject.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_3
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_3/task_1
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_3/task_1/PersonMain.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_3/task_1/Person.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_3/task_3
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_3/task_3/Computer.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_3/task_3/Main.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_3/task_3/ComputerImpl.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_3/task_2
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_3/task_2/Main.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_7
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_7/task_7
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_7/task_7/Task_7.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_1
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_1/Task_1.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_1/file.txt
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_3
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_3/Task_3.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_6
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_6/cat.jpg
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_6/Task_6.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_4
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_4/Work.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_4/Task_4.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_4/Employee
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_4/Employee.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_2
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_2/file.txt
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_7/task_2/Task_2.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/practic
/home/lazar/IdeaProjects/tsm-learn/src/com/company/practic/lec_4
/home/lazar/IdeaProjects/tsm-learn/src/com/company/practic/lec_4/Main.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/practic/lec_3
/home/lazar/IdeaProjects/tsm-learn/src/com/company/practic/lec_3/Person.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_6
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_6/task_1
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_6/task_1/Task_1.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_6/task_3
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_6/task_3/Task_3.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_6/task_3/OversizeArrayExeption.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_6/task_4
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_6/task_4/Washer.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_6/task_4/WashVoltageException.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_6/task_4/Task_4.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_4
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_4/task_7
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_4/task_7/Banchmark.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_4/task_1
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_4/task_1/SplMain.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_4/task_3
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_4/task_3/ReplaceMain.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_4/task_6
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_4/task_6/Main.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_4/task_4
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_4/task_4/Main.java
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_4/task_2
/home/lazar/IdeaProjects/tsm-learn/src/com/company/hw_4/task_2/Main.java
*/
