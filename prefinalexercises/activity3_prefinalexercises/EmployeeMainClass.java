/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity3_prefinalexercises;

import activity3_prefinalexercises.Employee;

/**
 *
 * @author User
 */
public class EmployeeMainClass {
    public static void main(String[] args) {

        // Create 3 Employee objects
        Employee employee1 = new Employee(
            "E-001",
            "Pedro Cruz",
            "Programmer",
            45,
            250
        );

        Employee employee2 = new Employee(
            "E-002",
            "Ana Reyes",
            "Designer",
            40,
            200
        );

        Employee employee3 = new Employee(
            "E-003",
            "Juan Santos",
            "Assistant",
            15,
            180
        );

        // Display payroll
        employee1.displayPayroll();
        employee2.displayPayroll();
        employee3.displayPayroll();
    }
}

