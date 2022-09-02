package com.aaa.homeworks._10java8;
import java.util.*;
public class CountWords {
    public static void main(String[] args) {
        String str = new String("Eclipse eclipse Eclipse eclipse amc clip ECLIPSE");
        String[] strArray = str.split(" ");
        HashMap<String,Integer> myMap = new HashMap<>();
        for(String s:strArray) {
            if (myMap.containsKey(s)) {
                myMap.put(s, myMap.get(s)+1);
            } else {
                myMap.put(s, 1);
            }
        }
        System.out.println(myMap.toString());
    }

}
