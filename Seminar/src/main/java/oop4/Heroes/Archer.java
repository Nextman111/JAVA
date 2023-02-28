package oop4.Heroes;

import oop4.Defence.Armor;
import oop4.Defence.LigthShield;
import oop4.Hero;
import oop4.Weapons.Ranged;

public class Archer extends Hero<Ranged, LigthShield> {
    public Archer(String name, int healthPoint, Ranged weapon) {
        super(name, healthPoint, weapon);
    }

    public Archer(String name, int health, Ranged weapon, LigthShield shield) {
        super(name, health, weapon, shield);
    }

    public int getRange() {
        return weapon.getRange();
    }

    @Override
    public String toString() {
        return "Archer{" +
                super.toString() +
                '}';
    }
}
