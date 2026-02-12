import java.util.Scanner;

public class TaxCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter order amount: ");
        double orderAmount = scanner.nextDouble();

        System.out.print("Enter state: ");
        String state = scanner.next();

        // Calculate tax based on the state
        double taxRate = getTaxRate(state);
        double taxAmount = orderAmount * taxRate;

        System.out.printf("Tax amount for state %s on order amount %.2f is: %.2f\n", state, orderAmount, taxAmount);

        scanner.close();
    }

    private static double getTaxRate(String state) {
        switch (state.toLowerCase()) {
            case "ca":
                return 0.075; // California 7.5%
            case "ny":
                return 0.04; // New York 4%
            // Add more states and their tax rates here
            default:
                return 0.0; // No tax
        }
    }
}