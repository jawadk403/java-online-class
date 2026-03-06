import java.util.Scanner;

public class onlineassign_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for matrix dimension
        System.out.print("Enter the dimension of the square matrix: ");
        int n = sc.nextInt();

        // Create matrix
        int[][] matrix = new int[n][n];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display the matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate and display row sums
        System.out.println("\nSum of each row:");
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + i + ": " + rowSum);
        }

        // Calculate and display column sums
        System.out.println("\nSum of each column:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + j + ": " + colSum);
        }

        // Calculate and display main diagonal sum
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += matrix[i][i];
        }
        System.out.println("\nSum of main diagonal elements: " + diagonalSum);

        // Calculate and display reverse diagonal sum
        int reverseDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            reverseDiagonalSum += matrix[i][n - 1 - i];
        }
        System.out.println("Sum of reverse diagonal elements: " + reverseDiagonalSum);

        sc.close();
    }
}
