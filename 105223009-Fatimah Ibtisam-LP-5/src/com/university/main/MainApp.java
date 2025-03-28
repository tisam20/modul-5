package com.university.main;

import com.university.model.Student;

public class MainApp {
    public static void main(String[] args) {
        // array objek Student 
        Student[] students = {
            new Student("S001", "Alice", 20, 3.8),
            new Student("S002", "Bob", 22, 3.6),
            new Student("S003", "Charlie", 21, 3.9),
            new Student("S004", "David", 23, 3.5),
            new Student("S005", "Eve", 20, 3.7)
        };

        System.out.println("=== Data Mahasiswa ===");
        for (Student student : students) {
            student.displayInfo();
        }
    }
}
