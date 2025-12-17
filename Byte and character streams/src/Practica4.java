import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Интерфейс AutoCloseable нужен для обеспечения автоматического закрытия ресурсов
void main() {
    // BufferedReader реализует AutoCloseable
    try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        System.out.println("Ошибка ввода-вывода: " + e.getMessage());
    }
    // reader автоматически закрыт после выхода из try
}