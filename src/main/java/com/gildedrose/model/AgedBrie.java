package com.gildedrose.model;

import java.util.function.Predicate;

public class AgedBrie extends CategorizedItem {
    public static final String TYPE_NAME = "Aged Brie";
    public static final Predicate<String> typeCheck = s -> s.equals(TYPE_NAME);

    public AgedBrie(Item item) {
        super(item);
    }

}
