package com.gildedrose.domain;

import com.gildedrose.Item;
import com.gildedrose.interfaces.ItemInterface;

public class LegendaryItem extends Item implements ItemInterface {
    
    public LegendaryItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void processSellIn() {
        if (this.sellIn < 0)
            this.sellIn = 0;
        
    }

    @Override
    public void processQuality() {
        if (this.quality != 80)
            this.quality = 80;
    }


}
