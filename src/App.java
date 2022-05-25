import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class App {
    private static final int MONTHS = 12;

    public static void main(String[] args) throws Exception {
        //GUI user input for loan amount
        double principal = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter loan amount. "));
        
        //GUI user input for interest rate
        float yearlyInterest = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter interest rate. "));
        yearlyInterest = yearlyInterest / 100;

        //GUI user input for length of loan in years
        int termInYears = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter loan term in years. "));

        //monthly variables
        float monthlyInterest = yearlyInterest / MONTHS;
        int termInMonths = termInYears * MONTHS;

        //mortgage formula
        double mortgagePayment = principal * (
            (monthlyInterest * (Math.pow(1 + monthlyInterest, termInMonths))) /
            ((Math.pow(1 + monthlyInterest, termInMonths)) - 1)
        );

        //GUI to display result
        String payment = NumberFormat.getCurrencyInstance().format(mortgagePayment);
        JOptionPane.showMessageDialog(null, "Monthly payment: " + payment);
    }
}
