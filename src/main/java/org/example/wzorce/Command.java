package org.example.wzorce;

// Interfejs polecenia
interface Command {
    void execute();
}

// Odbiorca polecenia
class Light {
    void turnOn() { System.out.println("Light is ON"); }
    void turnOff() { System.out.println("Light is OFF"); }
}

// Konkretne polecenia
class TurnOnLightCommand implements Command {
    private Light light;
    public TurnOnLightCommand(Light light) { this.light = light; }
    public void execute() { light.turnOn(); }
}

class TurnOffLightCommand implements Command {
    private Light light;
    public TurnOffLightCommand(Light light) { this.light = light; }
    public void execute() { light.turnOff(); }
}

// Klient sterujący poleceniami
class RemoteControl {
    private Command command;
    public void setCommand(Command command) { this.command = command; }
    public void pressButton() { command.execute(); }
}

// Użycie wzorca Command
//public class Main {
//    public static void main(String[] args) {
//        Light light = new Light();
//        RemoteControl remote = new RemoteControl();
//
//        remote.setCommand(new TurnOnLightCommand(light));
//        remote.pressButton(); // "Light is ON"
//
//        remote.setCommand(new TurnOffLightCommand(light));
//        remote.pressButton(); // "Light is OFF"
//    }
//}
