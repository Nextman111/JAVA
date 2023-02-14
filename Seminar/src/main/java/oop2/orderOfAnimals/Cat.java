package oop2.orderOfAnimals;

import oop2.animalClass.Predator;
import oop2.interfaces.Runable;
import oop2.interfaces.Swimable;

public class Cat extends Predator implements Runable, Swimable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public int swimSpeed() {
        return 3;
    }

    @Override
    public String toString() {
        return String.format("I am cat. %s, my speed of run is %d", super.toString(), this.speedOfRun());

    }

    @Override
    public String say() {
        return "meow-meow";
    }

    @Override
    public int speedOfRun() {
        return 35;
    }
}
