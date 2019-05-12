package com.wueiz.tdd.controllers;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.mockito.Mockito.*;

public class GameControllersTest {
    @Inject
    private GameController gameController;

    @BeforeAll
    public void setUp() {
        Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(GameController.class).toInstance(mock(GameController.class));
            }
        }).injectMembers(this);
    }

    @Test
    public void TestGameLoop() {
        gameController.loop();
        verify(gameController, times(gameController.LoopTime)).dispatch();
    }

}
