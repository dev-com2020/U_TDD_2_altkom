package org.example.wzorce;

public class Singleton {
    private static Singleton instance;

    private Singleton() {} // Prywatny konstruktor

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Tworzymy instancję tylko raz
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
