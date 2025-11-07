import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int reverse = 0;
        int temp = num;
        
        while (temp != 0) {
            int digit = temp % 10;   // Get last digit
            reverse = reverse * 10 + digit; // Add it to reverse
            temp = temp / 10;        // Remove last digit
        }
        
        System.out.println("Reverse of " + num + " is: " + reverse);
        
        sc.close();
    }
}
