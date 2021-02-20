package com.gildedrose.domain;


public class ConjuredItem extends CommonItem {
    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void processQuality() {
        if (this.quality > 0) {
            if (this.sellIn >= 0)
                this.quality = this.quality - 2;
            else
                this.quality = this.quality - 4;
        }
        if (this.quality < 0)
            this.quality = 0;
    }
}
