package com.gildedrose;

import com.gildedrose.model.CategorizedItem;
import com.gildedrose.model.Item;
import org.jetbrains.annotations.NotNull;

import static com.gildedrose.Util.*;

class GildedRose {
    CategorizedItem[] items;

    public GildedRose(@NotNull Item[] items) {
        if (isNullOrEmpty(items)) throw new IllegalArgumentException("Inventory is empty!");
        fixInitialInventory(items);
        this.items = categorizeItems(items);
    }

    public void updateQuality() {
        for (CategorizedItem item : items) {
            item.updateItem();
        }
    }
}
