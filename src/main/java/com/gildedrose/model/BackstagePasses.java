package com.gildedrose.model;

import java.util.function.Predicate;

//Backstage passes increase in quality by 1 each day
//If the sell in date passes the first threshold then the quality increases by a further 1
//If the sell in date passes the second threshold then the quality increases by another further 1
//If the sell in date reaches the sell by date then the quality is reduced to the minimum quality of 0
public class BackstagePasses extends CategorizedItem {
    public static final String TYPE_NAME = "Backstage passes";
    public static final Predicate<String> typeCheck = s -> s.startsWith(TYPE_NAME);

    public BackstagePasses(Item item) {
        super(item);
    }
}
