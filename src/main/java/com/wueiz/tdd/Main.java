package com.wueiz.tdd;

import com.google.inject.Injector;
import com.wueiz.tdd.controllers.GameController;

import static com.google.inject.Guice.createInjector;


public class Main {
    public static void main(String[] args) {
        Injector injector = createInjector(new FizzBuzzGameModule());
        GameController gameController = injector.getInstance(GameController.class);
        gameController.run();
    }
}
