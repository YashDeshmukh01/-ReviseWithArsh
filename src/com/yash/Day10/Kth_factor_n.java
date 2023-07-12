package com.yash.Day10;

public class Kth_factor_n {
    public static void main(String[] args) {

    }
    public int kthFactor(int n, int k) {
        int count = 1;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                if(count == k){
                    return i;
                }
                count++;
            }
        }
        return -1;
    }
}
