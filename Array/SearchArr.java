public class SearchArr {
    void SearchInArr() {
        int[] arr = { 10, 85, 40, 85, 60, 74, 99, 30, 44 };
        int x = 99;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
            }
        }
        System.out.println("Found " + x + " at index " + ans);
    }

    public static void main(String[] args) {
        SearchArr obj = new SearchArr();
        obj.SearchInArr();
    }
}
