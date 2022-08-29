package com.aaa.homeworks._06designpattern.factory;

import com.aaa.homeworks._06designpattern.factory.Currency;
import com.aaa.homeworks._06designpattern.factory.CurrencyExchange;

public class Test {

    public static void main(String[] args) {
        Currency cu1 = CurrencyExchange.getExchange("Canada");
        cu1.showExchange();
        System.out.println(cu1.getClass());

        Currency cu2 = CurrencyExchange.getExchange("USA");
        cu1.showExchange();
        System.out.println(cu1.getClass());
    }


}
