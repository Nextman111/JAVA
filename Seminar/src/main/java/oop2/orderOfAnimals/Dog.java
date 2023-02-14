package oop2.orderOfAnimals;

import oop2.animalClass.Predator;
import oop2.interfaces.Runable;
import oop2.interfaces.Swimable;

public class Dog extends Predator implements Runable, Swimable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public int swimSpeed() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("I am dog. %s, my speed of run is %d", super.toString(), this.speedOfRun());
    }

    @Override
    public String say() {
        return "gav gav";
    }

    @Override
    public int speedOfRun() {
        return 25;
    }
}
