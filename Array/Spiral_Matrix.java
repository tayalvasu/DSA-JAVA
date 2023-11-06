import java.util.Scanner;

public class Spiral_Matrix {
    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void PrintSpiralOrder(int[][] matrix, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalelements = 0;
        while (totalelements < r * c) {
            for (int j = leftCol; j <= rightCol; j++) {
                System.out.print(matrix[topRow][j] + " "); // Include a space between elements.
                totalelements++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalelements++;
            }
            rightCol--;
            if (topRow <= bottomRow) {
                for (int j = rightCol; j >= leftCol; j--) {
                    System.out.print(matrix[bottomRow][j] + " ");
                    totalelements++;
                }
                bottomRow--;
            }
            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    System.out.print(matrix[i][leftCol] + " ");
                    totalelements++;
                }
                leftCol++;
            }
        }
        System.out.println(); // Add a newline after printing the spiral order.
    }
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalelemnts = r * c;
        System.out.println("Enter " + totalelemnts + " values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix");
        printMatrix(matrix);

        System.out.println("Spiral Order");
        PrintSpiralOrder(matrix, r, c);
        sc.close();
    }
}
