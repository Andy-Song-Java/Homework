package com.aaa.test;

import java.util.Arrays;

public class StringHomework1 {
    // 1) Given string “Algorithms”, return  “go” and “Algo” using substring
    // substring is right open.
    //use Arrays.toString to print the array
    //use static to save the time to declare an object
    //practiced convenient functions in ideaJ.
    public static String[] deriveSubstring(String str){
        return new String[] {str.substring(0,4),str.substring(3,5)};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deriveSubstring("Algorithms")));
    }
}
