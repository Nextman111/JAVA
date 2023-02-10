package seminar5;

import java.util.HashMap;
import java.util.Map;

public class seminar5 {
    public static void main(String[] args) {
        ex01();
    }

    private static void ex01() {
        /** Создать структуру для хранения
         * номеров паспортов и фамилий
         * сотрудников организаии*/
        Map<Integer, String> people = new HashMap<>();

        people.put(123321, "Иванов");
        people.put(213245, "Васильев");
        people.put(231456, "Петрова");
        people.put(765445, "Иванов");
        people.put(865434, "Иванов");

        System.out.println(people);

        searchPeople("Иванов", people);
    }

    private static void searchPeople(String search, Map<Integer,String> people){
        for (var item: people.entrySet()) {
            if (item.getValue().equals(search))
                System.out.println(item);
        }
    }
}
