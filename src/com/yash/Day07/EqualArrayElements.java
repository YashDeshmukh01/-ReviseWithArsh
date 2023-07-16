package com.yash.Day07;

public class EqualArrayElements {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(minMoves(nums));
    }
    public static int minMoves(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            min  = Math.min(min, i);
            sum+=i;
        }
        return (sum-n*min);
    }
}
