package task1_1;


import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }

    private static void task3() {
        /**
         * Дан массив nums = [3,2,2,3] и число val = 3.
         * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
         * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
         * а остальные - равны ему.
         */
        int[] nums = new int[]{3, 2, 3, 3, 3, 5, 7, 3, 6, 4, 4, 3};
        int val = 3;

        // Вывод текущего массива
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        int cur_left = 0;
        int cur_rigth = nums.length - 1;

        while (cur_left < cur_rigth){
            if (nums[cur_rigth] == val ){
                cur_rigth--;
                continue;
            }
            if (nums[cur_left] != val){
                cur_left++;
                continue;
            }
            if (nums[cur_left] == val){
                nums[cur_left] = nums[cur_rigth];
                nums[cur_rigth] = val;
                cur_rigth--;
                cur_left++;
            }
        }

        // Измененный массив
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }

    }

    private static int userImputInt(){
         /**Все попытки сделать проверку ввода на целое число в одном методе потерпели неудачу.
         Это единственная успешная попытка, но с тем условием что цикл проверки на ввод нужно делать вне метода,
         Иначе метод просто зацикливается. Почему? Непонятно. В других языках input() работает более предсказуемо.
        */

        Scanner scanner = new Scanner(System.in);
        return  scanner.hasNextInt() ? scanner.nextInt() : -1;
    }

    private static void task2() {
        /** Написать метод, который определяет, является ли год високосным,
         и возвращает boolean (високосный - true, не високосный - false).
         Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.?
         */
        int year = -1;
        System.out.print("Введите год: ");

        while (year == -1){
            year = userImputInt();
            if (year < 0 ){
                System.out.println("Введите целое число: ");
            }
        }

        System.out.println(year);

        boolean leap_year = year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));

        System.out.printf("Год %d %s %n", year, (leap_year) ? "високосный" : "не високосный");
    }

    private static void task1() {
        // Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.printf(" %d", array[i]);
        }

        int max = array[0];
        int min = array[0];

        for (int item : array) {
            max = Math.max(item, max);
            min = Math.min(item, min);
        }

        System.out.printf("%nmax = %d%n", max);
        System.out.printf("min = %d%n", min);

    }
}