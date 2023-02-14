package oop2;

import oop2.interfaces.Flyable;
import oop2.interfaces.Runable;
import oop2.interfaces.Sayable;
import oop2.interfaces.Swimable;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private Radio radio = new Radio();
    public List<Animal> addAnimals(List<Animal> newAnimals){
        this.animals.addAll(newAnimals);
        return this.animals;
    }

    public List<Animal> addAnimals(){
        return this.animals;
    }

    public List<Animal> getAnimals(){
        return this.animals;
    }

    public List<Sayable> getSayable(){
        List<Sayable> result = new ArrayList<>();

        for (Animal item: animals){
            result.add(item);
        }

        result.add(radio);
        return result;
    }

    public List<Runable> getRunable(){
        List<Runable> result = new ArrayList<>();

        for (Animal item: animals){
            if (item instanceof Runable){
                result.add((Runable) item);
            }
        }

        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();

        for (Animal item : animals) {
            if (item instanceof Flyable) {
                result.add((Flyable) item);
            }
        }

        return result;
    }

    public List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>();

        for (Animal item : animals) {
            if (item instanceof Swimable) {
                result.add((Swimable) item);
            }
        }

        return result;
    }

    public Runable getRunWinner(){
        List<Runable> animals = this.getRunable();
        Runable winner = animals.get(0);

        for (Runable item: animals){
            if (winner.speedOfRun() < item.speedOfRun()){
                winner = item;
            }

        }

        return winner;
    }

    public Flyable getFlyWinner(){
        List<Flyable> animals = this.getFlyable();
        Flyable winner = animals.get(0);

        for (Flyable item: animals){
            if (winner.speedOfFly() < item.speedOfFly()){
                winner = item;
            }

        }

        return winner;
    }

    public Swimable getSwimWinner(){
        List<Swimable> animals = this.getSwimable();
        Swimable winner = animals.get(0);

        for (Swimable item: animals){
            if (winner.swimSpeed() < item.swimSpeed()){
                winner = item;
            }

        }

        return winner;
    }
}
