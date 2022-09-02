package com.aaa.homeworks._07collection;
import java.util.*;
public class StringDuplicate {

    public static HashMap<Character,Integer> findDuplicate(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            char s = str.charAt(i);
            if (!map.containsKey(s)) {
                map.put(s,1);
            } else {
                map.put(s,map.get(s) + 1);
            }
        }

        System.out.println(map.toString());
        return map;
    }

    public static void main(String[] args){
        String str = "aaasssddd999";
        findDuplicate(str);
    }

}
