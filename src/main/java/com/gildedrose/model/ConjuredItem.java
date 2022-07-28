package com.gildedrose.model;

import java.util.function.Predicate;

public class ConjuredItem extends CategorizedItem {
    public static final String TYPE_NAME = "Conjured";
    public static final Predicate<String> typeCheck = s -> s.startsWith(TYPE_NAME);

    public ConjuredItem(Item item) {
        super(item);
    }
}
