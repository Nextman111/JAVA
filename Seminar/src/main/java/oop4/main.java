package oop4;

import oop4.Defence.HavyShield;
import oop4.Heroes.Archer;
import oop4.Heroes.Footman;
import oop4.Weapons.Melee;
import oop4.Weapons.Ranged;

public class main {
    public static void main(String[] args) {
        Team<Footman> footmansTeam = new Team<>();
        footmansTeam.add(new Footman("Joe", 55, new Melee("Sword", 15), new HavyShield("Красный щит", 32)));
        footmansTeam.add(new Footman("Bill", 75, new Melee("Sword", 10), new HavyShield("Серый щит", 27)));
        footmansTeam.add(new Footman("Adam", 57, new Melee("Spear", 25), new HavyShield("Синий щит", 44)));
        footmansTeam.add(new Footman("Ilon", 52, new Melee("axe", 17), new HavyShield("Желтый щит", 198)));

        System.out.println("Team helth " + footmansTeam.getHealth() +
                " max range " + footmansTeam.getMaxRange() +
                " team power " + footmansTeam.getTeamDamage() +
                " min team sheald " + footmansTeam.getLowerShieldTeamInMelee());
        for (Footman hero : footmansTeam) {
            System.out.println(hero);
        }

        System.out.println("_____________________________");
        Team<Hero> heroesTeam = new Team<>();
        heroesTeam.add(new Footman("Artas", 60, new Melee("Sword", 20), new HavyShield("Круглый щит", 30)));
        heroesTeam.add(new Footman("Darius", 57, new Melee("Spear", 15), new HavyShield("Квадратный щит", 53)));
        heroesTeam.add(new Archer("Ashe", 40, new Ranged("Bow", 14, 25)));
        heroesTeam.add(new Archer("Legolaz", 40, new Ranged("Bow", 16, 20)));

        System.out.println("Team helth " + heroesTeam.getHealth() +
                " max range " + heroesTeam.getMaxRange() +
                " team power " + heroesTeam.getTeamDamage() +
                " min team sheald " + heroesTeam.getLowerShieldTeamInMelee());
        for (Hero hero : heroesTeam) {
            System.out.println(hero);
        }

        Hero footman1 = new Footman("Petr", 100, new Melee("Sword", 20));
        Hero footman2 = new Footman("Fedr", 80, new Melee("Spear", 25));

        System.out.println("_____________________________");

         battle(footman1, footman2);
    }


    public static void battle(Hero striking, Hero hitting){
        Hero tmp = striking;

        while (true){
            System.out.println();
            System.out.println(striking.getName() + " наносит удар по " + hitting.getName());
            striking.hit(hitting);
            System.out.println("У " + hitting.getName() + " осталось "+ hitting.getHealth() + " здоровья");

            if (hitting.getHealth() <= 0){
                System.out.println("Победитель " + striking.getName() + " здоровья осталось " + striking.getHealth());
                break;

            }

            striking = hitting;
            hitting = tmp;
            tmp = striking;
        }

    }
}
