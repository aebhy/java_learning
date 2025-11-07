import java.util.Scanner;

public class SpecialNumber {
    
    // Method to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int originalNum = num;
        int sum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            sum += factorial(digit); // Add factorial of digit
            num = num / 10;
        }
        
        if (sum == originalNum) {
            System.out.println(originalNum + " is a special number.");
        } else {
            System.out.println(originalNum + " is not a special number.");
        }
        
        sc.close();
    }
}
