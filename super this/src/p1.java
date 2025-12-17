class Parent {
    int x = 10;

    Parent(int value) {
        System.out.println("Конструктор родителя: " + value);
    }

    void display() {
        System.out.println("Метод родителя: x = " + x);
    }
}

class Child extends Parent {
    int x = 20;

    // 1. Вызов конструктора родителя
    Child(int value) {
        super(value); // вызывает конструктор Parent
        System.out.println("Конструктор ребенка: " + value);
    }

    void display() {
        // 2. Вызов метода родителя
        super.display();
        System.out.println("Метод ребенка: x = " + x);
    }

    void printValues() {
        // 3. Доступ к полю родителя
        System.out.println("Поле родителя x = " + super.x);
        System.out.println("Поле ребенка x = " + this.x);
    }
}

public class p1 {
    public static void main(String[] args) {
        Child c = new Child(100);
        c.display();
        c.printValues();
    }
}
