package com.yash.Day5;

public class ValidPalindrome {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(String s) {
        //  s=s.replaceAll("\\s+|[-+.^:,@#_]", "");
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if(!Character.isLetterOrDigit(currFirst )){
                start++;
            }
            else if(!Character.isLetterOrDigit(currLast)){
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
