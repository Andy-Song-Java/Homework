package com.aaa.homeworks._01string;

import java.util.StringTokenizer;

public class StringHomework3 {
    //String tokenizer
    public static void main(String[] args) {
        String str1 = "https://www.amazon.com/demo?test=abc";
        StringTokenizer st = new StringTokenizer(str1," :/.=?");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
