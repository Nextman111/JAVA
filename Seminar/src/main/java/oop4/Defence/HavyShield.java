package oop4.Defence;

public class HavyShield implements Armor {
    private String name;
    private int armor = 20;

    public HavyShield(String name) {
        this.name = name;
    }

    public HavyShield(String name, int armor) {
        this.name = name;
        this.armor = armor;
    }

    @Override
    public int getArmor() {
        return this.armor;
    }

    @Override
    public String toString() {
        return "HavyShield{" +
                "name='" + name + '\'' +
                ", armor=" + armor +
                '}';
    }
}
