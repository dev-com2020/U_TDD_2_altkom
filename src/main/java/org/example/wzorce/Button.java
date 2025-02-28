package org.example.wzorce;

// Interfejsy
interface Button {
    void render();
}

interface Checkbox {
    void check();
}

// Implementacje dla Windows
class WindowsButton implements Button {
    public void render() { System.out.println("Rendering Windows Button"); }
}

class WindowsCheckbox implements Checkbox {
    public void check() { System.out.println("Checking Windows Checkbox"); }
}

// Implementacje dla macOS
class MacButton implements Button {
    public void render() { System.out.println("Rendering Mac Button"); }
}

class MacCheckbox implements Checkbox {
    public void check() { System.out.println("Checking Mac Checkbox"); }
}

// Abstract Factory
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Konkretne fabryki
class WindowsFactory implements GUIFactory {
    public Button createButton() { return new WindowsButton(); }
    public Checkbox createCheckbox() { return new WindowsCheckbox(); }
}

class MacFactory implements GUIFactory {
    public Button createButton() { return new MacButton(); }
    public Checkbox createCheckbox() { return new MacCheckbox(); }
}
