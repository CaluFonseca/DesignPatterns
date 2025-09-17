package main.java.com.exemplo.designpatterns.factory;

public class PaymentFactory {
    public static Payment createPayment(String type) {
        return switch (type) {
            case "credit" -> new CreditCardPayment();
            case "paypal" -> new PayPalPayment();
            default -> throw new IllegalArgumentException("Unknow payment type " + type);
        };
    }
}
