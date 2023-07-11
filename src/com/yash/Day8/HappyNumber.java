package com.yash.Day8;

public class HappyNumber {
    public static void main(String[] args) {

    }
    private int findSquare(int n){
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans += rem*rem;
            n/=10;
        }
        return ans;
    }
}
