import java.util.Scanner;

public class TablesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input range
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        // Generate tables for each number in range
        for (int i = start; i <= end; i++) {
            System.out.println("\nTable of " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        sc.close();
    }
}
