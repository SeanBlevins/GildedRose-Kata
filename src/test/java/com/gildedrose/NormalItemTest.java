package com.gildedrose;

import com.gildedrose.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NormalItemTest {

    @Test
    void randomItemTest_1Day() {
        Item[] items = new Item[] { new Item("random item", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
    }

    @Test
    void randomItemTest_1Day_passedSellInDate() {
        Item[] items = new Item[] { new Item("random item", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
    }

    @Test
    void randomItemTest_1Day_passedSellInDate_qualityMinimum() {
        Item[] items = new Item[] { new Item("random item", 0, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void nullItemNameTest_1Day() {
        Item[] items = new Item[] { new Item(null, 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
    }

    @Test
    void randomItemTest_categorizedItem() {
        Item[] items = new Item[] { new Item("random item", 1, 1) };
        GildedRose app = new GildedRose(items);
        //If the item didnt fit one of the defined class type we create an anonymous class of CategorizedItem
        assertTrue(app.items[0].getClass().isAnonymousClass());
    }
}
