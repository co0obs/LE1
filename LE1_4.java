import javax.swing.JOptionPane;

public class LE1_4{

    public static void main(String[] args) {
        double x1 = getInput("Enter x1:");
        double y1 = getInput("Enter y1:");
        double x2 = getInput("Enter x2:");
        double y2 = getInput("Enter y2:");

        double distance = calculateDistance(x1, y1, x2, y2);

        String result = formatResult(distance);
        displayResult(result);

        System.exit(0);
    }

    // input
    public static double getInput(String message) {
        String input = JOptionPane.showInputDialog(message);
        return Double.parseDouble(input);
    }

    // calculate distance
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // format result string
    public static String formatResult(double distance) {
        return "The distance between the two points is " + distance;
    }

    // display result
    public static void displayResult(String result) {
        JOptionPane.showMessageDialog(null, result);
    }
}
