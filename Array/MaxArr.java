public class MaxArr {
    
    void maxOfArray() {
        int[] arr = {10,85,40,85,60,74,99,30,44};

        int ans = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println("Max " + ans);
    }
    public static void main(String[] args) {
        MaxArr obj = new MaxArr();
        obj.maxOfArray();
    }
}
