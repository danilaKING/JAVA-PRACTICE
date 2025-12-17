// Интерфейс с default и static методами
interface MyInterface {

    // Абстрактный метод (по умолчанию все методы без реализации абстрактны)
    void abstractMethod();

    // Default-метод — неабстрактный, с реализацией
    default void defaultMethod() {
        System.out.println("Вызван default-метод интерфейса");
    }

    // Static-метод
    static void staticMethod() {
        System.out.println("Вызван static-метод интерфейса");
    }
}

// Класс, реализующий интерфейс
class MyClass implements MyInterface {

    @Override
    public void abstractMethod() {
        System.out.println("Реализация абстрактного метода в классе MyClass");
    }
}

public class P1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // 1. Вызов абстрактного метода через объект
        obj.abstractMethod();

        // 2. Вызов default-метода через объект
        obj.defaultMethod();

        // 3. Вызов static-метода через интерфейс
        MyInterface.staticMethod();
    }
}
