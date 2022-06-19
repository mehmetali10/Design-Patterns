package models.mediator;

import models.colleague.User;

public interface ChatMediator {
    public void sendMessage(String msg, User user);
    public void addUser(User user);
}