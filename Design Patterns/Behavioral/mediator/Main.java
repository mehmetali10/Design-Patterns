import models.colleague.User;
import models.colleague.UserImpl;
import models.mediator.ChatMediator;
import models.mediator.ChatMediatorImpl;

public class Main{

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User ali = new UserImpl(mediator, "Ali");
        User ceku = new UserImpl(mediator, "Ceku");
        User sema = new UserImpl(mediator, "Sema");
        mediator.addUser(ali);
        mediator.addUser(ceku);
        mediator.addUser(sema);

        ali.send("merhaba");
    }
}