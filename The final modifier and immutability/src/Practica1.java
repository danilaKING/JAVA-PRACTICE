public class Practica1 {
    // 1. Инициализация при объявлении
    public final int x = 10;

    // 2. Инициализация через конструктор
    public final int y;

    // 3. Инициализация через блок инициализации
    public final int z;

    // Блок инициализации
    {
        z = 30;
    }

    // Конструктор
    public Practica1(int value) {
        y = value;
    }

    public void printValues() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }

    public static void main(String[] args) {
        Practica1 obj = new Practica1(20);
        obj.printValues();
    }
}
