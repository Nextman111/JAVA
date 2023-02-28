package oop4.Weapons;

import oop4.Defence.HavyShield;
import oop4.Defence.LigthShield;

public class Ranged implements Weapon {
    private String name;
    private int damage = 0;
    private int range;
    private LigthShield shield;
    public Ranged(String name, int damage, int range) {
        this.name = name;
        this.damage = damage;
        this.range = range;
    }

    public LigthShield getShield() {
        return shield;
    }

    public Ranged(String name, int damage, int range, LigthShield shield) {
        this.name = name;
        this.damage = damage;
        this.range = range;
        this.shield = shield;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    @Override
    public String toString() {
        return "Range{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", range=" + range +
                '}';
    }

}
