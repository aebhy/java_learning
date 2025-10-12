package loops;
import java.util.*;


public class even_number {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            
        System.out.println("the numbers are : ");

        for ( int counter = 2  ; counter <= n ; counter=counter +1)
        {
            int plexer = counter % 2 ; 
            if ( plexer == 0 )
            {

             System.out.println(counter);
              } 
         
        }
    
        sc.close();
    }
    

}
