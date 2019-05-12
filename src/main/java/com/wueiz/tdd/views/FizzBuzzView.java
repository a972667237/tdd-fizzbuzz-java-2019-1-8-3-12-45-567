package com.wueiz.tdd.views;

import java.util.Set;

public class FizzBuzzView implements GameView{
    @Override
    public void show(int origin, Set<Integer> inputSet) {
        if (inputSet.isEmpty()) {
            System.out.println(origin);
        } else {
            inputSet.forEach(item -> {
                if (item == 0) {
                    System.out.print("Fizz");
                }
                if (item == 1) {
                    System.out.print("Buzz");
                }
                if (item == 2) {
                    System.out.print("Whizz");
                }
            });
            System.out.println();
        }
    }
}
