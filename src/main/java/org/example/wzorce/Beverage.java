package org.example.wzorce;

// Klasa bazowa z metodą szablonową
abstract class Beverage {
    public final void prepare() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected void boilWater() { System.out.println("Boiling water"); }
    protected void pourInCup() { System.out.println("Pouring into cup"); }

    abstract void brew();
    abstract void addCondiments();
}

// Konkretne implementacje
class Tea extends Beverage {
    void brew() { System.out.println("Steeping the tea"); }
    void addCondiments() { System.out.println("Adding lemon"); }
}

class Coffee extends Beverage {
    void brew() { System.out.println("Dripping coffee through filter"); }
    void addCondiments() { System.out.println("Adding sugar and milk"); }
}

//// Użycie wzorca Template Method
//public class Main {
//    public static void main(String[] args) {
//        Beverage tea = new Tea();
//        tea.prepare();
//
//        Beverage coffee = new Coffee();
//        coffee.prepare();
//    }
}
