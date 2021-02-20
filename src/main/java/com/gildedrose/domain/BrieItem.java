package com.gildedrose.domain;


public class BrieItem extends CommonItem{
    public BrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void processQuality() {
        if(this.quality < maxQuality)
            this.quality = this.quality + 1;
    }

}
