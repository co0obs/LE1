import javax.swing.JOptionPane;

public class LE1_3{

    public static void main(String[] args){
        double weight = getInput("Enter your weight (in pounds):");
        double height = getInput("Enter your height (in inches):");
        double age    = getInput("Enter your age (in years):");

        double bmrWoman = calculateBmrWoman(weight, height, age);
        double bmrMan   = calculateBmrMan(weight, height, age);

        int barsForWoman = calculateChocolateBars(bmrWoman);
        int barsForMan   = calculateChocolateBars(bmrMan);

        String result = formatResult(bmrWoman, barsForWoman, bmrMan, barsForMan);
        displayResult(result);

        System.exit(0);
    }

    // input
    public static double getInput(String message){
        String input = JOptionPane.showInputDialog(message);
        return Double.parseDouble(input);
    }

    // calculate BMR for women
    public static double calculateBmrWoman(double weight, double height, double age){
        return 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
    }

    // calculate BMR for men
    public static double calculateBmrMan(double weight, double height, double age){
        return 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
    }

    // calculate chocolate bars needed
    public static int calculateChocolateBars(double bmr){
        return (int) Math.round(bmr / 230);
    }

    // format result string
    public static String formatResult(double bmrWoman, int barsWoman, double bmrMan, int barsMan){
        return "To maintain current weight:\n\n"
                + "Woman: " + bmrWoman + " calories (≈ " + barsWoman + " chocolate bars)\n"
                + "Man: " + bmrMan + " calories (≈ " + barsMan + " chocolate bars)";
    }

    // display results
    public static void displayResult(String result){
        JOptionPane.showMessageDialog(null, result);
    }
}

