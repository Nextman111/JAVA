package oop2.orderOfAnimals;

import oop2.animalClass.Fish;
import oop2.animalClass.Predator;
import oop2.interfaces.Swimable;

public class Shark extends Fish implements Swimable {
    public Shark(String name) {
            super(name);
        }

        @Override
        public int swimSpeed() {
            return 40;
        }

        @Override
        public String say() {
            return "----";
        }

        @Override
        public String toString() {
            return String.format("I am shark. %s, my swim speed %d", super.toString(), this.swimSpeed());
        }
}
