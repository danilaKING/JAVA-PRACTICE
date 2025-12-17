void main() {
    String str1 = "  Hello World  ";
    String str2 = "Java Programming";
    String str3 = "HELLO WORLD";
    String str4 = "hello";

    // 1. length() — возвращает длину строки
    System.out.println("1. Длина str1: " + str1.length());

    // 2. trim() — убирает пробелы в начале и конце строки
    System.out.println("2. str1 без пробелов по краям: '" + str1.trim() + "'");

    // 3. toUpperCase() — преобразует все символы в верхний регистр
    System.out.println("3. str4 в верхнем регистре: " + str4.toUpperCase());

    // 4. toLowerCase() — преобразует все символы в нижний регистр
    System.out.println("4. str3 в нижнем регистре: " + str3.toLowerCase());

    // 5. substring(int beginIndex) — возвращает подстроку с указанного индекса
    System.out.println("5. Подстрока str2 с индекса 5: " + str2.substring(5));

    // 6. substring(int beginIndex, int endIndex) — возвращает подстроку между индексами
    System.out.println("6. Подстрока str2 с 5 по 15: " + str2.substring(5, 15));

    // 7. contains(CharSequence s) — проверяет, содержит ли строка заданную последовательность
    System.out.println("7. str2 содержит 'Java'? " + str2.contains("Java"));

    // 8. replace(CharSequence target, CharSequence replacement) — заменяет подстроку
    System.out.println("8. Заменяем 'World' на 'Java': " + str1.replace("World", "Java"));

    // 9. indexOf(String s) — возвращает индекс первого вхождения подстроки
    System.out.println("9. Индекс 'Programming' в str2: " + str2.indexOf("Programming"));

    // 10. equals(String anotherString) — проверяет, равны ли строки
    System.out.println("10. str1.trim() равно str3? " + str1.trim().equals(str3));
}