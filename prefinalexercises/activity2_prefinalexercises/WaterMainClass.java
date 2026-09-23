/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2_prefinalexercises;

import activity2_prefinalexercises.WaterBill;

/**
 *
 * @author User
 */
public class WaterMainClass {
    public static void main(String[] args) {

        // Create at least 3 WaterBill objects
        WaterBill customer1 = new WaterBill(
            "W-1001",
            "Maria Santos",
            "Residential",
            120,
            145
        );

        WaterBill customer2 = new WaterBill(
            "W-1002",
            "Juan Dela Cruz",
            "Residential",
            200,
            215
        );

        WaterBill customer3 = new WaterBill(
            "W-1003",
            "ABC Trading",
            "Commercial",
            300,
            340
        );

        // Display bills
        customer1.displayBill();
        customer2.displayBill();
        customer3.displayBill();
    }
}
