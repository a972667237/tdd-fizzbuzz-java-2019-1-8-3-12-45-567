package com.wueiz.tdd.controllers;


import com.wueiz.tdd.core.Game;
import com.wueiz.tdd.views.GameView;

import javax.inject.Inject;
import java.util.Set;
import java.util.stream.IntStream;

public class GameController implements Runnable{
    public int LoopTime = 120;
    private Game game;
    private GameView gameView;

    @Inject
    public GameController(Game game, GameView gameView) {
        this.game = game;
        this.gameView = gameView;
    }

    public void run() {
        IntStream intStream = IntStream.rangeClosed(1, LoopTime);
        intStream.forEach(index -> dispatch(index));
    }

    public void dispatch(int index) {
        Set<Integer> result = game.Judge(index);
        gameView.show(index, result);
    }
}
