package org.example;

/**
 * Стан "New" — нове, щойно створене замовлення.
 */
class NewState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("Оплата успішна. Замовлення переходить у стан Paid.");
        order.setState(new PaidState());
    }

    @Override
    public void ship(Order order) {
        System.out.println("Неможливо відправити — замовлення ще не оплачено.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Неможливо доставити — замовлення ще не оплачено.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Замовлення скасовано.");
        order.setState(new CancelledState());
    }

    @Override
    public void returnOrder(Order order) {
        System.out.println("Неможливо повернути — замовлення ще не доставлено.");
    }
}