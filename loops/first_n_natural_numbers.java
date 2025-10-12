package loops;
import java.util.*;

public class first_n_natural_numbers {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the natural number :");
    int n = sc.nextInt();
    int sum = 0;
   for(int counter=1;counter<=n ; counter=counter+1 ) {

    sum = sum +counter;
}     

System.out.println(sum);
   sc.close();

   } 
}
