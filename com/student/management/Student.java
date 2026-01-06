package com.student.management;

public class Student {

    private int id;
    private String name;
    private int age;
    private String fatherName;
    private String motherName;

    
    public Student(int id, String name, int age, String fatherName, String motherName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id +
            ", Name: " + name +
            ", Age: " + age +
            ", Father: " + fatherName +
            ", Mother: " + motherName;
    }
}
