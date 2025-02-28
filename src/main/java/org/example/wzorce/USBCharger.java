package org.example.wzorce;

// Stary interfejs (USB ładowarka)
interface USBCharger {
    void chargeWithUSB();
}

// Nowa klasa (Ładowarka typu C)
class TypeCCharger {
    void chargeWithTypeC() {
        System.out.println("Charging with Type-C");
    }
}

// Adapter łączący USB z Type-C
class TypeCAdapter implements USBCharger {
    private TypeCCharger typeCCharger;

    public TypeCAdapter(TypeCCharger typeCCharger) {
        this.typeCCharger = typeCCharger;
    }

    public void chargeWithUSB() {
        typeCCharger.chargeWithTypeC();
    }
}

// Użycie adaptera
//public class Main {
//    public static void main(String[] args) {
//        TypeCCharger typeCCharger = new TypeCCharger();
//        USBCharger adapter = new TypeCAdapter(typeCCharger);
//
//        adapter.chargeWithUSB(); // "Charging with Type-C"
//    }
//}
