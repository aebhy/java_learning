import java.util.Scanner;

public class MagicSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (n x n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // Input matrix
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate sum of first row (reference sum)
        int magicSum = 0;
        for (int j = 0; j < n; j++) {
            magicSum += matrix[0][j];
        }

        boolean isMagic = true;

        // Check sum of each row
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                isMagic = false;
                break;
            }
        }

        // Check sum of each column
        if (isMagic) {
            for (int j = 0; j < n; j++) {
                int colSum = 0;
                for (int i = 0; i < n; i++) {
                    colSum += matrix[i][j];
                }
                if (colSum != magicSum) {
                    isMagic = false;
                    break;
                }
            }
        }

        // Check main diagonal
        if (isMagic) {
            int diag1 = 0;
            for (int i = 0; i < n; i++) {
                diag1 += matrix[i][i];
            }
            if (diag1 != magicSum) {
                isMagic = false;
            }
        }

        // Check secondary diagonal
        if (isMagic) {
            int diag2 = 0;
            for (int i = 0; i < n; i++) {
                diag2 += matrix[i][n - 1 - i];
            }
            if (diag2 != magicSum) {
                isMagic = false;
            }
        }

        // Final result
        if (isMagic) {
            System.out.println("The matrix is a Magic Square.");
        } else {
            System.out.println("The matrix is NOT a Magic Square.");
        }

        sc.close();
    }
}
