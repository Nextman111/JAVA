package oop2.orderOfAnimals;

import oop2.animalClass.Herbivores;
import oop2.interfaces.Flyable;

public class Butterfly extends Herbivores implements Flyable {
    public Butterfly(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("I am butterfly. %s, my fly speed %d", super.toString(), this.speedOfFly());
    }

    @Override
    public int speedOfFly() {
        return 10;
    }

    @Override
    public String say() {
        return "wwhwhwh";
    }
}
