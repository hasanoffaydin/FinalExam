package Sual5;

import java.util.ArrayList;
import java.util.List;

public class ChatMessageImp implements ChatMessage{
    List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message) {
        for(User user : users){
            user.receive(message);
        }
    }
}
