import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("--- CodeAlpha Student Grade Tracker ---");
        System.out.println("Enter student grades (Enter -1 to finish):");

        while (true) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            
            if (grade == -1) {
                break;
            }
            
            if (grade >= 0 && grade <= 100) {
                grades.add(grade);
            } else {
                System.out.println("Invalid grade! Please enter a value between 0 and 100.");
            }
        }

        if (grades.isEmpty()) {
            System.out.println("No grades were entered.");
        } else {
            // Calculate Average, Highest, and Lowest
            int sum = 0;
            for (int g : grades) {
                sum += g;
            }
            double average = (double) sum / grades.size();
            int highest = Collections.max(grades);
            int lowest = Collections.min(grades);

            // Display Results
            System.out.println("\n--- Summary Report ---");
            System.out.println("Total Students: " + grades.size());
            System.out.printf("Average Score: %.2f\n", average);
            System.out.println("Highest Score: " + highest);
            System.out.println("Lowest Score: " + lowest);
        }
        scanner.close();
    }
}