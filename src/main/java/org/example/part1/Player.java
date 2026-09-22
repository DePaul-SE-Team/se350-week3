package org.example.part1;

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

class Entry{
    public static void main(String [] args) {
        Player player1 = new Player("player A", "Sword", 50);
        Player player2 = new Player("player A", "Bow", 50);
        Player player3 = new Player("player A", "Magic", 50);
        player1.attack();
        player2.attack();
        player3.attack();

        /** 1. Player is responsible for creating the weapon?
            2. whenever weapon is changed, player need to be changed as well?

             Player is tightly coupled to Weapon because it:

                 - Directly creates a concrete Weapon.
                 - Knows the exact Weapon constructor parameters.
                 - Calls specific Weapon methods such as getName() and getDamage().
                 - Must change if the way a Weapon is constructed or used changes.

                 Therefore, changes to Weapon may force changes to Player, even though weapon construction should not necessarily be the player’s responsibility.

            3. if (weapon.getName().equals("Bow")) {
                 // Determine whether the bow misses.
               }

               This is undesirable because Player must understand the behavior of every weapon type. Adding another weapon could require modifying Player again.
            4. dependency injection?
            5. This was not possible before because Player always created its own Weapon.
         **/
    }
}