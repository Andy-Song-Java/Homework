package com.aaa.test;

class Solution {
    public int romanToInt(String s) {
        int[] arr1 = new int[15];
        int[] arr2 = new int[15];

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'M':
                    arr1[i] = 1000;
                case 'D':
                    arr1[i] = 500;
                case 'C':
                    arr1[i] = 100;
                case 'L':
                    arr1[i] = 50;
                case 'X':
                    arr1[i] = 10;
                case 'V':
                    arr1[i] = 5;
                case 'I':
                    arr1[i] = 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (arr1[i] < arr1[i+1]) {
                sum = sum + arr1[i] * (-1);
            } else {
                sum = sum + arr1[i];
            }
        }
        sum = sum + arr1[s.length()-1];
        return sum;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.romanToInt("LVIII"));
    }


}
