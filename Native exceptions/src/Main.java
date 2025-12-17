// Создание собственного исключения
class MyException extends Exception {
    // Конструктор без аргументов
    public MyException() {
        super("Произошло MyException");
    }

    // Конструктор с сообщением
    public MyException(String message) {
        super(message);
    }
}

// Класс для демонстрации генерации собственного исключения
public class Main {
    public static void main(String[] args) {
        try {
            checkValue(-5);
        } catch (MyException e) {
            System.out.println("Поймано собственное исключение: " + e.getMessage());
        }
    }

    // Метод, генерирующий собственное исключение
    static void checkValue(int value) throws MyException {
        if (value < 0) {
            throw new MyException("Значение не может быть отрицательным: " + value);
        }
        System.out.println("Значение корректно: " + value);
    }
}
