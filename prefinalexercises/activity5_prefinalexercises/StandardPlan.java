/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5_prefinalexercises;

/**
 *
 * @author User
 */
    public class StandardPlan extends InternetPlan {

    private static final double STANDARD_FEE = 1499;
    private static final String SPEED = "100 Mbps";

    public StandardPlan(String planCode, String customerName,
        int monthsSubscribed) {

        super(planCode, customerName, STANDARD_FEE, monthsSubscribed);
    }

    @Override
    public double calculateMonthlyBill() {

        double bill = getMonthlyFee();

        if (getMonthsSubscribed() >= 12) {
            bill = bill * 0.90;
        }

        return bill;
    }

    @Override
    public String getSpeed() {
        return SPEED;
    }

    @Override
    public String getPlanDescription() {
        return "Standard";
    }
}

