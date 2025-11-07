import java.util.Scanner;

public class ConsNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int num = 1; // Start from 1

        for (int i = 1; i <= rows; i++) {       // Loop for rows
            for (int j = 1; j <= i; j++) {     // Print i numbers in row i
                System.out.print(num);
                num++;                          // Increment number
            }
            System.out.println();               // Move to next line
        }

        sc.close();
    }
}
