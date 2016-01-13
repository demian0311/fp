package com.neidetcher.fp.p04;

import org.junit.Test;

import static org.junit.Assert.*;

public class StatementsVsExpressions {

    private final long annualPayment = 40_000;
    private final int age = 66;

    /**
     * Statements do not resolve to a value.
     */
    @Test
    public void statement() {
        long monthlyBenefit;
        if (age >= 65) {
            monthlyBenefit = annualPayment / 12;
        } else {
            monthlyBenefit = 0;
        }
        assertEquals(3_333, monthlyBenefit);
    }

    /**
     * Expressions resolve to a value.
     */
    @Test
    public void expression() {
        final long monthlyBenefit = age >= 65? annualPayment / 12: 0;
        assertEquals(3_333, monthlyBenefit);
    }

}
