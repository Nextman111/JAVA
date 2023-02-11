package seminar6;

import java.util.*;


public class seminar6 {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        Integer[] array = new Integer[1000];
        fillArray(array);

        for (int item: array) {
            System.out.printf("%d ", item);
        };

        float percent = percentUnic(array);
        System.out.printf("Процент уникальных чисел равен %.2f%n", percent);
    }

    private static float percentUnic(Integer[] array) {
        Set<Integer> arraySet = new HashSet<>();

        Collections.addAll(arraySet, array);


        System.out.println();
        for (int item: arraySet) {
            System.out.printf("%d ", item);
        };

        System.out.println();
        System.out.println(array.length);
        System.out.println(arraySet.size());
        return (((float)arraySet.size()*100)/array.length);
    }

    private static void fillArray(Integer[] array) {
        if (array.length < 1) return;

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1001);
        }

    }

}
