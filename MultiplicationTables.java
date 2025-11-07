import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        
        for (int i = start; i <= end; i++) {
            System.out.println("Multiplication table of " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Empty line for readability
        }
        
        sc.close();
    }
}
