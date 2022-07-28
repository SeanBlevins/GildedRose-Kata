package com.gildedrose.model;

public abstract class CategorizedItem extends Item {
    public CategorizedItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public CategorizedItem(Item item) {
        super(item.name, item.sellIn, item.quality);
    }
}
