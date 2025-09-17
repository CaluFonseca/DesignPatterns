package main.java.com.exemplo.designpatterns.factory;

public class CreditCardPayment extends Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "with credit card");
    }
}
