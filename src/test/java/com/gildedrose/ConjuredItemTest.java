package com.gildedrose;

import com.gildedrose.model.ConjuredItem;
import com.gildedrose.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConjuredItemTest {

    @Test
    void conjuredItemTest_1Day() {
        Item[] items = new Item[] { new Item("Conjured mana cake", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
    }

    @Test
    void conjuredItemTest_1Day_passedSellInDate_minQuality() {
        Item[] items = new Item[] { new Item("Conjured mana cake", 0, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void conjuredItemTest_1Day_passedSellInDate() {
        Item[] items = new Item[] { new Item("Conjured mana cake", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
    }

    @Test
    void conjuredItemTest_categorizedItem() {
        Item[] items = new Item[] { new Item("Conjured mana cake", 1, 1) };
        GildedRose app = new GildedRose(items);
        assertTrue(app.items[0] instanceof ConjuredItem);
    }
}
