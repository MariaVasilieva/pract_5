package org.example;

/**
 * Стан "Cancelled" — замовлення скасовано.
 */
class CancelledState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("Неможливо оплатити — замовлення скасовано.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Неможливо відправити — замовлення скасовано.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Неможливо доставити — замовлення скасовано.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Замовлення вже скасовано.");
    }

    @Override
    public void returnOrder(Order order) {
        System.out.println("Неможливо повернути — замовлення скасовано.");
    }
}