package org.example;

/**
 * Клас контексту (Order).
 * Зберігає поточний стан і делегує дії відповідному об’єкту стану.
 */
class Order {
    private OrderState state;

    public Order() {
        this.state = new NewState(); // Початковий стан замовлення
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public String getStateName() {
        return state.getClass().getSimpleName();
    }

    public void pay() {
        state.pay(this);
    }

    public void ship() {
        state.ship(this);
    }

    public void deliver() {
        state.deliver(this);
    }

    public void cancel() {
        state.cancel(this);
    }

    public void returnOrder() {
        state.returnOrder(this);
    }
}