import java.util.ArrayList;
import java.util.List;

public class P1 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        Object obj = stringList;

        // Можно проверить только "сырый" тип
        if (obj instanceof ArrayList) {
            System.out.println("obj — ArrayList (сырое использование)");
        }

        // Можно проверить интерфейс или базовый класс
        if (obj instanceof List) {
            System.out.println("obj реализует List");
        }

        // Пример с generic-методом
        printListType(stringList);
        printListType(intList);
    }

    public static void printListType(List<?> list) {
        if (list instanceof ArrayList) {
            System.out.println("Список — ArrayList");
        } else if (list instanceof List) {
            System.out.println("Список — другой List");
        }
    }
}
