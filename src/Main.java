import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //check customer weekly income provided
        System.out.print("Enter your weekly income: $");

        Scanner scanner = new Scanner(System.in);


        //Get weekly income from command-line from customer
        double income;
        try {
            income = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid. Please provide a valid income.");
            return;
        } finally {
            scanner.close();
        }

        //Calculate tax rate based on customer weekly earnings.
        double taxRate;
        if (income < 500) {
            taxRate = 0.10; //Income under 500 is taxed at 10%
        } else if (income < 1500) {
            taxRate = 0.15; //Income is taxed at 15% between 500 and 1499.99
        } else if (income < 2500) {
            taxRate = 0.20; //Income is taxed at 20% between 1500 and 2499.99
        } else {
            taxRate = 0.30; //Income is taxed at 30% for 2500 and greater.
        }

        // Calculate tax and average tax withholding
        double taxAmount = income * taxRate;


        // Displays the average withholding
        System.out.printf("Weekly average tax withholding: $%.2f%n", taxAmount);
    }
}