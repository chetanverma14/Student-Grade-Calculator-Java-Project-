import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();
        int[] marks = new int[numSubjects];
        
        // Input: Take marks obtained in each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate Total Marks: Sum up the marks obtained in all subjects
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate Average Percentage: Divide the total marks by the total number of subjects
        double averagePercentage = (double) totalMarks / numSubjects;

        // Grade Calculation: Assign grades based on the average percentage achieved
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display Results: Show the total marks, average percentage, and the corresponding grade
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
