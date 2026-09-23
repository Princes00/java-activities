/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity1_prefinalexercises;

import activity1_prefinalexercises.Student;

/**
 *
 * @author User
 */
public class StudentMainClass {
    public static void main(String[] args) {
        Student student = new Student(
            "2026-001",
            "Princes May C. Opano",
            "BSIT",
            85,
            88,
            91
        );

       student.displayStudentInfo();
    }
}