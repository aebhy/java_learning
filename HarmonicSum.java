import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        double sum = 0.0; // Use double to store fractional sum
        
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i; // Add reciprocal of i
        }
        
        System.out.println("Sum of the series 1 + 1/2 + ... + 1/" + n + " is: " + sum);
        
        sc.close();
    }
}
