package com.yash.Day20;

public class NextGreaterElementI {
    public static void main(String[] args) {

    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i=0; i < nums1.length; i++){
            int j = nums2.length-1;
            int ptr = -1;
            while(j!=0 && nums1[i]!=nums2[j]){
                if(nums2[j]>nums1[i]){
                    ptr = nums2[j];
                }
                j--;
            }
            ans[i] = ptr;
        }
        return ans;
    }
}
