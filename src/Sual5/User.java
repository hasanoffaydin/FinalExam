package Sual5;

public abstract class User {
    String name ;
    ChatMessage chatMessage;

    public User(String name, ChatMessage chatMessage) {
        this.name = name;
        this.chatMessage = chatMessage;
    }

    abstract void send(String message);
    abstract void receive(String message);
}
