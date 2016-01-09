package com.neidetcher;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<Product, Integer> productIntegerMap = new HashMap<>();
    private Float taxRate;

    public void addProduct(Product productIn, Integer quantity) {
        productIntegerMap.put(productIn, quantity);
    }

    public void setTaxRate(Float taxRateIn) {
        taxRate = taxRateIn;
    }


}
