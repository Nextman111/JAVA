package oop3;

import java.util.*;

public class Company implements Iterable<User>{
    private User user;
    public Company(User user) {
        this.user = user;

    }

    private List<User> getSubordinates(User user){
        List<User> users = new ArrayList<>();
        users.add(user);
        if (!user.getPersonal().iterator().hasNext()) {
            return  users;
        }

        for (User subUser: user.getPersonal()){
            users.addAll(getSubordinates(subUser));
        }

        return users;
    }

    private List<User> getSubUsersWide(User user) {
        List<User> users = new ArrayList<>();
        Queue<User> usersQueue = new ArrayDeque<>();
        usersQueue.offer(user);
        while (usersQueue.size() > 0) {
            User userItem = usersQueue.poll();
            users.add(userItem);
            for (User subUser: userItem.getPersonal()) {
                usersQueue.offer(subUser);
            }
        }
        return users;
    }

    @Override
    public Iterator<User> iterator() {
        List<User> users = new ArrayList<>();

        for(User user : this.user.getPersonal()) {
            users.addAll(getSubUsersWide(user));
        }

        return users.iterator();
    }
}
