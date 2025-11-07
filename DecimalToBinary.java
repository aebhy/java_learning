import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        int[] binary = new int[32]; // Array to store binary digits
        int index = 0;

        int temp = num;

        // Convert decimal to binary
        while (temp > 0) {
            binary[index] = temp % 2; // Store remainder (0 or 1)
            temp = temp / 2;
            index++;
        }

        // Print binary number in reverse order
        System.out.print("Binary equivalent of " + num + " is: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }

        sc.close();
    }
}
