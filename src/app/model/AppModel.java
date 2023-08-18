package app.model;

import app.entities.Order;

public class AppModel {

    public Order getOrder(int option) {
        switch (option) {
            case 1 -> {
                return new Order("espresso");
            }
            case 2 -> {
                return new Order("cappuccino");
            }
            case 3 -> {
                return new Order("latte");
            }
            default -> {
                return null;
            }
        }
    }
}
