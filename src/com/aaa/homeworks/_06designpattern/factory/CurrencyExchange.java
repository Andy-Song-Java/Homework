package com.aaa.homeworks._06designpattern.factory;

public class CurrencyExchange{
    public static Currency getExchange(String country){
        if (country.equals("USA")) {
            return new USACurrency();
        }
        if (country.equals("Canada")) {
            return new CANCurrency();
        }
        return null;
    }
}
