package com.aaa.homeworks._06designpattern;
import java.io.Serializable;

public class AppleDesignerFactory implements Serializable, Cloneable {
    //singleton
    //1. private & static instance
    private static AppleDesignerFactory instance;
    //2. private constructor
    private AppleDesignerFactory(){};
    //3. public static synchronized getInstance method.
    public static synchronized AppleDesignerFactory getInstance(){
        if (instance == null){
            instance = new AppleDesignerFactory();
        }
        return instance;
    }

    //4. override serializable and clone
    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

    protected Object readResolve(){
        return instance;
    }
}
