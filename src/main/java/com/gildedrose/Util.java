package com.gildedrose;

import com.gildedrose.model.*;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Util {

    static final int MAX_QUALITY = 50;
    static final int MIN_QUALITY = 0;
    static final String UNKNOWN_ITEM = "Unknown item";

    public static CategorizedItem[] categorizeItems(Item[] items) {
        return Arrays.stream(items).map(item -> {
            if (AgedBrie.typeCheck.test(item.name)) return new AgedBrie(item);
            if (Sulfuras.typeCheck.test(item.name)) return new Sulfuras(item);
            if (BackstagePasses.typeCheck.test(item.name)) return new BackstagePasses(item);
            if (ConjuredItem.typeCheck.test(item.name)) return new ConjuredItem(item);
            return new CategorizedItem(item){};
        }).collect(Collectors.toList()).toArray(CategorizedItem[]::new);
    }

    public static void fixInitialInventory(@NotNull Item[] items) {
        for (Item item : items) {
            if (item.name == null || item.name.isEmpty()) item.name = UNKNOWN_ITEM;
            if (item.quality > MAX_QUALITY) item.quality = MAX_QUALITY;
            if (item.quality < MIN_QUALITY) item.quality = MIN_QUALITY;
        }
    }
}
