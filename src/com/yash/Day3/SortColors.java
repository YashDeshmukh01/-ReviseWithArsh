package com.yash.Day3;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,2,2,1,0,2};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[] nums) {
        int lo = 0;
        int mid = 0;
        int hi = nums.length-1;
        while(mid <= hi){
            switch (nums[mid]) {
                case 0 -> {
                    swap(nums, lo, mid);
                    lo++;
                    mid++;
                }
                case 1 -> {
                    mid++;
                }
                case 2 -> {
                    swap(nums, mid, hi);
                    hi--;
                }
            }
        }
    }
    public static void swap(int[] nums, int start, int end){
        int temp;
        temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
