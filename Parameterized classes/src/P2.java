import java.util.ArrayList;
import java.util.List;

class Animal {
    public void sound() { System.out.println("Some animal sound"); }
}

class Dog extends Animal {
    @Override
    public void sound() { System.out.println("Woof!"); }
}

public class P2 {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());

        // ? extends Animal — можно читать, но нельзя добавлять новые элементы
        List<? extends Animal> animalsExtends = dogList;
        Animal a = animalsExtends.get(0); // чтение безопасно
        a.sound();
        animalsExtends.add(null);         // можно добавить null

        // ? super Dog — можно добавлять Dog, чтение только как Object
        List<Animal> animalList = new ArrayList<>();
        List<? super Dog> animalsSuper = animalList;
        animalsSuper.add(new Dog());      // добавление безопасно
        Object obj = animalsSuper.get(0); // чтение как Object

        System.out.println("Пример завершён");
    }
}
