package com.yash.Day09;

public class MissingNumber {
    public static void main(String[] args) {

    }
    public int missingNumber1(int[] nums) {
        int n = nums.length;
        int totalSum = n*(n+1)/2;
        for(int i=0;i<n;i++){
            totalSum -= nums[i];
        }
        return totalSum;
    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] checkList = new int[n+1];
        for(int num : nums){
            checkList[num]++;
        }
        for(int i = 0; i<checkList.length; i++){
            if(checkList[i]==0){
                return i;
            }
        }
        return -1;
    }
}
