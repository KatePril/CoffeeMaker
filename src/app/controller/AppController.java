package app.controller;

import app.entities.Order;
import app.model.AppModel;
import app.view.AppView;

import static java.lang.String.format;

public class AppController {
    AppView view = new AppView();
    AppModel model = new AppModel();

    public void handleData() {
        int option = view.getOption();
        if (option == 0) {
            view.getOutput("App closed");
        } else {
            Order order = model.getOrder(option);
            if (order == null) {
                view.getOutput("No such option");
            } else {
                view.getOutput(format("Your %s. Enjoy :)", order.getCoffee()));
            }
            handleData();
        }
    }
}
