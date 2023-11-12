import java.util.Scanner;

public class RemoveDuplicates {
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
    
        int j = 0;
        int count = 1;
    
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] == nums[i]) {
                if (count < 2) {
                    nums[++j] = nums[i];
                }
                count++;
            } else {
                nums[++j] = nums[i];
                count = 1;
            }
        }
        return j + 1;
    }
    
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Array size");
        int size = sc.nextInt();
        
        int[] nums = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int lengthAfterRemovingDuplicates = removeDuplicates(nums);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < lengthAfterRemovingDuplicates; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
