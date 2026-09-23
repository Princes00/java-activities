/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5_prefinalexercises;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   

/**
 *
 * @author User
 */
public class InternetMainClass {
    public static void main(String[] args) {

        InternetPlan[] plans = {
            new BasicPlan("B001", "Juan Dela Cruz", 5),
            new StandardPlan("S001", "Ana Reyes", 12),
            new PremiumPlan("P001", "Mark Santos", 15)
        };

        System.out.println("===== INTERNET SUBSCRIPTION =====");
        System.out.println();

        for (InternetPlan plan : plans) {

            System.out.println("Customer: " + plan.getCustomerName());
            System.out.println("Plan: " + plan.getPlanDescription());
            System.out.println("Speed: " + plan.getSpeed());

            System.out.printf("Monthly Fee: P%,.2f%n",
                    plan.getMonthlyFee());

            System.out.println("Months Subscribed: "
                    + plan.getMonthsSubscribed());

            // Display discount
            double discount = 0;

            if (plan instanceof BasicPlan &&
                    plan.getMonthsSubscribed() >= 6) {

                discount = 5;

            } else if (plan instanceof StandardPlan &&
                    plan.getMonthsSubscribed() >= 12) {

                discount = 10;

            } else if (plan instanceof PremiumPlan &&
                    plan.getMonthsSubscribed() >= 12) {

                discount = 15;
            }
            System.out.println(" ");
            
            System.out.println("Discount: " + discount + "%");
            // Polymorphism
            System.out.printf("Monthly Bill: P%,.2f%n",
                    plan.calculateMonthlyBill());

            if (plan.getMonthsSubscribed() >= 12) {
                System.out.println("Classification: LONG-TERM SUBSCRIBER");
            } else {
                System.out.println("Classification: REGULAR SUBSCRIBER");
            }

            System.out.println();
        }
    }
}
                                                                                                                                                                                                                                      