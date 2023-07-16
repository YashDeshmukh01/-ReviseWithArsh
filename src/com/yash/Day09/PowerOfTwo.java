package com.yash.Day09;

public class PowerOfTwo {
    public static void main(String[] args) {

    }
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        while(n!=1){
            if(n%2 != 0) return false;
            n=n/2;
        }
        return true;
    }
}
