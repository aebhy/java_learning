import java.util.Scanner;

public class SeriesSumexp {
    
    // Method to calculate factorial
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        double sum = 0.0;
        
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i) / factorial(i); // Add x^i / i! to sum
        }
        
        System.out.println("Sum of the series is: " + sum);
        
        sc.close();
    }
}
