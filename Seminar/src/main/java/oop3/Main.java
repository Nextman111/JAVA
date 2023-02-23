package oop3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User frontend_boss = (new User("Petr", "Petrovich", 22));
        Personal frontend = new Personal(List.of(
                    new User("Petr", "Petrovich", 22),
                    new User("Oleg", "Vasiliyevich", 45),
                    new User("Vasiliy", "Ivanovich", 27),
                    new User("Sergei", "Sergeevich", 26),
                    new User("Stanislav", "Olegovich", 23)
        ));
        frontend_boss.setPersonal(frontend);

        User backend_boss = (new User("Dmitriy", "Peh", 32));
        Personal backend = new Personal(List.of(
                new User("Oleg","Vasiliyevich", 40),
                new User("Ivan","Sergeevich", 22),
                new User("Igor","Vasiliyevich", 24),
                new User("Nikolay","Ivanovich", 31),
                new User("Marat","Sergeevich", 25),
                new User("Sergey","Ivanovich", 23)
        ));
        backend_boss.setPersonal(backend);

        User big_boss = (new User("Petr", "Petrovich", 22));
        Personal office = new Personal(List.of(frontend_boss,backend_boss));
        big_boss.setPersonal(office);

//        System.out.println(personal);

//        for (User user:  personal){
//            System.out.println(user);
//        }

        List<User> users = big_boss.getPersonal().toList();
        Collections.sort(users);

        Company company = new Company(big_boss);
        System.out.println();
        for (User user:  company){
            System.out.println(user);
        }


    }
}
