package com.yash.Day14;

public class ArrPairDiff {
    public static void main (String[] args)
    {
        int arr[] = {1, 8, 30, 40, 100};
        int n = -60;
        findPair(arr,n);
    }

    private static boolean findPair(int[] arr, int n) {
        if(n<0){
            n*=-1;
        }
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            if (arr[e] - arr[s] == n){
                System.out.println(arr[e]+" "+arr[s]);
                return true;
            }
            else if (arr[e] - arr[s] < n) {
                e--;
            }
            else {
                s++;
            }
        }
        return false;
    }
}
