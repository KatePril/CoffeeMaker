package app.model;

import app.entities.*;

public class AppModel {

    public Coffee getOrder(int option) {
        switch (option) {
            case 1 -> {
                return new Espresso();
            }
            case 2 -> {
                return new Cappuccino();
            }
            case 3 -> {
                return new Latte();
            }
            default -> {
                return null;
            }
        }
    }
}
