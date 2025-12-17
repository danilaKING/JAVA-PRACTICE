void main() {
    // NullPointerException при автораспаковке Integer
    Integer a = null;
    try {
        int x = a; // автораспаковка
    } catch (NullPointerException e) {
        System.out.println("NullPointerException при int: " + e);
    }

    // NullPointerException при автораспаковке Double
    Double b = null;
    try {
        double y = b;
    } catch (NullPointerException e) {
        System.out.println("NullPointerException при double: " + e);
    }

    // Автоупаковка null не бросает исключение
    Integer c = null;
    Integer d = c; // просто копирование ссылки
    System.out.println("Автоупаковка с null безопасна, c = " + c);
}