public class ReverseArray {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // static int[] changeArray(int[] arr) {
    //     int n = arr.length;
    //     int[] ans = new int[n];
    //     int j = 0;

    //     // traverse orignal array in reverse direction
    //     for (int i = n - 1; i >= 0; i--) {
    //         ans[j++] = arr[i];
    //     }
    //     return ans;
    // }

    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArrayWithSwap(int[] arr) {
        int i = 0,j = arr.length - 1;

        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5,6 };
        // int[] ans = changeArray(arr);
        reverseArrayWithSwap(arr);
        printArray(arr);
    }
}
