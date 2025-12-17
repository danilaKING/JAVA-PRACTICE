interface OuterInterface {
    // Вложенный класс
    class InnerClass {
        private String message;

        public InnerClass(String message) {
            this.message = message;
        }

        public void showMessage() {
            System.out.println("Сообщение: " + message);
        }
    }

    void interfaceMethod();
}

public class Main {
    public static void main(String[] args) {
        // Создание объекта вложенного класса
        OuterInterface.InnerClass inner = new OuterInterface.InnerClass("Привет из вложенного класса!");
        inner.showMessage();
    }
}
