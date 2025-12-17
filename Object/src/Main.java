import java.util.Objects;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределяем метод equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;               // проверка на ссылочную идентичность
        if (obj == null || getClass() != obj.getClass()) return false; // проверка типа
        Person other = (Person) obj;               // безопасное приведение
        return age == other.age && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 30);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
    }
}
