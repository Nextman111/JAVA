package oop2.orderOfAnimals;

import oop2.animalClass.Herbivores;
import oop2.interfaces.Runable;

public class Rabbit extends Herbivores implements Runable {
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("I am rabbit. %s, my speed of run is %d", super.toString(), this.speedOfRun());
    }

    @Override
    public String say() {
        return "zay-zay";
    }

    @Override
    public int speedOfRun() {
        return 30;
    }
}
