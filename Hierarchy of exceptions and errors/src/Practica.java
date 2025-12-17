// Создаем собственные исключения с иерархией
class Ex1 extends Exception {}  // базовое исключение
class Ex2 extends Ex1 {}       // подкласс Ex1
class Ex3 extends Ex2 {}       // подкласс Ex2

public class Practica {
    public static void main(String[] args) {
        // === Несколько исключений, обрабатываемые одинаково ===
        try {
            if (Math.random() < 0.5) {
                throw new NullPointerException("NullPointerException");
            } else {
                throw new ArithmeticException("ArithmeticException");
            }
        } catch (NullPointerException | ArithmeticException e) { // несколько исключений одним блоком
            System.out.println("Перехвачено исключение одинаково: " + e);
        }

        // === Исключения, образующие иерархию ===
        try {
            int r = (int)(Math.random() * 3);
            switch (r) {
                case 0 -> throw new Ex1();
                case 1 -> throw new Ex2();
                case 2 -> throw new Ex3();
            }
        } catch (Ex3 e) {
            System.out.println("Обработано Ex3 (подкласс Ex2): " + e);
        } catch (Ex2 e) {
            System.out.println("Обработано Ex2 (подкласс Ex1): " + e);
        } catch (Ex1 e) {
            System.out.println("Обработано Ex1 (базовое исключение): " + e);
        }
    }
}
