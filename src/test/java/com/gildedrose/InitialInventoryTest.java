package com.gildedrose;

import com.gildedrose.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitialInventoryTest {

    @Test
    void checkInventory_randomItem_overMaxQuality() {
        Item[] items = new Item[] { new Item("random item", 10, 100) };
        GildedRose app = new GildedRose(items);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void checkInventory_randomItem_underMinQuality() {
        Item[] items = new Item[] { new Item("random item", 10, -1) };
        GildedRose app = new GildedRose(items);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }
}
