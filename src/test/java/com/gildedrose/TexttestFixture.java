package com.gildedrose;

import com.gildedrose.domain.*;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new CommonItem("+5 Dexterity Vest", 0, 20), //
                new CommonItem("+5 Dexterity Vest", 0, 0), //
                new CommonItem("+5 Dexterity Vest", 1, 20), //
                new BrieItem("Aged Brie", 2, 0), //
                new BrieItem("Aged Brie", 2, 50), //
                new CommonItem("Elixir of the Mongoose", 5, 7), //
                new LegendaryItem("Sulfuras, Hand of Ragnaros", 0, 80), //
                new LegendaryItem("Sulfuras, Hand of Ragnaros", -1, 80),
                new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 10, 20),
                new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 5, 20),
                new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 0, 20),

                // this conjured item does not work properly yet
                new ConjuredItem("Conjured Mana Cake", 3, 6),
                new ConjuredItem("Conjured Mana Cake", 0, 6)
        };

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
