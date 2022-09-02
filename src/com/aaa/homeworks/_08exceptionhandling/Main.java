package com.aaa.homeworks._08exceptionhandling;

//1)	Define two exceptions “CardTypeException” and “AddressException”.
// Create a separate class “ExceptionHandler” which contains one method “handleException”.
// The method takes input of cardType and address.
// If cardType is “AMEX”, throw CardTypeException.
// If address is outside US, return AddressException, for other errors, just return generic exception.
// Your exception should be caught and you should display message to tell which exception is returned.
public class Main {
    public static void main(String[] args) {

        try{
            ExceptionHandler.handleException("AMEX", "CAN");
        } catch (CardTypeException e){
            System.out.println("CardTypeException Handled");
        } catch (AddressException e) {
            System.out.println("AddressException Handled");
        } catch (Exception e) {
            System.out.println("Other Exception Handled");
        } finally {System.out.println("End of program");}

    }
}

class CardTypeException extends Exception{
    public CardTypeException(String str){
        super(str);
    }
}

class AddressException extends Exception{
    public AddressException(String str){
        super(str);
    }
}

class ExceptionHandler {
    public static void handleException(String cardtype, String address) throws CardTypeException, AddressException{
        if (cardtype == "AMEX") throw new CardTypeException("AMEX not supported!");
        if (address != "USA") throw new AddressException("Can't ship to foreign address!");
    }

}