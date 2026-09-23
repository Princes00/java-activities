/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity4_prefinalexercises;

import activity4_prefinalexercises.Vehicle;

/**
 *
 * @author User
 */
public class VehicleMainClass {
    public static void main(String[] args) {

        System.out.println("===== VEHICLE RENTAL =====");
        System.out.println();

        Vehicle[] vehicles = {
            new Car("C001", "Toyota", "Vios", 7),
            new Motorcycle("M001", "Honda", "Click 125", 3),
            new Van("V001", "Toyota", "Hiace", 2)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayVehicle();
        }
    }
}
