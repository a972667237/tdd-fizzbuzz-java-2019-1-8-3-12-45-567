package com.wueiz.tdd.core;

import javax.inject.Inject;
import java.util.Set;

public class FizzBuzz {

    public int None = 0;
    public int One = 1;
    public int Two = 2;
    public int Three = 3;
    public int OneTwo = 4;
    public int TwoThree = 5;
    public int OneThree = 6;
    public int OneTwoThree = 7;

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
        boolean canModByThree = canModByThree(num);
        boolean canModByFive = canModByFive(num);
        boolean canModBySeven = canModBySeven(num);

        if (canModByThree && canModByFive && canModBySeven) {
            return OneTwoThree;
        } else if (canModByThree && canModByFive) {
            return OneTwo;
        } else if (canModByThree && canModBySeven) {
            return OneThree;
        } else if (canModByFive && canModBySeven) {
            return TwoThree;
        } else if (canModByThree) {
            return One;
        } else if (canModByFive) {
            return Two;
        } else if (canModBySeven) {
            return Three;
        } else {
            return None;
        }
    }
}
