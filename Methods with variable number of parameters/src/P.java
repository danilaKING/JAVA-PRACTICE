public class P {

    // Метод с фиксированным числом параметров
    public void printNumbers(int a, int b) {
        System.out.println("Два числа: " + a + ", " + b);
    }

    // Перегруженный метод с переменным числом параметров
    public void printNumbers(int... numbers) {
        System.out.print("Список чисел: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        P example = new P();

        // Вызов метода с фиксированными параметрами
        example.printNumbers(1, 2);

        // Вызов метода с переменным числом параметров
        example.printNumbers(3, 4, 5, 6);
        example.printNumbers(7); //  один параметр работает
        example.printNumbers();  // можно вызвать без параметров
    }
}
