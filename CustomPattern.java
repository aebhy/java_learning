import java.util.Scanner;

public class CustomPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        
        String pattern = "0"; // Start with 0
        
        for (int i = 1; i <= rows; i++) {
            System.out.println(pattern);
            pattern += i; // Append current row number to the string
        }
        
        sc.close();
    }
}
