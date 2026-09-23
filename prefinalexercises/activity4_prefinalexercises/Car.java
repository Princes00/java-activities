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
    public class Car extends Vehicle {

    public Car(String vehicleId, String brand, String model, int rentalDays) {
        super(vehicleId, brand, model, rentalDays);
    }

    @Override
    public double calculateRental() {
        double rental = getRentalDays() * 1500;

        // 10% discount for 7 or more days
        if (getRentalDays() >= 7) {
            rental = rental - (rental * 0.10);
        }

        return rental;
    }
}


