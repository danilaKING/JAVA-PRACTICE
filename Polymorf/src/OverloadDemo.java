public class OverloadDemo {

    // Метод без параметров
    public void show() {
        System.out.println("Метод без параметров");
    }

    // Метод с одним параметром int
    public void show(int a) {
        System.out.println("Метод с одним int: " + a);
    }

    // Метод с двумя параметрами int
    public void show(int a, int b) {
        System.out.println("Метод с двумя int: " + a + ", " + b);
    }

    // Метод с параметром типа String
    public void show(String s) {
        System.out.println("Метод с параметром String: " + s);
    }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        demo.show();           // вызовет метод без параметров
        demo.show(10);         // вызовет метод с одним int
        demo.show(5, 20);      // вызовет метод с двумя int
        demo.show("Hello");    // вызовет метод с String
    }
}