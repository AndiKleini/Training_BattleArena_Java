package Pawn;

import java.util.Random;
import java.util.Vector;

import Items.IEquipment;

public class Hero {
    private String name;
    private int health;
    private int coins;
    private int leprechaun;
    private int lastKeyInput;
    private IEquipment weapon;
    private Vector<Goblin> goblins = new Vector<Goblin>();

    public Hero(String name, IEquipment equipment) {
        this.name = name;
        this.health = 100;
        this.coins = 1;
        this.leprechaun = 0;
        lastKeyInput = -1;
        weapon = equipment;
    }

    public boolean action(Hero other) {
        weapon.use(other);
        return true;
    }

    public void updateCoins() {
        coins += leprechaun + 1;
    }

    public void useGoblins(Hero other) {
        for (Goblin tmpGoblin : goblins) {
            tmpGoblin.action(other);
        }
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int hitpoints) {
        this.health -= hitpoints;
    }

    public int getCoins() {
        return coins;
    }

    public boolean addLeprechaun() {
        if (coins > 1) {
            coins -= 2;
            leprechaun++;
            return true;
        }
        return false;
    }

    public int getLeprechaun() {
        return leprechaun;
    }

    public int getNumberofGoblins() {
        return goblins.size();
    }

    public boolean addTinyGoblin(Random randomNumberGenerator) {
        if (coins > 0) {
            coins -= 1;
            goblins.add(new Goblin(1, randomNumberGenerator));
            return true;
        }
        return false;

    }

    public boolean addMediumGoblin(Random randomNumberGenerator) {
        if (coins > 2) {
            coins -= 3;
            goblins.add(new Goblin(2, randomNumberGenerator));
            return true;
        }
        return false;
    }

    public boolean addBigGoblin(Random randomNumberGenerator) {
        if (coins > 5) {
            coins -= 6;
            goblins.add(new Goblin(3, randomNumberGenerator));
            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLastKeyInput() {
        return lastKeyInput;
    }

    public void setLastKeyInput(int key) {
        lastKeyInput = key;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nCoins: " + coins + "\nLeprechaun: " + leprechaun + "\nLastKeyInput: " + lastKeyInput
                + "\n\n";
    }

}
