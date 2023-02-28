package oop4.Weapons;

import oop4.Defence.HavyShield;

public class Melee implements Weapon {
    private String name;
    private int damage = 0;
    private HavyShield shield;

    public Melee(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public Melee(String name, int damage, HavyShield shield) {
        this.name = name;
        this.damage = damage;
        this.shield = shield;
    }
    @Override
    public String toString() {
        return "Melee{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                '}';
    }

    public HavyShield getShield() {
        return shield;
    }

    public int getDamage() {
        return damage;
    }

}
