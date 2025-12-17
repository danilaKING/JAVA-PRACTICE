import java.io.FileOutputStream;
import java.io.IOException;

void main() {
    String text = "Hello";

    // Используем try-with-resources для автоматического закрытия потока
    try (FileOutputStream fos = new FileOutputStream("output.txt")) {

        // Метод write(int) записывает один байт за раз
        for (int i = 0; i < text.length(); i++) {
            fos.write(text.charAt(i)); // преобразуем символ в байт
        }

        System.out.println("Данные успешно записаны в файл output.txt");

    } catch (IOException e) {
        System.out.println("Ошибка ввода-вывода: " + e.getMessage());
    }
}