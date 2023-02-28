package oop4.Defence;

public class LigthShield  implements Armor {
    private String name;
    private int armor = 5;

    public LigthShield(String name) {
        this.name = name;
    }

    public LigthShield(String name, int armor) {
        this.name = name;
        this.armor = armor;
    }

    @Override
    public int getArmor() {
        return this.armor;
    }

    @Override
    public String toString() {
        return "LigthShield{" +
                "name='" + name + '\'' +
                ", armor=" + armor +
                '}';
    }
}
