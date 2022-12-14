package com.gildedrose.model;

import java.util.function.Predicate;

//Conjured items degrade twice as fast as normal items
public class ConjuredItem extends CategorizedItem {
    public static final String TYPE_NAME = "Conjured";
    public static final Predicate<String> typeCheck = s -> s.startsWith(TYPE_NAME);

    public ConjuredItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        doubleDecrement();
        if (sellIn <= SELL_BY_DATE) doubleDecrement();
    }

   private void doubleDecrement() {
       decrementQuality();
       decrementQuality();
   }
}
