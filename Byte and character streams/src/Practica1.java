import java.io.FileInputStream;
import java.io.IOException;

void main() {
    // Файл должен существовать в проекте с текстом, например "Hello"
    try (FileInputStream fis = new FileInputStream("example.txt")) {

        int data;
        // Метод read() возвращает один байт за раз, либо -1 если конец файла
        while ((data = fis.read()) != -1) {
            // Преобразуем байт в символ и выводим
            System.out.print((char) data);
        }

    } catch (IOException e) {
        System.out.println("Ошибка ввода-вывода: " + e.getMessage());

    }
}