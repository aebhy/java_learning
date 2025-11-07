import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int originalNum = num;
        int sum = 0;
        
        while (num != 0) {
            int digit = num % 10;          // Get last digit
            sum += digit * digit * digit;  // Cube the digit and add to sum
            num = num / 10;                // Remove last digit
        }
        
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
        
        sc.close();
    }
}
