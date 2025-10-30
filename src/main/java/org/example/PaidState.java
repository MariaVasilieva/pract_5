package org.example;

/**
 * Стан "Paid" — замовлення оплачено.
 */
class PaidState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("Замовлення вже оплачено.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Замовлення відправлено покупцеві.");
        order.setState(new ShippedState());
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Неможливо доставити — замовлення ще не відправлено.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Оплачене замовлення скасовано. Повернення коштів виконано.");
        order.setState(new CancelledState());
    }

    @Override
    public void returnOrder(Order order) {
        System.out.println("Неможливо повернути — замовлення ще не доставлено.");
    }
}