public class Practica2 {

    static class Animal {
        void sound() {
            System.out.println("Животное издает звук");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Собака лает");
        }
    }

    public static void main(String[] args) {

        // Пример 1: обычное использование instanceof
        Animal animal = new Dog();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // безопасное приведение типа
            dog.bark();
        }

        //  Пример 2: instanceof с базовым классом
        if (animal instanceof Animal) {
            System.out.println("animal является Animal");
        }

        // Пример 3: instanceof с Object
        if (animal instanceof Object) {
            System.out.println("animal является Object");
        }

        // Пример 4: instanceof и null
        Animal nullAnimal = null;

        if (nullAnimal instanceof Dog) {
            System.out.println("Это собака");
        } else {
            System.out.println("nullAnimal instanceof Dog = false");
        }

        if (nullAnimal instanceof Animal) {
            System.out.println("Это животное");
        } else {
            System.out.println("nullAnimal instanceof Animal = false");
        }
    }
}
