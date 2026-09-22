## Tell, Don't Ask Practice

### Starter code is under the `part3` package (`org.example.part3`)

```java
public class Inventory {
    private int goldCoins;

    public Inventory(int goldCoins) {
        this.goldCoins = goldCoins;
    }

    public int getGoldCoins() {
        return goldCoins;
    }

    public void setGoldCoins(int goldCoins) {
        this.goldCoins = goldCoins;
    }
}

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
```

`Entry` is already in `ShopKeeper.java` with an empty `main`.

### Tasks

1. In `Entry.main`, create an `Inventory` with some starting gold, and use `ShopKeeper.buyItem` to buy a couple of items — at least one the inventory can afford, and one it can't. Run it and confirm the output.
2. Walk through `buyItem` line by line. Which lines *ask* `Inventory` for its state? Which lines *decide* something about that state? Which lines *command* `Inventory` to change?
3. What do you think is the issue with this current design? How would you refactor it?
