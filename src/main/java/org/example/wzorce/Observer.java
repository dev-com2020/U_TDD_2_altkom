package org.example.wzorce;

import java.util.ArrayList;
import java.util.List;

// Interfejs obserwatora
interface Observer {
    void update(float temperature);
}

// Konkretny obserwator
class TemperatureDisplay implements Observer {
    public void update(float temperature) {
        System.out.println("Temperature updated: " + temperature + "°C");
    }
}

// Obiekt obserwowany
class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

// Użycie wzorca Observer
//public class Main {
//    public static void main(String[] args) {
//        WeatherStation station = new WeatherStation();
//        Observer display = new TemperatureDisplay();
//
//        station.addObserver(display);
//        station.setTemperature(25.0f); // "Temperature updated: 25.0°C"
//    }
//}

