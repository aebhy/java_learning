package Conditionals;
import java.util.*;
public class age {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the age :");
    int age_factor= sc.nextInt();

    // Condition checking for the age group
    if ( age_factor >= 18 ) {
        System.out.println("Adult");

    }

        else 
        {
            System.out.println("Not adult");
        }

        sc.close();
}

}