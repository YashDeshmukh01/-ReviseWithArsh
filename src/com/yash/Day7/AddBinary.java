package com.yash.Day7;

public class AddBinary {
    public static void main(String[] args) {

    }
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0||j>=0){
            int sum = 0;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            sum+=carry;
            carry=sum/2;
            sb.insert(0,sum%2);
        }
        if(carry!=0)
            sb.insert(0,carry);

        return sb.toString();
    }
}
