package com.wueiz.tdd.core;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;


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
        int oneThreeValue = 42;
        int oneTwoThreeValue = 105;
        int noneValue = 1;
        assertEquals(fizzBuzz.Judge(oneTwoValue), fizzBuzz.OneTwo);
        assertEquals(fizzBuzz.Judge(oneThreeValue), fizzBuzz.OneThree);
        assertEquals(fizzBuzz.Judge(oneTwoThreeValue), fizzBuzz.OneTwoThree);
        assertEquals(fizzBuzz.Judge(noneValue), fizzBuzz.None);
    }
}
