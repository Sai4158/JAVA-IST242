/**
 * File name: SavingsAccount.java
 * Description: A Java program that computes investment earnings based on user inputs.
 * Assignment: IST 140 M01 - W01 Java Review
 * Author: Sai Rangineeni
 * Version: 1.02 - Date: 1/11/2024
 */

import java.util.Scanner;

public class SavingsAccount {
    public static void main(String[] args) {
        // Double variable
        double initialInvestment = 0.0;
        double interestRate = 0.0;

        // Variable
        int years = 0;
        int choice;

       //Scanner
        Scanner sc = new Scanner(System.in);

        //Menu options to the user
        do {
            System.out.println("Welcome to the Investment Calculator");
            System.out.println("Please select an option:");
            System.out.println("1. Change Initial Investment");
            System.out.println("2. Change Interest Rate");
            System.out.println("3. Calculate Earnings");
            System.out.println("4. Quit");
            System.out.print(">> ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Input and update initial investment
                    System.out.print("Enter the new initial amount of money invested: ");
                    initialInvestment = sc.nextDouble();
                    System.out.printf("Initial investment changed to $%.2f\n", initialInvestment);
                    break;
                case 2:
                    // Input and update annual interest rate
                    System.out.print("Enter the new annual interest rate (as a decimal): ");
                    interestRate = sc.nextDouble() /100;
                    System.out.printf("Interest rate changed to %.2f%%\n", interestRate * 100);
                    break;
                case 3:
                    // Calculate totalEarnings using the interest rate and time
                    System.out.print("Enter the number of years the money will be invested: ");
                    years = sc.nextInt(); // Collect amount of years
                    // Formula for calculating total earnings
                    double totalEarnings = initialInvestment * Math.pow(1 + interestRate, years) - initialInvestment;
                    System.out.printf("The total amount of money earned is $%.2f\n", totalEarnings);
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Goodbye!");
                    break;
                default:
                    // Handle invalid input
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 4);

        sc.close(); // Closing the scanner
    }
}
/**
 TEST CASES

 Welcome to the Investment Calculator
 Please select an option:
 1. Change Initial Investment
 2. Change Interest Rate
 3. Calculate Earnings
 4. Quit
 >> 1
 Enter the new initial amount of money invested: 1000
 Initial investment changed to $1000.00
 Welcome to the Investment Calculator
 Please select an option:
 1. Change Initial Investment
 2. Change Interest Rate
 3. Calculate Earnings
 4. Quit
 >> 2
 Enter the new annual interest rate (as a decimal): 8
 Interest rate changed to 8.00%
 Welcome to the Investment Calculator
 Please select an option:
 1. Change Initial Investment
 2. Change Interest Rate
 3. Calculate Earnings
 4. Quit
 >> 3
 Enter the number of years the money will be invested: 5
 The total amount of money earned is $469.33
 Welcome to the Investment Calculator
 Please select an option:
 1. Change Initial Investment
 2. Change Interest Rate
 3. Calculate Earnings
 4. Quit
 >> 4
 Goodbye!

 Process finished with exit code 0


 */