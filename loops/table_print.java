package loops;
import java.util.*;

public class table_print {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
       System.out.println("Enter input number :");
        int n = sc.nextInt();
        for ( int counter = 1; counter<11 ; counter = counter +1) {
        
        System.out.println(n*counter);
        }
        sc.close();

    }
}

