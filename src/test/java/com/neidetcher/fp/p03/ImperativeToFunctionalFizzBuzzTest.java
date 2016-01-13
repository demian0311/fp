package com.neidetcher.fp.p03;

import org.junit.Test;

import java.util.stream.IntStream;

public class ImperativeToFunctionalFizzBuzzTest {

    @Test
    public void fizzBuzzImperative() {
        for(int ii = 1; ii <= 100; ii++) {
            String s = ii + ": ";
            if (ii % 3 == 0) {
                s += "Fizz";
            }
            if (ii % 5 == 0) {
                s += "Buzz";
            }
            System.out.println(s);
        }
    }

    @Test
    public void test() {
        IntStream.range(1, 100)
                .boxed()
                .map(x -> x+": " + (x%3==0? "Fizz": "") + (x%5==0? "Buzz": ""))
                .forEach(System.out::println);
    }
}
