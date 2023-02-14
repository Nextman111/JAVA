package oop2.animalClass;

import oop2.Animal;

public abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public String feed() { return "eat fish"; }
}
