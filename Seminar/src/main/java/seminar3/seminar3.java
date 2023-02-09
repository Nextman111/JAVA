package seminar3;

import java.util.*;

public class seminar3 {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    private static void test2() {
        String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        Random random = new Random();
        List<String> planetList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            planetList.add(solarSystemPlanets[random.nextInt(0,solarSystemPlanets.length)]);
        }

        System.out.println(planetList);

//        int count = 0;
//        for ( String item: solarSystemPlanets) {
//            for (String planet: planetList) {
//                if (item.equals(planet)) count++;
//            }
//            System.out.println(item + " : " + count);
//            count = 0;
//        }

        for (String item: solarSystemPlanets) {
            System.out.println(item + " : " + Collections.frequency(planetList,item));
        }
    }

    private static void test1() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 101; i++) {
            list.add(random.nextInt(3, 11));
        }

        list.sort(Comparator.naturalOrder());

        for (int item: list) {
            System.out.print(item);
            System.out.print(' ');
        }

    }

}
