package com.gildedrose;


import com.gildedrose.interfaces.ItemInterface;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
                ((ItemInterface) item).processSellIn();
                ((ItemInterface) item).processQuality();
    }
    }
}