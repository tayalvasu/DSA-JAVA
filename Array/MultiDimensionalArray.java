import java.util.Scanner;

public class MultiDimensionalArray {

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong Input! Addition not possible");
            return;
        }
        int[][] sum = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i] [j];
            }
        }
        System.out.println("Sum of matrix1 and matrix2");
        printMatrix(sum);
    }

    // static void multiply(int[][] a,int r1, int c1, int[][] b,int r2,int c2) {
    //     if(c1 != r2) {
    //         System.out.println("Multiplication not possible - wrong dimensions");
    //         return;
    //     }
    //     int[][] mul  = new int[r1] [c1];

    //     for(int i=0;i<r1;i++) {
    //         for(int j=0;j<c2;j++) {
    //             for(int k=0;k<c1;k++) {
    //             mul[i][j] += (a[i][k] * b[k][j]); 
    //             }
    //         }
    //     }
    //     System.out.println("Multiplication of 2 matrices");
    //     printMatrix(mul);
    // }
    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication not possible - wrong dimensions");
            return;
        }
        
        int[][] mul = new int[r1][c2]; // Corrected dimensions
    
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of 2 matrices");
        printMatrix(mul);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r1 = sc.nextInt();
        System.out.println("Enter number of columns");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];

        System.out.println("Enter matrix values");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows");
        int r2 = sc.nextInt();
        System.out.println("Enter number of columns");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];

        System.out.println("Enter matrix values");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix1");
        printMatrix(a);
        System.out.println("Matrix 2");
        printMatrix(b);

        multiply(a, r1, c1, b, r2, c2);

        // add(a, r1, c1, b, r2, c2);
        // printMatrix(a);

        // System.out.println("Enter" + r * c + "elements");

        // for (int i = 0; i < r; i++) {
        // for (int j = 0; j < c; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // printMatrix(arr);
        sc.close();
    }
}
