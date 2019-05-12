package com.wueiz.tdd.core;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


public class FizzBuzzTest {
    @Inject
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(FizzBuzz.class).toInstance(new FizzBuzz());
            }
        }).injectMembers(this);
    }

    @Test
    public void TestJudge() {
        // Judge should return a int, mean that match 3, 5 and 7, if match 3, 5 ,return 4, define as OneTwo
        int oneTwoValue = 15;
        int oneThreeValue = 21;
        int oneTwoThreeValue = 105;
        int noneValue = 1;

        Set<Integer> oneTwoSet = fizzBuzz.Judge(oneTwoValue);
        Set<Integer> oneThreeSet = fizzBuzz.Judge(oneThreeValue);
        Set<Integer> oneTwoThreeSet = fizzBuzz.Judge(oneTwoThreeValue);
        Set<Integer> noneSet = fizzBuzz.Judge(noneValue);

        // test one two
        assertAll("Test is one two return",
                () -> assertTrue(oneTwoSet.contains(0)),
                () -> assertTrue(oneTwoSet.contains(1)),
                () -> assertTrue(oneTwoSet.size() == 2));
        // one three
        assertAll("Test is one three return",
                () -> assertTrue(oneThreeSet.contains(0)),
                () -> assertTrue(oneThreeSet.contains(2)),
                () -> assertTrue(oneThreeSet.size() == 2));

        // one two three
        assertAll("Test is one two three return",
                () -> assertTrue(oneTwoThreeSet.contains(0)),
                () -> assertTrue(oneTwoThreeSet.contains(1)),
                () -> assertTrue(oneTwoThreeSet.contains(2)),
                () -> assertTrue(oneTwoThreeSet.size() == 3));

        // none
        assertTrue(noneSet.size() == 0);
    }
}
