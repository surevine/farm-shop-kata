package com.farmshop;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("Firing up the tests!");

        Item[] items = new Item[] {
                new Item("Potato", 10, 20), //
                new Item("Local Wine", 2, 0), //
                new Item("Carrot", 5, 7), //
                new Item("Morello Cherry Jam", 0, 80), //
                new Item("Morello Cherry Jam", -1, 80),
                new Item("Harvest Festival Ticket", 15, 20),
                new Item("Harvest Festival Ticket", 10, 49),
                new Item("Harvest Festival Ticket", 5, 49),
                // this perishable item does not work properly yet
                new Item("Perishable Fresh Bread", 3, 6) };

        FarmShop app = new FarmShop(items);

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
