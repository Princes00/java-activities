/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5_prefinalexercises;

/**
 *
 * @author User
 */
    public class PremiumPlan extends InternetPlan {

    private static final double PREMIUM_FEE = 2499;
    private static final String SPEED = "300 Mbps";

    public PremiumPlan(String planCode, String customerName,
        int monthsSubscribed) {

        super(planCode, customerName, PREMIUM_FEE, monthsSubscribed);
    }

    @Override
    public double calculateMonthlyBill() {

        double bill = getMonthlyFee();

        if (getMonthsSubscribed() >= 12) {
            bill = bill * 0.85;
        }

        return bill;
    }

    @Override
    public String getSpeed() {
        return SPEED;
    }

    @Override
    public String getPlanDescription() {
        return "Premium";
    }
}
