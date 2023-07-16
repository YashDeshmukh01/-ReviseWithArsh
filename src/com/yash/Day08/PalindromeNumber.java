package com.yash.Day08;

public class PalindromeNumber {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int y = x;
        int res = 0;
        while(y != 0) {
            res = res * 10 + y % 10;
            y /= 10;
        }
        return x == res;
    }
}
