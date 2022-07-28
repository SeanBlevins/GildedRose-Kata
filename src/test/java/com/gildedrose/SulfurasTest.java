package com.gildedrose;

import com.gildedrose.model.Item;
import com.gildedrose.model.Sulfuras;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SulfurasTest {

    @Test
    void sulfurasTest_initialQuality() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 10) };
        GildedRose app = new GildedRose(items);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }

    @Test
    void sulfurasTest_1Day() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(10, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }

    @Test
    void sulfurasTest_1Day_valuesDontChange() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 13, 43) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(13, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }

    @Test
    void sulfurasmTest_categorizedItem() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 1, 1) };
        GildedRose app = new GildedRose(items);
        assertTrue(app.items[0] instanceof Sulfuras);
    }
}
