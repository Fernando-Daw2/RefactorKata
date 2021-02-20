package com.gildedrose.domain;


public class BackstageItem extends CommonItem{
    public BackstageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void processQuality() {
        if (this.sellIn <= 0) {
            this.quality = 0;
        }
        else if (this.sellIn <= 5) {
            this.quality = this.quality + 3;
        }else if (this.sellIn <= 10) {
            this.quality = this.quality + 2;
        }else
            this.quality = this.quality + 1;

        if (this.quality > maxQuality){
            this.quality = maxQuality;
        }
    }


}
