package com.neidetcher.fp.p02;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImperativeToFunctionalRomanNumeralsTest {

    private static Map<String, Integer> translationMap;

    @BeforeClass
    public static void populateTranslationMap() {
        translationMap = new HashMap<>();
        translationMap.put("I", 1);
        translationMap.put("II", 2);
        translationMap.put("III", 3);
        translationMap.put("IV", 4);
        translationMap.put("V", 5);
        translationMap.put("VI", 6);
        translationMap.put("VII", 7);
        translationMap.put("VIII", 8);
        translationMap.put("IX", 9);
        translationMap.put("X", 10);
    }

    public double averageImperative(List<String> romanNumeralsIn) {
        if (romanNumeralsIn.size() == 0) {
            return 0;
        }

        double sum = 0;
        for (String currString : romanNumeralsIn) {
            sum += translationMap.get(currString);
        }
        return sum / romanNumeralsIn.size();
    }

    public double averageFunctional(List<String> romanNumeralsIn) {
        return romanNumeralsIn.stream()
                .mapToInt(rn -> translationMap.get(rn))
                .average()
                .orElse(0);
    }

    @Test
    public void test() {
        List<String> romanNumerals = Arrays.asList("I", "IV", "VII");

        assertEquals(4.0, averageImperative(romanNumerals), .00000001);
        assertEquals(4.0, averageFunctional(romanNumerals), .00000001);
    }

    @Test
    public void testEmptyList() {
        List<String> romanNumerals = Arrays.asList();

        assertEquals(0, averageImperative(romanNumerals), .00000001);
        assertEquals(0, averageFunctional(romanNumerals), .00000001);
    }
}
