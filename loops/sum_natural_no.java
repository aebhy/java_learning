package loops;
import java.util.*;

public class sum_natural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input : ");
        int user_input = sc.nextInt();
        int sum = 0 ;
        for (int counter = 1 ; counter<=user_input ; counter ++)
        {
            sum = sum + counter ;
        }
        
        System.out.println(sum);

        sc.close();
    }
}
