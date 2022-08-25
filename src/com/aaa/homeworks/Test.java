package com.aaa.homeworks;

public class Test {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = "abc";
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(Math.pow(2,31));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(-5 / 3);
        System.out.println( 5 / 3);
    }

}
