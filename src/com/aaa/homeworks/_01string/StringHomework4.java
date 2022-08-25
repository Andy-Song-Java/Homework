package com.aaa.homeworks._01string;

public class StringHomework4 {
    //4) Given a list of string array, combine them into one string sentence, return the string sentence
    //First letter of a sentence is in uppercase
    //Sentence ends with a period.
    public static String combineStrings(String[] arr){
        String combinedString = "";
        for(String i: arr){
            combinedString = combinedString + " " + i;
        }
        combinedString = combinedString.substring(1,2).toUpperCase() + combinedString.substring(2) + ".";
        return combinedString;
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"this", "is", "a", "laptop"};
        System.out.println(combineStrings(arr));
    }
}
