import java.util.Scanner;

public class NumberToWords {
    // Arrays to map digits to words
    private static final String[] units = { "Zero", "One", "Two", "Three", "Four", 
                                            "Five", "Six", "Seven", "Eight", "Nine" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // handle negative numbers
        if (num < 0) {
            System.out.print("Minus ");
            num = -num;
        }

        // convert number to words by processing digits
        String result = convertToWords(num);
        System.out.println("In words: " + result);

        sc.close();
    }

    public static String convertToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(num);

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0'; // convert char to int
            sb.append(units[digit]).append(" ");
        }

        return sb.toString().trim();
    }
}
