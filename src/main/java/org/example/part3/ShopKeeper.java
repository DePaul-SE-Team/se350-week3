package org.example.part3;

public class ShopKeeper {
    public void buyItem(Inventory inventory, String itemName, int price) {
        if (inventory.getGoldCoins() >= price) {
            inventory.setGoldCoins(inventory.getGoldCoins() - price);
            System.out.println("Bought " + itemName + " for " + price + " gold.");
        } else {
            System.out.println("Not enough gold to buy " + itemName + ".");
        }
    }
}

class Entry {
    public static void main(String[] args) {
        // your code goes here
    }
}
