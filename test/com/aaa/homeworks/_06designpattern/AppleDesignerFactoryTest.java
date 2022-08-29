package com.aaa.homeworks._06designpattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppleDesignerFactoryTest {
    @Test
    public void test1(){
        AppleDesignerFactory obj1 = AppleDesignerFactory.getInstance();
        AppleDesignerFactory obj2 = AppleDesignerFactory.getInstance();
        assertSame(obj1, obj2);
    }
}