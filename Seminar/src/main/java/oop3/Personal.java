package oop3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Personal implements Iterable<User> {
    List<User> users = new ArrayList<>();

    public Personal(List<User> users) {
        this.users.addAll(users);
    }

    public Personal() { }

    public List<User> toList(){
        List<User> result = new ArrayList<>();
        for (User user: this){
            result.add(user);
        }
        return result;
    }

    @Override
    public void forEach(Consumer<? super User> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < users.size();
            }

            @Override
            public User next() {
                return users.get(index++);
            }
        };
    }
}
