package com.yash.Day8;

public class MaxProductOfThree {
    public static void main(String[] args) {

    }
    public int maximumProduct(int[] nums) {
        int min1, min2, max1, max2, max3;
        min1 = min2 = Integer.MAX_VALUE;
        max1 = max2 = max3 = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(max1 < val){
                max3=max2;
                max2=max1;
                max1=val;
            } else if(max2 < val){
                max3 = max2;
                max2 = val;
            } else if(max3 < val){
                max3 = val;
            }

            if(min1 > val){
                min2 = min1;
                min1 = val;
            } else if(min2 > nums[i]){
                min2 = val;
            }
        }
        return Math.max(max1 * max2 * max3 , min1 * min2 * max1);
    }
}
