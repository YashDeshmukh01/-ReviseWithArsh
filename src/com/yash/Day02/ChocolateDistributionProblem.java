package com.yash.Day02;

import java.util.Arrays;

//Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3
//        Output: Minimum Difference is 2
//        Explanation:
//        We have seven packets of chocolates and we need to pick three packets for 3 students
//        If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.
public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int n = arr.length;
        int m = 3;
        System.out.println(ChocalateMin(arr,m,n));
    }
    static int ChocalateMin(int[] arr, int m ,int n){
        Arrays.sort(arr);
        if (m == 0 || n == 0)
            return 0;

        if (n < m) return -1;

        int min_diff = Integer.MAX_VALUE;
        for(int i = 0; i+m-1<n; i++){
            int diff = arr[i+m-1]-arr[i];
            if (diff<min_diff) {
                min_diff = diff;
            }
        }
        return min_diff;
    }
}
