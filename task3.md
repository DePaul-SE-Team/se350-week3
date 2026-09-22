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
3. Suppose a second class; say, a `Blacksmith` who repairs gear for gold; needs the same "enough gold?" check before charging the player. What would you have to do to add that, given the current design? What happens if `Blacksmith` and `ShopKeeper` each implement the check slightly differently?
4. This is what "Tell, Don't Ask" warns about: code that reaches into an object, inspects its state, and mutates it from the outside, instead of telling the object what happened and letting it decide. Where should the "enough gold?" decision and the update to `goldCoins` actually live?
5. Refactor `Inventory` so it's responsible for its own spending decision; callers should no longer need `getGoldCoins()` or `setGoldCoins()` to buy something. Refactor `ShopKeeper.buyItem` to just tell `Inventory` what's being purchased, and let `Inventory` report back whether it succeeded. Show your before/after code for both classes.
6. After your refactor, does `Inventory` still need a public setter for `goldCoins`? If you remove it, what class of bug becomes impossible from outside code, no matter how many classes end up using `Inventory`?
7. Compare this refactor to the constructor-injection refactors in task1/task2. Those were about *who creates* a dependency; this one is about *who decides and acts* on an object's own state. Are these the same problem, or different ones? Explain.
