import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input marks
        System.out.print("Enter marks of subject 1: ");
        int marks1 = sc.nextInt();
        
        System.out.print("Enter marks of subject 2: ");
        int marks2 = sc.nextInt();
        
        System.out.print("Enter marks of subject 3: ");
        int marks3 = sc.nextInt();
        
        // Calculate total
        int total = marks1 + marks2 + marks3;
        
        // Calculate percentage
        double percentage = (total / 3.0);  // divide by 3 for 3 subjects
        
        // Determine grade
        char grade;
        if (percentage >= 80) {
            grade = 'A';
        } else if (percentage >= 60) {
            grade = 'B';
        } else if (percentage >= 40) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        
        // Display results
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
}
