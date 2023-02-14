package oop2.orderOfAnimals;

import oop2.animalClass.Herbivores;
import oop2.interfaces.Runable;

public class Cow extends Herbivores implements Runable {
    public Cow(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("I am cow. %s, my speed of run is %d", super.toString(), this.speedOfRun());
    }

    @Override
    public String say() {
        return "muuu-muuu";
    }
    @Override
    public int speedOfRun() {
        return 20;
    }
}
