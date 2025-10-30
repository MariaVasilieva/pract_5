package org.example;

/**
 * Стан "Delivered" — замовлення доставлено.
 */
class DeliveredState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("Замовлення вже завершено.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Замовлення вже доставлено.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Замовлення вже доставлено.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Неможливо скасувати — замовлення вже доставлено.");
    }

    @Override
    public void returnOrder(Order order) {
        System.out.println("Замовлення повернено. Повернення коштів виконано.");
        order.setState(new ReturnedState());
    }
}
