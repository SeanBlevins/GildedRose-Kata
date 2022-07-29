package com.gildedrose.model;

import java.util.function.Predicate;

//Aged Brie increases in quality at the same rate as a normal item degrades in quality
public class AgedBrie extends CategorizedItem {
    public static final String TYPE_NAME = "Aged Brie";
    public static final Predicate<String> typeCheck = s -> s.equals(TYPE_NAME);

    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        incrementQuality();
        if (sellIn <= SELL_BY_DATE) incrementQuality();
    }
}
