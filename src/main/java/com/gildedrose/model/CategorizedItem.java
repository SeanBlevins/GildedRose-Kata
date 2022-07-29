package com.gildedrose.model;

//Normal items degrade in quality by 1 and sell in degrades by 1 each day
//Quality is never below 0 or above 50
//If the sell in date is reached then items degrade twice as fast
public abstract class CategorizedItem extends Item {
    public static final int MAX_QUALITY = 50;
    public static final int MIN_QUALITY = 0;

    public CategorizedItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public CategorizedItem(Item item) {
        super(item.name, item.sellIn, item.quality);
    }
    final int SELL_BY_DATE = 0;

    public void updateItem() {
        updateQuality();
        updateSellIn();
    }
    public void updateQuality() {
        decrementQuality();
        if (sellIn <= SELL_BY_DATE) decrementQuality();
    }

    public void updateSellIn() {
        sellIn--;
    }

    void decrementQuality() {
        quality--;
        if (quality < MIN_QUALITY) quality = MIN_QUALITY;
    }

    void incrementQuality() {
        quality++;
        if (quality > MAX_QUALITY) quality = MAX_QUALITY;
    }
}
