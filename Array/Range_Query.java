import java.util.Scanner;

public class Range_Query {
    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;
        int[] prefSum = new int[n];
        prefSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefSum[i] = prefSum[i - 1] + arr[i];
        }
        return prefSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefSum = makePrefixSumArray(arr);

        System.out.println("Enter number of queries");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            // int ans = (l > 0) ? prefSum[r] - prefSum[l - 1] : prefSum[r];
            int ans = prefSum[r] - prefSum[l-1];

            System.out.println("Sum: " + ans);
        }
        sc.close();
    }
}
