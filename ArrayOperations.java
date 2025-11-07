import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        // Input 10 numbers
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // a) Sum of all elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of all elements: " + sum);

        // b) Largest element
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest element: " + largest);

        // c) Reverse the array
        System.out.print("Array in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // d) Search for a number
        System.out.print("Enter a number to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int num : arr) {
            if (num == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " is present in the array.");
        } else {
            System.out.println(search + " is not present in the array.");
        }

        sc.close();
    }
}
