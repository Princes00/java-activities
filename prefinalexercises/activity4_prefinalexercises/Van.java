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
    // Van subclass
    public class Van extends Vehicle {

    public Van(String vehicleId, String brand, String model, int rentalDays) {
        super(vehicleId, brand, model, rentalDays);
    }

    @Override
    public double calculateRental() {
        double rental = getRentalDays() * 2500;

        // Driver fee
        rental += 1000;

        return rental;
    }
}
