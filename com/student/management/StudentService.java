package com.student.management;

import java.util.*;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void deleteStudent(int id) {
        Iterator<Student> iterator = students.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getId() == id) {
                iterator.remove(); // safe removal
                found = true;
                System.out.println("Student deleted.");
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
