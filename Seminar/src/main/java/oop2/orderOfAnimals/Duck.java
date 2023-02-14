package oop2.orderOfAnimals;

import oop2.animalClass.Herbivores;
import oop2.interfaces.Flyable;
import oop2.interfaces.Runable;
import oop2.interfaces.Sayable;
import oop2.interfaces.Swimable;

public class Duck extends Herbivores implements Runable, Flyable, Swimable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public int swimSpeed() {
        return 10;
    }

    @Override
    public int speedOfFly() {
        return 50;
    }

    @Override
    public int speedOfRun() {
        return 5;
    }

    @Override
    public String say() {
        return "krya-krya";
    }

    @Override
    public String toString() {
        return String.format("I am duck. %s, my speed of run is %d, my fly speed %d, my swim speed %d", super.toString(), this.speedOfRun(), this.speedOfFly(), this.swimSpeed());
    }
}
