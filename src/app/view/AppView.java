package app.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppView {

    public int getOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose a drink:
                      1 - Espresso
                      2 - Cappuccino
                      3 - Latte
                      0 - stop
                """);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter a number");
            return getOption();
        }
    }

    public void getOutput(String output) {
//        System.out.printf();
        System.out.println(output);
    }
}
