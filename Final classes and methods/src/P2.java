// Финальный класс
final class Parent {
    public void greet() {
        System.out.println("Привет из финального класса");
    }
}

// Попытка наследования вызовет ошибку компиляции
/*
class Child extends Parent {  
    //Ошибка: нельзя наследовать финальный класс
}
*/

public class P2 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.greet(); // работает нормально
    }
}
