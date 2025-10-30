package org.example;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println("Початковий стан: " + order.getStateName());
        order.ship();   // не можна
        order.pay();    // оплата
        System.out.println("Поточний стан: " + order.getStateName());
        order.ship();   // відправлено
        System.out.println("Поточний стан: " + order.getStateName());
        order.deliver(); // доставлено
        System.out.println("Поточний стан: " + order.getStateName());
        order.returnOrder(); // повернено
        System.out.println("Поточний стан: " + order.getStateName());
        order.cancel();  // вже завершено
    }
}