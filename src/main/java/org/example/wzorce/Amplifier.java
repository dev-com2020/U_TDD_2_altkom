package org.example.wzorce;

// Składowe systemu
class Amplifier {
    void turnOn() { System.out.println("Amplifier ON"); }
    void turnOff() { System.out.println("Amplifier OFF"); }
}

class DVDPlayer {
    void playMovie() { System.out.println("Playing movie"); }
    void stopMovie() { System.out.println("Stopping movie"); }
}

// Fasada upraszczająca obsługę systemu
class HomeTheaterFacade {
    private Amplifier amp;
    private DVDPlayer dvd;

    public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd) {
        this.amp = amp;
        this.dvd = dvd;
    }

    public void watchMovie() {
        amp.turnOn();
        dvd.playMovie();
    }

    public void endMovie() {
        dvd.stopMovie();
        amp.turnOff();
    }
}

//// Użycie Fasady
//public class Main {
//    public static void main(String[] args) {
//        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Amplifier(), new DVDPlayer());
//
//        homeTheater.watchMovie(); // "Amplifier ON" → "Playing movie"
//        homeTheater.endMovie();   // "Stopping movie" → "Amplifier OFF"
//    }
//}
