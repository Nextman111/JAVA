package seminar2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
//        task1();
        task2();
    }

    public static String repeatString(String text, int repeat){
        return text.repeat(repeat);
    }

    public static void saveToFile(String name, String data){
        String dir = String.join(File.separator, "src/main/resources/seminar2".split("/"));

        File file = new File(dir, name);

        if (!file.exists()){
            System.out.println("Файл создан");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(data);
            System.out.println("Файл " + file.getCanonicalPath() + " записан");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void task2() {
        /**
         *  Напишите метод, который составит строку,
         *  состоящую из 100 повторений слова TEST и метод,
         *  который запишет эту строку в простой текстовый файл,
         *  обработайте исключения.**/
        String fileName = "task2.txt";
        String text = "TEST";
        String repeatText = repeatString(text, 100);

        System.out.println(repeatText);

        saveToFile(fileName, repeatText);
    }

    public static boolean isPalindrom(String text){
        String textReverse = new StringBuilder(text).reverse().toString();
        return text.equals(textReverse);
    }

    public static void task1(){
        /**
         * Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).**/
        System.out.println("Введите фразу для проверки на палиндром: ");

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().trim();
        scanner.close();

        System.out.println(text);
        System.out.println(isPalindrom(text) ? "палиндром" : "не палиндром");
    }

}
