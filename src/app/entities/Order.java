package app.entities;

public class Order {
    private final Coffee coffee;

    public Order(String name) {
        this.coffee = new Coffee(name);
    }

    public Coffee getCoffee() {
        return coffee;
    }
}
