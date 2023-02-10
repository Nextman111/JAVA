package seminar4;

import java.util.*;

public class homework4 {
    public static void main(String[] args) {
        task1();
//        task2();
    }

    private static void task2() {
        /**2. Пусть дан LinkedList с несколькими элементами.
         * Реализуйте метод, который вернет “перевернутый” список.*/
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        int lengthList = 10;

        for (int i = 0; i < lengthList; i++) {
            linkedList.add(random.nextInt(11));
        }

        System.out.println(linkedList);
        System.out.println(reverseIntList(linkedList));
        System.out.println(linkedList);
    }

    public static LinkedList<Integer> reverseIntList(LinkedList<Integer> linkedList){
        LinkedList<Integer> reverseList = new LinkedList<>();

        for (int i = linkedList.size() -1 ; i >= 0; i--) {
            reverseList.add(linkedList.get(i));
        }
        return reverseList;
    }


    public static LinkedList<String> reverseStringList(LinkedList<String> linkedList){
        LinkedList<String> reverseList = new LinkedList<>();

        for (int i = linkedList.size() -1 ; i >= 0; i--) {
            reverseList.add(linkedList.get(i));
        }
        return reverseList;
    }


    private static void task1() {
        /**1. Реализовать консольное приложение, которое:
         Принимает от пользователя и “запоминает” строки.
         Если введено print, выводит строки так,
         чтобы последняя введенная была первой в списке, а первая - последней.
         Если введено revert, удаляет предыдущую введенную строку из памяти.*/
        String userString;
        LinkedList<String> linkedList = new LinkedList<>();

        task1Help();

        while (true) {
            System.out.println("Введите строку для добавления в список: ");
            userString = getStringFromUser();
            if (userString.isBlank()){
                System.out.println("Строка пустая");
                continue;
            }
            switch (userString.trim()) {
                case ("help"):
                    task1Help();
                    break;
                case ("print"):
                    System.out.println(reverseStringList(linkedList));
                    break;
                case ("revert"):
                    if (linkedList.size() > 0) {
                        linkedList.removeLast();
                        System.out.println("Посленее добавление удалено");
                        System.out.println(reverseStringList(linkedList));
                    } else {
                        System.out.println("Список пуст");
                    }
                    break;
                case ("exit"):
                    System.out.println("Программа остановлена");
                    System.exit(0);
                    break;
                default:
                    linkedList.add(userString);
                    System.out.println("Запись добавлена");
                    break;
            }
        }
    }


    private static void task1Help(){
        System.out.println("help - все команды");
        System.out.println("print - распечатать массив");
        System.out.println("revert - удалить последнее добавление");
        System.out.println("exit - выход");
    }


    private static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
