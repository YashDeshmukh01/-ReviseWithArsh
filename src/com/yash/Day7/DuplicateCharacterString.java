package com.yash.Day7;

import java.util.Scanner;

public class DuplicateCharacterString {
    public static void main(String[] args) {
        String s1 = "aabbcc";
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.next();
        int[] count = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i]>1){
                System.out.println((char)i + " Count = " + count[i]);
            }
        }
    }
}
