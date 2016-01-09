package com.neidetcher.fp.p01;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class LambdasFromFunctionalInterfacesTest {

    /**
     * Implement a functional interface just like you could in Java
     * prior to Java8.
     */
    @Test
    public void lambdasFromFunctionalInterfaces0() {
        Function<Long, Long> timesTwo = new Function<Long, Long>() {
            @Override public Long apply(Long arg) {
                return arg * 2;
            }
        };

        assertTrue(10 == timesTwo.apply(5L));
    }

    /**
     * Remove everything besides the arguments and the method
     * body, separating those with an arrow.
     */
    @Test
    public void lambdasFromFunctionalInterfaces1() {
        Function<Long, Long> timesTwo = (Long arg) -> {
            return arg * 2;
        };

        assertTrue(10 == timesTwo.apply(5L));
    }

    /**
     * Remove the parens, the argument type, the mustaches
     * and the return
     */
    @Test
    public void lambdasFromFunctionalInterfaces2() {
        Function<Long, Long> timesTwo = num -> num * 2;

        assertTrue(10 == timesTwo.apply(5L));
    }

    /**
     * This is how you'd use lambdas in practice.
     */
    @Test
    public void howToUseLambdas() {
        List<Integer> doubledIntegers = Arrays.asList(1, 2, 3)
                .stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println("doubledIntegers: " + doubledIntegers);
    }
}
