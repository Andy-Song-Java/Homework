package com.aaa.homeworks._04oop;

public class CreditCardMain {

   // 2)	Define an abstract class “CreditCard”
    // which contains fields (holderName, cardNumber, accountBalance, cardType),
    // and not-implemented method “isCardAcceptable” with argument cardType,
    // and implemented method “payBill(double bill)”.
    // Define two classes “VisaCard” and “MasterCard” both should inherit this “CreditCard” class
    // and you should define constructor for both classes and implement the “isCardAcceptable” method.
    // difference between abstract method and interface

   public static void main(String[] args) {
       VisaCard card1 = new VisaCard();
       System.out.println(card1.isCardAcceptable("VISA"));
       card1.payBill(100);
   }
}

abstract class CreditCard{
    private String holderName;
    private String cardNumber;
    private String accountBalance;
    private String cardType;

    public abstract boolean isCardAcceptable(String cardType);
    public abstract void payBill(double bill);
}

class VisaCard extends CreditCard {
    VisaCard(){};
    public boolean isCardAcceptable(String cardType){
        if (cardType == "VISA") return true;
        return false;
    }
    public void payBill(double bill) {
        System.out.println("Bill paid " + bill);
    }

}

class MasterCard extends CreditCard{
    MasterCard(){};
    public boolean isCardAcceptable(String cardType){
        if (cardType == "Master") return true;
        return false;
    }
    public void payBill(double bill) {
        System.out.println("Bill paid " + bill);
    }
}