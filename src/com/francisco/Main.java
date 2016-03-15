package com.francisco;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<ITECCourse> courses = new ArrayList<>();
        String name = "Microcomputer Systems Maintenance";
        int code = 1310;
        int maxStudents = 20;
        String room = "";
        ITECCourse maintenanceCourse = new ITECCourse(name, code, maxStudents, room);
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");
        maintenanceCourse.writeCourseInfo();

        courses.add(maintenanceCourse);

        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425,30,"");
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");
        datacomCourse.writeCourseInfo();

        courses.add(datacomCourse);

        for (int x = 0; x<courses.size(); x++){
            courses.get(x).getCourseSpotsAvailable();

        }


    }
}
