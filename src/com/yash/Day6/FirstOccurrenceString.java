package com.yash.Day6;

public class FirstOccurrenceString {
    public static void main(String[] args) {

    }
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }//else return needle.indexOf (haystack);
        return -1;
    }
}
