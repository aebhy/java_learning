package loops;
import java.util.*;

public class prime_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number : ");
        int n = sc.nextInt();

        if (n  % n ==0 ) 
        {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }


        sc.close();
    }
}
