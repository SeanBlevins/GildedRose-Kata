package com.gildedrose;

import com.gildedrose.model.*;
import org.jetbrains.annotations.NotNull;

public class Util {

    static final int MAX_QUALITY = 50;
    static final int MIN_QUALITY = 0;

    public static void fixInitialInventory(@NotNull Item[] items) {
        for (Item item : items) {
            if (item.quality > MAX_QUALITY) item.quality = MAX_QUALITY;
            if (item.quality < MIN_QUALITY) item.quality = MIN_QUALITY;
        }
    }
}
