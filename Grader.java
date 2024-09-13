import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
      //Accept user input eliminating errors
        Scanner scanner = new Scanner(System.in);
        int scan = 0;

        while (true) {
            System.out.println("Enter marks (numbers only):");
            if (scanner.hasNextInt()) {
                scan = scanner.nextInt();
                break;  
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();  
            }
        }
        // Evaluating the marks according to the provided criteria
        if (marks >= 90 && marks <= 100) {
            System.out.println("Evaluation: Excellent");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Evaluation: Very Good");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Evaluation: Good");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Evaluation: Medium");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Evaluation: Pass");
        } else if (marks >= 0 && marks <= 49) {
            System.out.println("Evaluation: Fail");
        }

        // Close the scanner
        scanner.close();
    }
}
