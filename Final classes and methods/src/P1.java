class Parent {
    // final-метод нельзя переопределять
    public final void finalMethod() {
        System.out.println("Это финальный метод родителя");
    }
}

class Child extends Parent {
    // Попытка переопределения приведёт к ошибке компиляции
    /*
    @Override
    public void finalMethod() {
        System.out.println("Переопределение невозможно!");
    }
    */
}

public class P1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.finalMethod(); // вызывает метод родителя
    }
}
