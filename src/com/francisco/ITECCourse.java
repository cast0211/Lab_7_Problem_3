package com.francisco;
import java.util.*;

public class ITECCourse {

    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private String room;

    //Constructor
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents, String courseRoom){
        name = courseName;
        code = courseCode;
        room = courseRoom;
        students = new ArrayList<String>();
        maxStudents = courseMaxStudents;

    }
    public void addStudent(String studentName){
        if (students.size() < this.maxStudents) {
            students.add(studentName);
            System.out.println(studentName + " was added to " + this.name);
        }
        else{
            System.out.println(this.name + " is full, max number of students is " + this.maxStudents + " " +
                    studentName + " not added");
        }
    }
    public void removeStudent (String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);
        }
        else{
            System.out.println(studentName + " was not found in this course");
        }
    }

    public void writeCourseInfo(){
        System.out.println("Course Name: "+ this.name);
        System.out.println("Course Code: "+ this.code);
        System.out.println("Course Room Number: "+ this.room);
        System.out.println("Students Enrolled: ");
        for (String student: this.students){
            System.out.println(student);
        }
        System.out.println("There are "+ getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is "+ this.maxStudents);


    }
    int getNumberOfStudents(){
        return this.students.size();
    }
    public String getCourseName(){
        return this.name;
    }
    public void setCourseName(String newName){
        this.name = newName;
    }
    public String getCourseRoom(){
        return this.room;
    }
    public void setCourseRoom(String newRoom){
        this.room = newRoom;

    }
    public int getCourseSpotsAvailable (){
        int available = maxStudents-this.students.size();
        return available;
    }





}
