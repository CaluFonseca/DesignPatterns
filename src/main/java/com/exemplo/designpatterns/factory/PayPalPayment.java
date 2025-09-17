package main.java.com.exemplo.designpatterns.factory;

public class PayPalPayment extends Payment {

    @Override
     public void pay(double amount) {
        System.out.println("Payment " + amount + "with PayPal");
    }
}
