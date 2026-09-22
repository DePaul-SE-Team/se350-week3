package org.example.part3;

public class ShopKeeper {
    public void buyItem(Inventory inventory, int price) {
        if (inventory.spendGold(price))
            System.out.println("You bought item for " + price + " gold!");
        else{
            System.out.println("Not enough gold!");
        }
//        if (inventory.getGoldCoins() >= price) {
//            inventory.setGoldCoins(inventory.getGoldCoins() - price);
//            System.out.println("Bought " + itemName + " for " + price + " gold.");
//        } else {
//            System.out.println("Not enough gold to buy " + itemName + ".");
//        }
    }
}

class Entry {
    public static void main(String[] args) {
        // your code goes here
        Inventory inventory = new Inventory(3);
        ShopKeeper shopKeeper = new ShopKeeper();
        shopKeeper.buyItem(inventory, 101);

    }
}
