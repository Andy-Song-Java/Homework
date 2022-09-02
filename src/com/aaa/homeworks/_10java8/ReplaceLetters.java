package com.aaa.homeworks._10java8;
//3)	"walabcwalexywalxzsfwalmx”  -- replace "wal" with "sams"

public class ReplaceLetters {

    public static String ReplaceString(String str){
        String str2 = "";
        for (int i = 0; i<str.length()-2; i++){
            boolean match1 = str.charAt(i) == 'w';
            boolean match2 = str.charAt(i + 1) == 'a';
            boolean match3 = str.charAt(i + 2) == 'l';
            if (match1 && match2 && match3){
                str2 = str2 + "sams";
                i = i + 2;
            } else {
                str2 = str2 + str.charAt(i);
            }
        }
        str2 = str2 + str.substring(str.length()-2,str.length());
        return str2;
    }

    public static void main(String[] args) {
        System.out.println(ReplaceString("walabcwalexywalxzsfwalmx"));
    }

}
