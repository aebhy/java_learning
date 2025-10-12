package loops ; 
import java.util.*;

public class student_report {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int otp_check= sc.nextInt();
        
        int user_input = 0;
        do {
            System.out.println("Enter marks : ");
            user_input = sc.nextInt();
            
            System.out.println(user_input);

        } while ( otp_check == 1);

        if (otp_check == 0 ) {
            System.out.println("Exiting the program");
            
        }

        int result = 0;
        result = result + user_input ;
        sc.close();
    }
}