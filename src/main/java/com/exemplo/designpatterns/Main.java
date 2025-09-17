package main.java.com.exemplo.designpatterns;

import main.java.com.exemplo.designpatterns.builder.User;
import main.java.com.exemplo.designpatterns.factory.Payment;
import main.java.com.exemplo.designpatterns.factory.PaymentFactory;
import main.java.com.exemplo.designpatterns.singleton.AppConfig;

public class Main {
    public static void main(String[] args) {
        // Test for design pattern singleton
        AppConfig config = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        System.out.println(config.getAppName());
        System.out.println(config == config2);

        System.out.println("---------------------");

        // Test for design pattern factory
        Payment p1 = PaymentFactory.createPayment("credit");
        p1.pay(100.0);

        Payment p2 = PaymentFactory.createPayment("paypal");
        p2.pay(120.0);

        System.out.println("---------------------");

        // Test for design pattern Builder
        User user = new User.Builder().name("Cláudio").age(36).email("clau@gmail.com").build();
        System.out.println(user);
    }
}