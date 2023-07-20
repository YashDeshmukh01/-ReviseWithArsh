package com.yash.Day18;

public class MajorityElement {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        int count = 0;
        int ele = 0;
        for(int num:nums){
            if(count==0){
                ele = num;
            }
            if(num == ele){
                count++;
            } else {
                count--;
            }
        }
        return ele;
    }
}
