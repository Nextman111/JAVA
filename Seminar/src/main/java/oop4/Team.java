package oop4;

import oop4.Heroes.Archer;
import oop4.Heroes.Footman;
import oop4.Weapons.Ranged;
import oop4.Weapons.Weapon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Hero> implements Iterable<T> {
    List<T> heroesTeam = new ArrayList<>();


    public void add(T hero) {
        heroesTeam.add(hero);
    }


    @Override
    public Iterator<T> iterator() {
        return heroesTeam.iterator();
    }

    public int getHealth() {
        int health = 0;

        for (T hero : heroesTeam) {
            health += hero.getHealth();
        }
        return health;
    }

    public int getMaxRange() {
        int maxRange = 0;

        for (T hero : heroesTeam) {
            if (hero instanceof Archer) {
                maxRange = Math.max(maxRange, ((Archer) hero).getRange());
            }
        }
        return maxRange;
    }

    public int getTeamDamage() {
        int teamDamage = 0;

        for (T hero : this) {
            teamDamage += hero.getDamage();
        }
        return teamDamage;
    }

    public int getLowerShieldTeamInMelee(){
        int minShield = 0;

        for (T hero : heroesTeam) {
            if (hero instanceof Footman && hero.getShield() != null) {
                minShield = minShield == 0 ? hero.getShield().getArmor() : Math.min(minShield, hero.getShield().getArmor());
            }
        }
        return minShield;
    }
}
