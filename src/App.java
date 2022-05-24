import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //GUI user input for loan amount
        int principal = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter loan amount. "));
        
        //GUI user input for interest rate
        double interest = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter interest rate. "));
        
        //GUI user input for length of loan in years
        int years = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter loan term in years. "));
        
    }
}
