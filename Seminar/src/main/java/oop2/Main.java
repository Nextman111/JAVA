package oop2;

import oop2.interfaces.Flyable;
import oop2.interfaces.Runable;
import oop2.orderOfAnimals.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zooPark = new Zoo();
        zooPark.addAnimals(List.of(
                new Cat("Barsik"),
                new Dog("Sharik"),
                new Cow("Mania"),
                new Rabbit("Ushastik"),
                new Duck("Kryakva"),
                new Butterfly("Butterfloid"),
                new Shark("Megalodon")
                )
        );

//        for (Animal item: zooPark.getAnimals()){
//            System.out.println(item.say());
//        }

//        System.out.println("Sayable");
//        for (Sayable item: zooPark.getSayable()){
//            System.out.println(item.say());
//        }

        System.out.println();
        System.out.println("Runable");
        for (Runable item: zooPark.getRunable()){
            System.out.println(item);
        }

        System.out.println();
        System.out.println("Flyable");
        for (Flyable item: zooPark.getFlyable()){
            System.out.println(item);
        }

        System.out.println();
        System.out.println("Run winner");
        System.out.println(zooPark.getRunWinner());

        System.out.println();
        System.out.println("Fly winner");
        System.out.println(zooPark.getFlyWinner());

        System.out.println();
        System.out.println("Swim winner");
        System.out.println(zooPark.getSwimWinner());
    }
}
