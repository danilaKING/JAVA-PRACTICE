public class Practica1 {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        // Вариант 1: вызов через имя класса (рекомендуется)
        Practica1.printVars();

        // Вариант 2: вызов через объект класса (допустимо, но не рекомендуется)
        Practica1 obj = new Practica1();
        obj.printVars();
    }
}
