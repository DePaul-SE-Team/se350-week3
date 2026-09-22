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
    public static void main(String [] args){

    }
}