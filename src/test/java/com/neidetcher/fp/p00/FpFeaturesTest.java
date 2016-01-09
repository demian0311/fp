package com.neidetcher.fp.p00;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class FpFeaturesTest {

    ///// first class functions
    @Test
    public void firstClassFunctions() {
        assertEquals(
                Integer.valueOf(15),
                doOperation((a, b) -> a + b));
    }

    private Integer doOperation(
            BiFunction<Integer, Integer, Integer> operation) {
        return operation.apply(10, 5);
    }

    ///// anonymous functions
    private List<String> names = Arrays.asList(
            "Demian", "Courtney", "Ryder", "Bodhi");

    @Test
    public void anonymousFunctions() {
        List<String> upperCaseNames = names.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("upperCaseNames: " + upperCaseNames);
    }

    ///// pure functions
    @Test
    public void pureFunctions() {
        assertEquals(Integer.valueOf(50), multiply(5, 10));
    }

    private Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    ///// recursion
    @Test
    public void recursion() {
        assertEquals(55, fibonacci(10));
    }

    private long fibonacci( int number) {
        if (number <=2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    ///// referential transparency
    @Test
    public void referentialTransparency() {
        final int age = 5;
        final int yearsUntilVoting = 18 - age;
        assertEquals(13, yearsUntilVoting);
    }

}
