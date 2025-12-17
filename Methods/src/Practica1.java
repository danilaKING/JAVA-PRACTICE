class Animal {
    void sound() {
        System.out.println("Животное издаёт звук");
    }

    void move(int steps) {  // перегружаемый метод
        System.out.println("Животное проходит " + steps + " шагов");
    }

    void move(String direction) {  // перегрузка
        System.out.println("Животное движется в направлении " + direction);
    }
}

class Dog extends Animal {
    @Override
    void sound() {  // переопределение метода
        System.out.println("Собака лает");
    }

    // Можно также перегрузить move отдельно для Dog
    void move(double distance) {
        System.out.println("Собака пробежала " + distance + " метров");
    }
}

public class Practica1 {
    public static void main(String[] args) {
        Animal generic = new Animal();
        Dog dog = new Dog();
        Animal polyDog = new Dog(); // полиморфизм

        // Перегрузка в родительском классе
        generic.move(5);        // Животное проходит 5 шагов
        generic.move("на север"); // Животное движется в направлении на север

        // Переопределение метода sound
        generic.sound();        // Животное издаёт звук
        dog.sound();            // Собака лает
        polyDog.sound();        // Собака лает (по реальному типу объекта)

        // Перегрузка в подклассе
        dog.move(3.5);          // Собака пробежала 3.5 метров
    }
}
