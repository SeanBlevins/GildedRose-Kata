package com.gildedrose.model;

import java.util.function.Predicate;

public class BackstagePasses extends CategorizedItem {
    public static final String TYPE_NAME = "Backstage passes";
    public static final Predicate<String> typeCheck = s -> s.startsWith(TYPE_NAME);

    public BackstagePasses(Item item) {
        super(item);
    }
}
