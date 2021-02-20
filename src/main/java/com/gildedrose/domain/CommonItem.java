package com.gildedrose.domain;

import com.gildedrose.Item;
import com.gildedrose.interfaces.ItemInterface;

public class CommonItem extends Item implements ItemInterface {
    public CommonItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void processSellIn() {
        this.sellIn = this.sellIn - 1;
    }

    @Override
    public void processQuality() {
        if (this.quality > 0) {
            if (this.sellIn >= 0)
                this.quality = this.quality - 1;
            else
                this.quality = this.quality - 2;
        }
        if (this.quality < 0)
            this.quality = 0;
    }
}
