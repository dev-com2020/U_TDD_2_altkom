package org.example.wzorce;

// Podstawowy interfejs
interface Coffee {
    String getDescription();
    double getCost();
}

// Podstawowa kawa
class SimpleCoffee implements Coffee {
    public String getDescription() { return "Simple Coffee"; }
    public double getCost() { return 5.0; }
}

// Dekorator abstrakcyjny
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription();
    }

    public double getCost() {
        return coffee.getCost();
    }
}

// Konkretne dekoratory
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) { super(coffee); }

    public String getDescription() { return coffee.getDescription() + ", Milk"; }
    public double getCost() { return coffee.getCost() + 1.5; }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) { super(coffee); }

    public String getDescription() { return coffee.getDescription() + ", Sugar"; }
    public double getCost() { return coffee.getCost() + 0.5; }
}

// Użycie dekoratora
//public class Main {
//    public static void main(String[] args) {
//        Coffee coffee = new SimpleCoffee();
//        coffee = new MilkDecorator(coffee);
//        coffee = new SugarDecorator(coffee);
//
//        System.out.println(coffee.getDescription()); // "Simple Coffee, Milk, Sugar"
//        System.out.println(coffee.getCost());        // 7.0
//    }
//}
