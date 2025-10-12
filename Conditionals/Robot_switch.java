package Conditionals;
import java.util.*;

public class Robot_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter the input: ");        
        int button = sc.nextInt();
        switch(button) {
            case 1 : 
                System.out.println("Hello");
                break;
            
            case 2 :
            System.out.println("Namaste");
            break;

            case 3 :
            System.out.println("Bonjour");
            break;

            default :
            System.out.println("Invalid input");

        }

        sc.close();
    }
    
}
