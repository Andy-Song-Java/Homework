package com.aaa.homeworks._07collection;
import java.util.*;

public class TrueFriends {

    public static ArrayList<String> ifTrueFriends(ArrayList<String> ar1, ArrayList<String> ar2){
        ArrayList<String> results = new ArrayList<String>();
        for (int i = 0; i< ar1.size(); i++){
            if (ar2.contains(ar1.get(i))) {
                results.add(ar1.get(i));
            }
        }
        return results;
    }

    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("Tom");
        al1.add("Jerry");
        al1.add("John");
        al1.add("Becky");

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Lucy");
        al2.add("Jerry");
        al2.add("John");
        al2.add("Peter");


        System.out.println(ifTrueFriends(al1, al2).toString());
    }
}
