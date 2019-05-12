package com.wueiz.tdd;

import com.google.inject.AbstractModule;
import com.wueiz.tdd.core.FizzBuzz;
import com.wueiz.tdd.core.Game;
import com.wueiz.tdd.views.FizzBuzzView;
import com.wueiz.tdd.views.GameView;

public class FizzBuzzGameModule extends AbstractModule {
    protected void configure()
    {
        //add configuration logic here
        bind(Game.class).to(FizzBuzz.class);
        bind(GameView.class).to(FizzBuzzView.class);
    }
}
