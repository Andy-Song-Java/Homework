package com.aaa.test;

public class StringHomework2 {
    //2) Given two strings, compare if these two strings are equal by comparing each character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for(int i = 0; i<str1.length();i++){
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1;
        str1 = "abc11";
        String str2 = "abc11";
        System.out.println(compareStrings(str1,str2));
    }
}
