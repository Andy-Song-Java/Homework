package com.aaa.test;

public class FinalHomework1 {
//Problems: define a final class and final method and
// final variable, modify the value
// of the variable in final method
    //Only StringBuffer or Array could change the value of the objected while keeping the reference final.
    public static final class MyFinalClass{
        public final StringBuffer str = new StringBuffer("abc");
        public final void changeVariable(String str1){
            str.append(str1) ;
        }
    }

    public static void main(String[] args) {
        MyFinalClass obj = new MyFinalClass();
        System.out.println(obj.str);
        obj.changeVariable("123");
        System.out.println(obj.str);
    }

}
