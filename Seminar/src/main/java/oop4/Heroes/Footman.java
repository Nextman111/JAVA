package oop4.Heroes;

import oop4.Defence.HavyShield;
import oop4.Hero;
import oop4.Weapons.Melee;

public class Footman extends Hero<Melee, HavyShield> {
    public Footman(String name, int healthPoint, Melee weapon) {
        super(name, healthPoint, weapon);
    }

    public Footman(String name, int health, Melee weapon, HavyShield shield) {
        super(name, health, weapon, shield);
    }

    @Override
    public String toString() {
        return "Footman{" +
                super.toString() +
                '}';
    }
}
