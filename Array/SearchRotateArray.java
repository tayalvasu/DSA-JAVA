import java.util.Scanner;

public class SearchRotateArray {
        static int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
    
                if (nums[mid] == target) {
                    return mid;
                }
    
                if (nums[left] <= nums[mid]) {
                    if (target >= nums[left] && target < nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    if (target > nums[mid] && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
    
            return -1;
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get array size
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Create an array
        int[] nums = new int[size];

        // Populate the array
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        // Get the target value
        System.out.println("Enter Target value:");
        int target = sc.nextInt();

        // Call the search method
        int result = search(nums, target);

        // Display the result
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }

        sc.close();

    }
}
