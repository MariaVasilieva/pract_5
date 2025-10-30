package org.example;

/**
 * Інтерфейс стану замовлення.
 * Визначає спільні дії, які може виконувати замовлення в будь-якому стані.
 */
interface OrderState {
    void pay(Order order);
    void ship(Order order);
    void deliver(Order order);
    void cancel(Order order);
    void returnOrder(Order order);
}
