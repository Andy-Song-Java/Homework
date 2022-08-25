package com.aaa.homeworks._04oop;

public class Polymorphism {
    //static polymorphism


    String method(String x){
        return x;
    };
    String method(String x,int y){
        return x + y;
    };

    public static void main(String[] args) {
        Polymorphism obj1 = new Polymorphism();
        System.out.println(obj1.method("ABC"));

        Polymorphism obj2 = new Poly();
        System.out.println(obj2.method("ABC"));
    }

}

class Poly extends Polymorphism{
    String method(String x){
        return "new" + x;
    }
    String method(String x,int y){
        return "new" + x + y;
    };
}
