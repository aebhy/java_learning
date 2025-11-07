import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        double sum = 0.0;
        
        for (int i = 1; i <= n; i++) {
            sum += (double) i / (i + 1); // Add i/(i+1) to sum
        }
        
        System.out.println("Sum of the series 1/2 + 2/3 + ... + " + n + "/" + (n+1) + " is: " + sum);
        
        sc.close();
    }
}
