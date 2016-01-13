package com.neidetcher.fp.p02;

import org.junit.Test;
import java.util.function.Predicate;
import static org.junit.Assert.assertFalse;

public class SimpleLambda {
    /**
     * Lambdas are implementations of SAMIs
     */
    @Test
    public void lambdasOnTheirOwn() {
        Runnable r = () -> System.out.println("hello world");
        r.run();

        Predicate<String> isEmpty = s -> s.isEmpty();
        assertFalse(isEmpty.test("FOO"));
    }
}
