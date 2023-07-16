package com.yash.Day14;

public class CeilingAndFloor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int n = arr.length;
        int x = 8;
        int index = ceilSearch(arr, 0, n - 1, x);
        if (index == -1)
            System.out.println("Ceiling of " + x + " doesn't exist in array");
        else
            System.out.println("ceiling of " + x + " is " + arr[index]);
    }

    private static int ceilSearch(int[] arr, int i, int i1, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]){
                start = mid+1;
            } else {
                return mid+1;
            }
        }
        return -1;
    }
}
