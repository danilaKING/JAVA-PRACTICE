import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

void main() {
    try {
        // Создаем объект File
        File file = new File("example.txt");

        // Создаем Scanner для чтения файла
        Scanner scanner = new Scanner(file);

        // Чтение построчно
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        // Закрываем Scanner после использования
        scanner.close();

    } catch (FileNotFoundException e) {
        System.out.println("Файл не найден: " + e.getMessage());
    }
}