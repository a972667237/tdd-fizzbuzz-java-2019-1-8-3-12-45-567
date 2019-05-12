package com.wueiz.tdd.core;

import javax.inject.Inject;
import java.util.HashSet;
import java.util.Set;

public class FizzBuzz {
    @Inject
    public FizzBuzz() {}

    private boolean canModByThree(int num) {
        return num % 3 == 0;
    }

    private boolean canModByFive(int num) {
        return num % 5 == 0;
    }

    private boolean canModBySeven(int num) {
        return num % 7 == 0;
    }

    public Set<Integer> Judge(int num) {
        Set<Integer> judgeResult = new HashSet<Integer>();
        if (canModByThree(num)) {
            judgeResult.add(0);
        }
        if (canModByFive(num)) {
            judgeResult.add(1);
        }
        if (canModBySeven(num)) {
            judgeResult.add(2);
        }
        return judgeResult;
    }
}
