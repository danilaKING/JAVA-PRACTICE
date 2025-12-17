// Суперкласс
class Animal {
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

// Подкласс
class Dog extends Animal {
    // Переопределяем метод sound()
    @Override
    public void sound() {
        System.out.println("Собака лает");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound(); // вызовет переопределенный метод в Dog
    }
}
