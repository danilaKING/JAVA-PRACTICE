// Приведите примеры, когда арифметические операции выполняются с переменными различных типов.
// Объясните результат.

void main() {

    // Пример 1: int + double
    int a = 5;
    double b = 2.5;
    double r1 = a + b;
    // int автоматически повышается до double -> результат double
    System.out.println("int + double = " + r1); // 7.5


    // Пример 2: int + long
    int x = 10;
    long y = 20L;
    long r2 = x + y;
    // int расширяется до long -> результат long
    System.out.println("int + long = " + r2); // 30


    // Пример 3: byte + int
    byte p = 4;
    int q = 6;
    int r3 = p + q;
    // byte всегда повышается до int -> результат int
    System.out.println("byte + int = " + r3); // 10


    // Пример 4: byte + byte
    byte m = 10;
    byte n = 20;
    int r4 = m + n;
    //  два byte складываются как int -> результат int
    System.out.println("byte + byte = " + r4); // 30


    // Пример 5: char + int
    char c = 'A'; // код символа 'A' = 65
    int k = 5;
    int r5 = c + k;
    // char — числовой тип, участвует как число 65 -> 65 + 5 = 70
    System.out.println("char + int = " + r5); // 70

}