package com.aaa.homeworks._10java8;
//1)	Define an abstract class “CreditCard”
//which contains fields (holderName, cardNumber, accountBalance, cardType),
// and not-implemented method “isCardAcceptable” with argument cardType.
// Define two classes “VisaCard” and “MasterCard” both should inherit this “CreditCard” interface
// and you should define constructor for both classes and implement the “isCardAcceptable” method.
// Now Add a default method “payBill(double bill)” and static method “refund(double amount)” to the interface.
// Verify that VisaCard and MasterCard class can read these two methods (use Main method to verify).
public abstract class CreditCard {
    String holderName;
    String cardName;
    Double accountBalance;
    String cardType;

    public abstract boolean isCardAcceptable(String cardType);

}

interface Card{
    default void payBill(double payment){
        System.out.println(payment + " received!");
    }
    //public void refund(double payment);
}

class VisaCard extends CreditCard implements Card{
    public VisaCard(String holdername, String cardName, Double accountBalance, String cardType){
        this.holderName = holdername;
        this.cardName = cardName;
        this.accountBalance = accountBalance;
        this.cardType = cardType;
    }
    public boolean isCardAcceptable(String cardType){
        return cardType == "VISA";
    }
}

class MasterCard extends CreditCard implements Card{
    public MasterCard(String holdername, String cardName, Double accountBalance, String cardType){
        this.holderName = holdername;
        this.cardName = cardName;
        this.accountBalance = accountBalance;
        this.cardType = cardType;
    }
    public boolean isCardAcceptable(String cardType){
        return cardType == "Master";
    }
}

class Main{
    public static void main(String[] args) {
        VisaCard vc1 = new VisaCard("Anne","Freedom", 10.00, "VISA");
        System.out.println(vc1.isCardAcceptable("VISA"));
        vc1.payBill(90); // works fine, don't need to override this default method in the child class.

        //vc1.refund(90); will produce an error! because the method is not implemented.
    }
}