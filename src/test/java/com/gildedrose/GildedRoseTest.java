package com.gildedrose;

import com.gildedrose.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GildedRoseTest {

    @Test
    void gildedRoseInput() {
       assertThrows(IllegalArgumentException.class, () -> new GildedRose(null));
    }

    @Test
    void gildedRoseEmptyItemArray() {
        Item[] items = new Item[] {};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items.length);
    }
    @Test
    void gildedRoseSingleItem() {
        Item[] items = new Item[] { new Item("random item", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items.length);
    }
}
