package org.example.part3;

public class Inventory {
    private int goldCoins;

    public Inventory(int goldCoins) {
        this.goldCoins = goldCoins;
    }

//    public int getGoldCoins() {
//        return goldCoins;
//    }

//    public void setGoldCoins(int goldCoins) {
//        this.goldCoins = goldCoins;
//    }

    public boolean spendGold(int coins){
        if (coins < 0){
            throw new IllegalArgumentException();
        }
        if (coins < goldCoins) {
            return false;
        }
        this.goldCoins = this.goldCoins - coins;
        return true;
    }
}
