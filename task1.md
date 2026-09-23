## Simple Practice

### Starter code is under the `part1` package (`org.example.part1.Player`)

```java
public class Player {
    private String name;
    private Weapon weapon;

    public Player(String name, String weaponName, double weaponDamage) {
        this.name = name;
        this.weapon = new Weapon(weaponName, weaponDamage);
    }

    public void attack() {
        System.out.println(
            name + " attacks with " + weapon.getName()
            + " for " + weapon.getDamage() + " damage."
        );
    }
}

class Weapon {
    private String name;
    private double damage;

    public Weapon(String name, double damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }
}

class Entry {
    public static void main(String[] args) {
        // your code goes here
    }
}
```

`Entry` is already in `Player.java` with an empty `main`; that's where you'll write your code for task 1.

### Tasks

1. In `Entry.main`, create at least three `Player` instances, each with a different weapon, then call `attack()` on each and run the program to confirm the output:
    - Sword
    - Bow
    - Magic Staff
2. Who is responsible for creating a `Player`'s `Weapon`; `Player` itself, or the caller? Point to the exact line where that happens.
3. Explain why `Player` and `Weapon` are tightly coupled.
4. Suppose a new weapon type needs its own behavior (e.g., a `Bow` that can miss, unlike a `Sword`). What has to change, and where, to support that with the current design? Just think about it, you do not need to modify the code.
5. Refactor `Player` so a `Weapon` is passed into its constructor instead of being created inside it. Show the before/after code for `Player`'s constructor and for `Entry.main`. How does this decouple the code?
6. How does this refactor make `Player` easier to unit test? Specifically, what could you now do in a test that you couldn't do before?
