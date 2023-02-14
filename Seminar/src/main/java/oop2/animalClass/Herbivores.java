package oop2.animalClass;

import oop2.Animal;

public abstract class Herbivores extends Animal {
    public Herbivores(String name) {
        super(name);
    }

    @Override
    public String feed() { return "eat grass"; }
}
