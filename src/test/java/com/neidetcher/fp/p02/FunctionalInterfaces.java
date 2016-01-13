package com.neidetcher.fp.p02;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static org.junit.Assert.*;

public class FunctionalInterfaces {

    @Test
    public void function() {
        Function<String, Integer> getLength = (s) -> s.length();
        assertTrue(3 == getLength.apply("foo"));
    }

    @Test
    public void predicate() {
        Predicate<String> isEmpty = (s) -> s.isEmpty();
        assertTrue(isEmpty.test(""));
    }

    @Test
    public void consumer() {
        Consumer<String> say = (s) -> System.out.println(s);
        say.accept("Hello World");
    }

    @Test
    public void supplier() {
        Supplier<String> currTime = () -> ""+System.currentTimeMillis();
        System.out.println(currTime.get());
    }
}
