void main() {
    try {
        // 1. Исключение, которое будет перехвачено
        int a = 10;
        int b = 0;
        int c = a / b; // ArithmeticException
    } catch (ArithmeticException e) {
        System.out.println("Перехвачено ArithmeticException: " + e.getMessage());
    }

    // 2. Исключение, которое не будет перехвачено
    String str = null;
    System.out.println("Длина строки: " + str.length()); // NullPointerException
    // Программа аварийно завершится здесь
}