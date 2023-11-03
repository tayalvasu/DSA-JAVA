import java.util.Scanner;

public class MaxndMinArray {
    public static long findsum(int A[]) {
        int minval = Integer.MAX_VALUE;
        int maxval = Integer.MIN_VALUE;

        for (int num:A) {
            if(num<minval) {
                minval=num;
            }
            if(num>maxval) {
                maxval=num;
            }
        }
        long sum = minval+maxval;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        long result = findsum(arr);
        System.out.println("Sum:"+ result);
        sc.close();
    }
}
