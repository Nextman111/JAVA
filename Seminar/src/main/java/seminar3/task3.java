package seminar3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class task3 {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }
    /**1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)*/
    private static void task1() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int listLength = 10;

        for (int i = 0; i < listLength; i++) {
            list.add(random.nextInt(11));
        }

        System.out.println(list);

        list = list.stream().filter(x -> x%2 == 1).collect(Collectors.toList());

        System.out.println(list);

    }
    /**2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.*/
    private static void task2() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int listLength = 10;

        for (int i = 0; i < listLength; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println(list);

        System.out.printf("min = %d%n", Collections.min(list));
        System.out.printf("max = %d%n", Collections.max(list));

        int average = list.stream().mapToInt(x-> x).sum() / list.size();
        System.out.printf("average = %d%n", average);

    }

    /**3. Пройти по списку из задания 2 с урока и удалить повторяющиеся элементы.*/
    private static void task3() {
        String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        Random random = new Random();
        List<String> planetList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            planetList.add(solarSystemPlanets[random.nextInt(0,solarSystemPlanets.length)]);
        }

        System.out.println(planetList);

        for (String item: solarSystemPlanets) {
            System.out.println(item + " : " + Collections.frequency(planetList,item));
        }

        planetList = planetList.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());

        System.out.println(planetList);
    }
}
