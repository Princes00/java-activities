/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5_prefinalexercises;

/**
 *
 * @author User
 */
    public class BasicPlan extends InternetPlan {

    private static final double BASIC_FEE = 999;
    private static final String SPEED = "50 Mbps";

    public BasicPlan(String planCode, String customerName,
        int monthsSubscribed) {
        super(planCode, customerName, BASIC_FEE, monthsSubscribed);
    }

    @Override
    public double calculateMonthlyBill() {

        double bill = getMonthlyFee();

        if (getMonthsSubscribed() >= 6) {
            bill = bill * 0.95;
        }

        return bill;
    }

    @Override
    public String getSpeed() {
        return SPEED;
    }

    @Override
    public String getPlanDescription() {
        return "Basic";
    }
}
