import java.util.Arrays;
import java.util.Scanner;

public class Intersection {
    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (index == 0 || result[index - 1] != nums1[i]) {
                    result[index++] = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(result, index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array 1:");
        int size1 = sc.nextInt();
        int[] nums1 = new int[size1];
        System.out.println("Enter array 1 elements:");
        for (int i = 0; i < size1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of array 2:");
        int size2 = sc.nextInt();
        int[] nums2 = new int[size2];
        System.out.println("Enter array 2 elements:");
        for (int i = 0; i < size2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] result = intersection(nums1, nums2);
        System.out.println("Intersection of the arrays: " + Arrays.toString(result));

        sc.close();
    }
}
