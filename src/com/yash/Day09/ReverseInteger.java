package com.yash.Day09;

public class ReverseInteger {
    public static void main(String[] args) {

    }
    public int reverse(int x) {
        long reversed = 0;
        int pop;

        while(x!=0){
            pop = x%10;
            x/=10;
            reversed = (reversed*10)+pop;
        }
        if(reversed<Math.pow(-2,31) || reversed>Math.pow(2,31))
            return 0;
        else
            return (int)reversed;
    }
}
