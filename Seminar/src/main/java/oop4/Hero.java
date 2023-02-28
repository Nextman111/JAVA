package oop4;

import oop4.Defence.Armor;
import oop4.Weapons.Weapon;

import java.util.Random;

/**
 * Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
 **/
public abstract class Hero<W extends Weapon, A extends Armor> {
    private String name;
    private int health;
    protected W weapon;
    protected A shield;

    protected Hero(String name, int health, W weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public Hero(String name, int health, W weapon, A shield) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public A getShield() {
        return shield;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public int getDamage() {
        return weapon.getDamage();
    }

    public int damageFork(){
        Random random = new Random();
        return random.nextInt(weapon.getDamage());
    }
    public boolean hit(Hero heroRecepient) {
        return !heroRecepient.reduceHealt(damageFork());
    }

    public boolean reduceHealt(int healt){
        this.health = this.health - healt;
        return healt > 0;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", healthPoint=" + health +
                ", weapon=" + weapon;
    }
}


