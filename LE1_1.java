import javax.swing.JOptionPane;

public class LE1_1{

    public static void main(String[] args){
        int amount = getInput();

        if(!isValidAmount(amount)){
            JOptionPane.showMessageDialog(null, "Invalid amount! Please enter between 1 and 99.");
            System.exit(0);
        }

        String result = computeChange(amount);
        displayResult(result);

        System.exit(0);
    }

    // method to get input from user
    public static int getInput(){
        String input = JOptionPane.showInputDialog("Enter amount (from 1 - 99 cents):");
        return Integer.parseInt(input);
    }

    // method to check if input is valid
    public static boolean isValidAmount(int amount){
        return amount >= 1 && amount <= 99;
    }

    // compute change method
    public static String computeChange(int amount){
        int quarters = amount / 25;
        amount %= 25;

        int dimes = amount / 10;
        amount %= 10;

        int nickels = amount / 5;
        amount %= 5;

        int pennies = amount;

        return "Your change is:\n"
                + quarters + " quarter(s)\n"
                + dimes + " dime(s)\n"
                + nickels + " nickel(s)\n"
                + pennies + " penn(ies)";
    }

    // display result
    public static void displayResult(String result){
        JOptionPane.showMessageDialog(null, result);
    }
}
