import java.util.StringJoiner;

void main() {
    // 1. Создание StringJoiner с разделителем
    StringJoiner sj1 = new StringJoiner(", ");
    sj1.add("Apple");
    sj1.add("Banana");
    sj1.add("Cherry");
    System.out.println("Пример с разделителем: " + sj1);

    // 2. Создание StringJoiner с разделителем, префиксом и суффиксом
    StringJoiner sj2 = new StringJoiner(" | ", "[", "]");
    sj2.add("Java");
    sj2.add("Python");
    sj2.add("C++");
    System.out.println("С префиксом и суффиксом: " + sj2);

    // 3. Объединение двух StringJoiner
    StringJoiner sj3 = new StringJoiner(", ");
    sj3.add("One");
    sj3.add("Two");
    StringJoiner sj4 = new StringJoiner(", ");
    sj4.add("Three");
    sj4.add("Four");

    sj3.merge(sj4);  // объединяем содержимое sj4 в sj3
    System.out.println("После merge: " + sj3);

    // 4. Получение строки через toString()
    String result = sj3.toString();
    System.out.println("Результат через toString(): " + result);

    // 5. Получение длины объединённой строки через length()
    System.out.println("Длина объединённой строки: " + sj3.length());
}