class Animal {
    // Метод суперкласса
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    // Пытаемся переопределить метод, но допустили опечатку в имени
    @Override
    public void makeSond() { //  опечатка
        System.out.println("Собака лает");
    }
}

public class OverrideErrorDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // вызовет метод суперкласса
    }
}
