package Sual5;

public class Main {
    public static void main(String[] args) {
        ChatMessage chatMessage = new ChatMessageImp();

        User user1 = new UserImp(chatMessage,"Aydin");
        User user2 = new UserImp(chatMessage,"Abbas");


    }
}
