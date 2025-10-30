package org.example;

/**
 * Новий стан "Returned" — замовлення повернене після доставки.
 */
class ReturnedState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("Неможливо оплатити — замовлення вже повернено.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Неможливо відправити — замовлення повернено.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Замовлення вже повернено, повторна доставка неможлива.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Замовлення вже завершено (повернення виконано).");
    }

    @Override
    public void returnOrder(Order order) {
        System.out.println("Замовлення вже повернено.");
    }
}
