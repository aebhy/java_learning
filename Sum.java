import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first_num = sc.nextInt();
        System.out.print("Enter second number: ");
        int second_num = sc.nextInt();

        int result = first_num + second_num;
        System.out.println("Sum: " + result);
   
        sc.close();
    }

}
