interface InterfaceA {
    default void greet() {
        System.out.println("Привет из InterfaceA");
    }
}

interface InterfaceB {
    default void greet() {
        System.out.println("Привет из InterfaceB");
    }
}

// Класс, реализующий оба интерфейса
class MyClass implements InterfaceA, InterfaceB {

    // Обязательное переопределение метода, чтобы устранить конфликт
    @Override
    public void greet() {
        // Можно выбрать конкретную реализацию интерфейса
        InterfaceA.super.greet(); // вызов метода InterfaceA
        InterfaceB.super.greet(); // вызов метода InterfaceB

        // Или собственная реализация
        System.out.println("Собственная реализация greet() в MyClass");
    }
}

public class P2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.greet();
    }
}
