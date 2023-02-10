package seminar5;

import java.util.*;

public class homework5 {
    public static void main(String[] args) {
//        phoneBook();
        employersList();
    }

    private static void employersList() {
        /**Пусть дан список сотрудников:
         Иван Иванов
         Светлана Петрова
         Кристина Белова
         Анна Мусина
         Анна Крутова
         Иван Юрин
         Петр Лыков
         Павел Чернов
         Петр Чернышов
         Мария Федорова
         Марина Светлова
         Мария Савина
         Мария Рыкова
         Марина Лугова
         Анна Владимирова
         Иван Мечников
         Петр Петин
         Иван Ежов
         Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
         Отсортировать по убыванию популярности.
         * */

    }

    private static void phoneBook() {
        /**Реализуйте структуру телефонной книги с помощью HashMap,
         *  учитывая, что 1 человек может иметь несколько телефонов.*/
        // key = Name, value = String ArrayList[]
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();

        ArrayList<String> phones = new ArrayList<>();
        phones.add("123355");
        phones.add("123333");
        phoneBook.put("Ivan", phones);

        phones = new ArrayList<>();
        phones.add("123775");
        phones.add("123376");
        phoneBook.put("Sergey", phones);


        while (true){
            System.out.println("Введите команду (help - справка по всем командам):");
            String userInput = getStringFromUser();
            switch (userInput){
                case ("help"):
                    phoneBookCommands();
                    break;
                case ("add"):
                    addNoteHandler(phoneBook);
                    break;
                case ("remove"):
                    removeNoteHandler(phoneBook);
                    break;
                case ("print"):
                    if (phoneBook.size() > 0){
                        for(var item: phoneBook.entrySet()){
                            printPhone(item);
                        }
                    } else {
                        System.out.println("Телефонная книга пуста.");
                    }
                    break;
                case ("exit"):
                    System.out.println("Программа закрыта.");
                    System.exit(0);
                    break;
                default:
                    break;

            }
        }
    }


    private static void removeNoteHandler(Map<String, ArrayList<String>> phoneBook) {
        String key = new String();

        System.out.println("Введите имя записи, которую нужно удалить");
        while (true) {
            key = getStringFromUser().trim();

            if (key.isBlank()){
                System.out.println("Имя не может быть пустым");
                continue;
            }

            if (!phoneBook.containsKey(key)){
                System.out.printf("Записи %s не существует%n", key);
            } else {
                phoneBook.remove(key);
                System.out.printf("Запись %s удалена%n", key);
            }

            System.out.println("Продолжить удаление записей - пустая строка");
            System.out.println("Завершить удаление записей - любой символ");

            key = getStringFromUser();

            if (!key.isBlank()){
                break;
            }
        }

    }

    private static void printPhone(Map.Entry<String, ArrayList<String>> item) {
        System.out.printf("%s : ", item.getKey());
        for (String phone: item.getValue()){
            System.out.printf("| %s | ", phone);
        }
        System.out.printf("%n");
    }


    private static void addNoteHandler(Map<String, ArrayList<String>> phoneBook) {
        String key = new String();
        ArrayList<String> phones = new ArrayList<>();


        while (true){

            System.out.println("Введите имя:");
            key = getStringFromUser().trim();

            if (key.equals("exit")){
                System.out.println("Добавление прервано");
                break;
            }

            if (key.isBlank()){
                System.out.println("Имя не должно быть пустым");
                continue;
            }

            phoneHandler(phones);
            addRecordHandler(key,phones,phoneBook);
            break;
        }
    }

    private static void addRecordHandler(String key, ArrayList<String> phones, Map<String, ArrayList<String>> phoneBook) {
        if (phoneBook.containsKey(key)){
            dublicateKeyHandler(key, phones, phoneBook);
        } else {
            phoneBook.put(key,phones);
            System.out.printf("Запись %s добавлена %n", key);
        }

    }

    private static void dublicateKeyHandler(String key, ArrayList<String> phones, Map<String, ArrayList<String>> phoneBook) {
        System.out.printf("Запись %s уже существует.%n", key);
        System.out.println("Выберите действие");
        System.out.println("Перезаписать: любой символ");
        System.out.println("Добавить номер(а) к существующей записи: пустая строка");

        String action = getStringFromUser();

        if (action.isBlank()){
            for (var item: phoneBook.get(key)){
                if (!phones.contains(item)){
                    phones.add(item);
                }
            }
            phoneBook.put(key,phones);
            System.out.printf("Запись %s обновлена%n", key);
        } else {
            phoneBook.put(key,phones);
            System.out.printf("Запись %s пеоезаписана%n", key);
        }

    }


    private static void phoneHandler(ArrayList<String> phones) {
        String tmpNum;
        while (true){
            System.out.println("Введите номер");
            tmpNum = getStringFromUser().trim();
            if (tmpNum.isBlank()){
                System.out.println("Номер не может быть пустым");
                continue;
            }
            phones.add(tmpNum);

            System.out.println("Добавить еще один номер? (пустое значение - пропустить)");
            tmpNum = getStringFromUser();
            if (tmpNum.isBlank()){
                break;
            }
        }

    }


    private static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    private static void phoneBookCommands(){
        System.out.println("help - все команды");
        System.out.println("print - распечатать телефонную книгу");
        System.out.println("add - добавить запись");
        System.out.println("remove - удалить запись");
        System.out.println("exit - выход");
    }

}
