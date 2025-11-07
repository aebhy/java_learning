import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter base x: ");
        int x = sc.nextInt();
        
        System.out.print("Enter exponent y: ");
        int y = sc.nextInt();
        
        long result = 1; // Use long in case result is large
        
        if (y >= 0) {
            for (int i = 1; i <= y; i++) {
                result *= x;
            }
            System.out.println(x + " raised to " + y + " is: " + result);
        } else {
            // For negative exponents
            for (int i = 1; i <= -y; i++) {
                result = result * x;
            }
            System.out.println(x + " raised to " + y + " is: " + (1.0 / result));
        }
        
        sc.close();
    }
}
