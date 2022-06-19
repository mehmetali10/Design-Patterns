package models.colleague;

import models.mediator.ChatMediator;

public class UserImpl extends User {

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " Sending message: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void recieve(String msg) {
       System.out.println(this.name + " Received message: " + msg);
    }
    
}
