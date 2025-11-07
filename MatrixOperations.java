import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        // Input 3x3 matrix
        System.out.println("Enter 3x3 matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // A) Sum of each row
        System.out.println("Sum of each row:");
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        // B) Sum of each column
        System.out.println("Sum of each column:");
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }

        // C) Sum of main diagonal
        int mainDiagSum = 0;
        for (int i = 0; i < 3; i++) {
            mainDiagSum += matrix[i][i];
        }
        System.out.println("Sum of main diagonal: " + mainDiagSum);

        // D) Sum of secondary diagonal
        int secDiagSum = 0;
        for (int i = 0; i < 3; i++) {
            secDiagSum += matrix[i][2 - i];
        }
        System.out.println("Sum of secondary diagonal: " + secDiagSum);

        // E) Transpose of the matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
