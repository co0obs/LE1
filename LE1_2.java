import javax.swing.JOptionPane;

public class LE1_2{

    public static void main(String[] args){
        int number = getInput();

        if(!isValidNumber(number)){
            JOptionPane.showMessageDialog(null, "Invalid number! Please enter between 0 and 1000.");
            System.exit(0);
        }

        String result = processNumber(number);
        displayResult(result);

        System.exit(0);
    }

    // input
    public static int getInput(){
        String input = JOptionPane.showInputDialog("Enter a number between 0 and 1000:");
        return Integer.parseInt(input);
    }

    // validate
    public static boolean isValidNumber(int number){
        return number >= 0 && number <= 1000;
    }

    // method to process number
    public static String processNumber(int number){
        int original = number;
        int product = 1;
        String digits = "";

        while(number > 0){
            int digit = number % 10;
            digits = digit + "\n" + digits; 
            product *= digit;
            number /= 10;
        }

        return digits + "\nThe product of all digits in " + original + " is " + product;
    }

    // display result
    public static void displayResult(String result){
        JOptionPane.showMessageDialog(null, result);
    }
}
