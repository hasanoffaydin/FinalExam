package Sual5;

public class UserImp extends User{

    public UserImp(ChatMessage chatMessage ,String name) {
        super(name,chatMessage);
    }

    @Override
    void send(String message) {
        System.out.println("Message gonderildi : " + message);
        chatMessage.sendMessage(message);
    }

    @Override
    void receive(String message) {
        System.out.println("Message qebul edildi : " + message);
    }
}
