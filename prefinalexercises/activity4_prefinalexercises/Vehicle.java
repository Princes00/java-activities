/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity4_prefinalexercises;

/**
 *
 * @author User
 */
public class Vehicle {
     // Private properties - Encapsulation
    private String vehicleId;
    private String brand;
    private String model;
    private int rentalDays;

    // Constructor
    public Vehicle(String vehicleId, String brand, String model, int rentalDays) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.rentalDays = rentalDays;
    }

    // Getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    // Method to be overridden
    public double calculateRental() {
        return 0;
    }

    // Display vehicle information
    public void displayVehicle() {
        System.out.println("Vehicle: " + getClass().getSimpleName());
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rental Days: " + rentalDays);
        System.out.printf("Rental Cost: P%,.2f%n", calculateRental());
        System.out.println();
    }
}



