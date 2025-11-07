import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // compare strings
        if (str1.compareTo(str2) > 0) {
            System.out.println("Alphabetically greater string: " + str1);
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("Alphabetically greater string: " + str2);
        } else {
            System.out.println("Both strings are equal.");
        }

        sc.close();
    }
}
