package models.mediator;

import java.util.ArrayList;

import models.colleague.User;

public class ChatMediatorImpl implements ChatMediator{
    private ArrayList<User> users;

    public ChatMediatorImpl() {
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : users) {
            if(u != user) {
                u.recieve(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
    
}
