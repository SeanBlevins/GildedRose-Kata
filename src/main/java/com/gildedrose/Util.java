package com.gildedrose;

import com.gildedrose.model.*;
import org.jetbrains.annotations.NotNull;

public class Util {

    static final int MAX_QUALITY = 50;
    static final int MIN_QUALITY = 0;
    static final String UNKNOWN_ITEM = "Unknown item";

    public static void fixInitialInventory(@NotNull Item[] items) {
        for (Item item : items) {
            if (item.name == null || item.name.isEmpty()) item.name = UNKNOWN_ITEM;
            if (item.quality > MAX_QUALITY) item.quality = MAX_QUALITY;
            if (item.quality < MIN_QUALITY) item.quality = MIN_QUALITY;
        }
    }
}
