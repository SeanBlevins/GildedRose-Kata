package com.gildedrose;

import com.gildedrose.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredItemTest {

    @Test
    void conjuredItemTest_1Day() {
        Item[] items = new Item[] { new Item("Conjured mana cake", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
    }
}
