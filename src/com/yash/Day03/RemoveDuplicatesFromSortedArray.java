package com.yash.Day03;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
