package com.gildedrose.model;

import java.util.function.Predicate;

//Sulfuras quality and sell in date never change
//Quality is always 80
public class Sulfuras extends CategorizedItem {
    private static final int CONSTANT_QUALITY = 80;
    public static final String TYPE_NAME = "Sulfuras, Hand of Ragnaros";
    public static final Predicate<String> typeCheck = s -> s.equals(TYPE_NAME);

    public Sulfuras(Item item) {
        super(item.name, item.sellIn, CONSTANT_QUALITY);
    }
}
