package org.example.wzorce;

import java.util.ArrayList;
import java.util.List;

// Mediator
class ChatRoom {
    public void showMessage(User user, String message) {
        System.out.println(user.getName() + ": " + message);
    }
}

// Klasa użytkownika
class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() { return name; }
    public void sendMessage(String message) { chatRoom.showMessage(this, message); }
}

// Użycie Mediatora
//public class Main {
//    public static void main(String[] args) {
//        ChatRoom chat = new ChatRoom();
//        User alice = new User("Alice", chat);
//        User bob = new User("Bob", chat);
//
//        alice.sendMessage("Hi Bob!"); // "Alice: Hi Bob!"
//        bob.sendMessage("Hello Alice!"); // "Bob: Hello Alice!"
//    }
}
