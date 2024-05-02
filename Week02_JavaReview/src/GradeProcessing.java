/** Programmer; Sai Rangineeni
 // File name; GradeProcessing
 // Description:  This program will read student input from a file and offer a menu.
 // Date; 1/16/2024
 // Version - 1.3 (1/23/2024)
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeProcessing {

    // Main method
    public static void main(String[] args){
        // Program description
        programDescription();

        // Declare variables
        int choice;
        ArrayList<String> data = null;
        String[] names = null;
        double[][] exams = null;
        double[] averages = null;
        String[] grades = null;

        // Process data using a loop
        do {
            choice = printMenu();
            System.out.println("Main: " + choice);

            // Switch statement to handle user's choice
            switch (choice){
                case 1: // Read file
                    data = readFile();
                    break;
                case 2: // Extract data
                    if (data != null) {
                        names = new String[data.size()];
                        exams = new double[data.size()][];
                        extractData(data, names, exams);
                    } else {
                        System.out.println("Please complete option 1 first.");
                    }
                    break;
                case 3: // Display input data
                    if (names != null && exams != null) {
                        displayInputData(names, exams);
                    } else {
                        System.out.println("Please complete option 2 first.");
                    }
                    break;
                case 4: // Calculate averages
                    if (exams != null) {
                        averages = calcAverages(exams);
                    } else {
                        System.out.println("Please complete option 2 first.");
                    }
                    break;
                case 5: // Get letter grades
                    if (averages != null) {
                        grades = getLetterGrades(averages);
                    } else {
                        System.out.println("Please complete option 4 first.");
                    }
                    break;
                case 6: // Display results
                    if (names != null && averages != null && grades != null) {
                        displayResults(names, averages, grades);
                    } else {
                        System.out.println("Please complete options 1 through 5 first.");
                    }
                    break;
                case 7: // Write results to a file
                    if (grades != null) {
                        writeResults(names, averages, grades);
                    } else {
                        System.out.println("Must process all data in options 1 through 6 first.");
                    }
                    break;
                case 0: // Quit
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        } while(choice != 0);
    }

    // Method to print program description
    public static void programDescription() {
        System.out.println("This program will read student input from a file and offer a menu.");
    }

    // Method to print the menu and get a valid choice
    public static int printMenu() {
        Scanner scan = new Scanner(System.in);
        int choice;
        // Display menu and validate input
        do {
            System.out.println("\nChoose one of the following options:");
            System.out.println("1 - Read contents from file");
            System.out.println("2 - Extract student names and grades");
            System.out.println("3 - Display student names and grades in table format");
            System.out.println("4 - Calculate student averages");
            System.out.println("5 - Determine letter grades");
            System.out.println("6 - Display student names, averages, and letter grades");
            System.out.println("7 - Write results to a file");
            System.out.println("0 - Exit");
            System.out.println("Enter your choice:");
            choice = scan.nextInt();
        } while (choice < 0 || choice > 7);
        return choice;
    }

    // Method to read file and return data as ArrayList
    public static ArrayList<String> readFile() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<>();
        // Ask for filename and read file content
        System.out.print("Enter name of input file: ");
        String filename = scan.next();
        try {
            File file = new File(filename);
            Scanner fileIn = new Scanner(file);
            while (fileIn.hasNextLine()) {
                data.add(fileIn.nextLine());
            }
            fileIn.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Input file not found. Try again.");
        }
        return data;
    }

    // Method to extract data into names and exams arrays
    public static void extractData(ArrayList<String> data, String[] names, double[][] exams) {
        for (int i = 0; i < data.size(); i++) {
            Scanner dataIn = new Scanner(data.get(i));
            names[i] = dataIn.next();
            exams[i] = new double[4];
            for (int j = 0; j < exams[i].length; j++) {
                if (dataIn.hasNextDouble()) {
                    exams[i][j] = dataIn.nextDouble();
                }
            }
            dataIn.close();
        }
    }

    // Method to display input data in table format
    public static void displayInputData(String[] names, double[][] exams) {
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-10s", names[i]);
            for (int j = 0; j < exams[i].length; j++) {
                System.out.printf("%10.1f", exams[i][j]);
            }
            System.out.println();
        }
    }

    // Method to calculate and return averages
    public static double[] calcAverages(double[][] exams) {
        double[] avgs = new double[exams.length];
        for (int i = 0; i < exams.length; i++) {
            double sum = 0;
            for (int j = 0; j < exams[i].length; j++) {
                sum += exams[i][j];
            }
            avgs[i] = sum / exams[i].length;
        }
        return avgs;
    }

    // Method to determine and return letter grades based on averages
    public static String[] getLetterGrades(double[] averages) {
        String[] grades = new String[averages.length];
        for (int i = 0; i < averages.length; i++) {
            grades[i] = convertToGrade(averages[i]);
        }
        return grades;
    }

    // Helper method to convert average to letter grade
    private static String convertToGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }

    // Method to display results in table format
    public static void displayResults(String[] names, double[] averages, String[] grades) {
        System.out.println("\nName    Average Grade");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-10s%8.2f    %s\n", names[i], averages[i], grades[i]);
        }
    }

    // Method to write results to a file
    public static void writeResults(String[] names, double[] averages, String[] grades) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name of output file: ");
        String filename = scan.next();
        try {
            PrintWriter writer = new PrintWriter(filename);
            writer.println("Name, Average, Grade");
            for (int i = 0; i < names.length; i++) {
                writer.printf("%s, %.2f, %s%n", names[i], averages[i], grades[i]);
            }
            writer.close();
            System.out.println("Results written to " + filename);
        } catch (FileNotFoundException ex) {
            System.out.println("Error writing to file. Try again.");
        }
    }
}

/**
 This program will read student input from a file and offer a menu.

 Choose one of the following options:
 1 - Read contents from file
 2 - Extract student names and grades
 3 - Display student names and grades in table format
 4 - Calculate student averages
 5 - Determine letter grades
 6 - Display student names, averages, and letter grades
 7 - Write results to a file
 0 - Exit
 Enter your choice:
 1
 Main: 1
 Enter name of input file: src/studInfo.txt

 Choose one of the following options:
 1 - Read contents from file
 2 - Extract student names and grades
 3 - Display student names and grades in table format
 4 - Calculate student averages
 5 - Determine letter grades
 6 - Display student names, averages, and letter grades
 7 - Write results to a file
 0 - Exit
 Enter your choice:
 2
 Main: 2

 Choose one of the following options:
 1 - Read contents from file
 2 - Extract student names and grades
 3 - Display student names and grades in table format
 4 - Calculate student averages
 5 - Determine letter grades
 6 - Display student names, averages, and letter grades
 7 - Write results to a file
 0 - Exit
 Enter your choice:
 3
 Main: 3
 Smith           70.0      70.0      80.0      75.0
 Jones           80.0      76.0      98.0      82.0
 Wilson          90.0      77.0      85.0      88.0
 Michaels        77.0      80.0      30.0      55.0
 Gray            60.0      70.0      62.0      76.0
 Thomas          60.0      60.0      50.0      65.0

 Choose one of the following options:
 1 - Read contents from file
 2 - Extract student names and grades
 3 - Display student names and grades in table format
 4 - Calculate student averages
 5 - Determine letter grades
 6 - Display student names, averages, and letter grades
 7 - Write results to a file
 0 - Exit
 Enter your choice:
 4
 Main: 4

 Choose one of the following options:
 1 - Read contents from file
 2 - Extract student names and grades
 3 - Display student names and grades in table format
 4 - Calculate student averages
 5 - Determine letter grades
 6 - Display student names, averages, and letter grades
 7 - Write results to a file
 0 - Exit
 Enter your choice:
 5
 Main: 5

 Choose one of the following options:
 1 - Read contents from file
 2 - Extract student names and grades
 3 - Display student names and grades in table format
 4 - Calculate student averages
 5 - Determine letter grades
 6 - Display student names, averages, and letter grades
 7 - Write results to a file
 0 - Exit
 Enter your choice:
 6
 Main: 6

 Name    Average Grade
 Smith        73.75    C
 Jones        84.00    B
 Wilson       85.00    B
 Michaels     60.50    D
 Gray         67.00    D
 Thomas       58.75    F

 Choose one of the following options:
 1 - Read contents from file
 2 - Extract student names and grades
 3 - Display student names and grades in table format
 4 - Calculate student averages
 5 - Determine letter grades
 6 - Display student names, averages, and letter grades
 7 - Write results to a file
 0 - Exit
 Enter your choice:
 7
 Main: 7
 Enter name of output file: src/studInfo.txt
 Results written to src/studInfo.txt

 Choose one of the following options:
 1 - Read contents from file
 2 - Extract student names and grades
 3 - Display student names and grades in table format
 4 - Calculate student averages
 5 - Determine letter grades
 6 - Display student names, averages, and letter grades
 7 - Write results to a file
 0 - Exit
 Enter your choice:

 */