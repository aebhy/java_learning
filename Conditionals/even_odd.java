package Conditionals;

import java.util.*;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for operation(even/odd) : ");

        // implementing logic 
        int number_check= sc.nextInt();
        if ( number_check %  2 == 0 )
        {
            System.out.println("Number is even");
        }
        else 
        {
            System.out.println("not even (odd)");
        }

        sc.close();

    }
    
}
