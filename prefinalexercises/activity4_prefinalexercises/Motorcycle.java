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
    // Motorcycle subclass
    public class Motorcycle extends Vehicle {

    public Motorcycle(String vehicleId, String brand, String model, int rentalDays) {
        super(vehicleId, brand, model, rentalDays);
    }

    @Override
    public double calculateRental() {
        double rental = getRentalDays() * 700;

        // Helmet fee
        rental += 100;

        return rental;
    }
}
