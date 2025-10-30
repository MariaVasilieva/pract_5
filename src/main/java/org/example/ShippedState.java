package org.example;

/**
 * Стан "Shipped" — замовлення відправлено клієнту.
 */
class ShippedState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("Замовлення вже оплачено.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Замовлення вже відправлено.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Замовлення доставлено клієнту.");
        order.setState(new DeliveredState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Неможливо скасувати — замовлення вже відправлено.");
    }

    @Override
    public void returnOrder(Order order) {
        System.out.println("Неможливо повернути — замовлення ще не доставлено.");
    }
}
