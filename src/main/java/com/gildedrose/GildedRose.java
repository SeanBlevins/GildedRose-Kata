package com.gildedrose;

import com.gildedrose.model.CategorizedItem;
import com.gildedrose.model.Item;
import org.jetbrains.annotations.NotNull;

import static com.gildedrose.Util.categorizeItems;
import static com.gildedrose.Util.fixInitialInventory;

class GildedRose {
    final CategorizedItem[] items;

    public GildedRose(@NotNull Item[] items) {
        fixInitialInventory(items);
        this.items = categorizeItems(items);
    }

    public void updateQuality() {
        for (CategorizedItem item : items) {
            item.updateItem();
        }
    }
}
