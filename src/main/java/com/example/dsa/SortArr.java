package com.example.dsa;

public class SortArr {
    void maxOfArray() {
        int[] arr = {10,85,40,85,60,74,85,30,44};

        int ans = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println("Max " + ans);
    }
    public static void main(String[] args) {
        SortArr obj = new SortArr();
        obj.maxOfArray();
    }
}
