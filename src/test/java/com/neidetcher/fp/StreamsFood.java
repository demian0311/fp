package com.neidetcher.fp;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StreamsFood {

    List<Food> foodList = Arrays.asList(
            new Food("bacon", 8, true),
            new Food("kale", 9, false),
            new Food("ribs", 9, true),
            new Food("quinoa", 1, false),
            new Food("hotdogs", 4, true));

    @Test
    public void test() {
        String bestMeat = foodList.stream()
                .filter(f -> f.isMeat)
                .sorted((a, b) -> b.getNutrientValue() - a.getNutrientValue())
                .map(Food::getName)
                .findFirst().get();
        System.out.println("bestMeat: " + bestMeat);
    }

    private class Food {
        private String name;
        private Integer nutrientValue;
        private Boolean isMeat;

        public Food(final String nameIn, final Integer nutrientValueIn, final Boolean isMeatIn) {
            name = nameIn;
            nutrientValue = nutrientValueIn;
            isMeat = isMeatIn;
        }

        public String getName() {
            return name;
        }

        public Integer getNutrientValue() {
            return nutrientValue;
        }

        public Boolean isMeat() {
            return isMeat;
        }
    }
}
