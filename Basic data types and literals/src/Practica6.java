// Приведите примеры сужающего преобразования типов.
void main() {
    // 1. int → byte (явное приведение)
    int a = 130;
    byte b = (byte) a;
    // byte может хранить только -128..127 -> переполнение
    System.out.println("int 130 → byte: " + b); // -126


    // 2. double -> int (отбрасывается дробная часть)
    double x = 12.9;
    int y = (int) x;
    System.out.println("double 12.9 → int: " + y); // 12


    // 3. long -> int (требуется приводить явно)
    long big = 3000000000L; // больше диапазона int
    int small = (int) big;
    // произойдет потеря данных
    System.out.println("long 3000000000 → int: " + small);


    // 4. short -> byte (с потерей точности)
    short s = 200;  // больше диапазона byte
    byte bb = (byte) s;
    System.out.println("short 200 → byte: " + bb);


    // 5. int -> char (только допустимый диапазон 0..65535)
    int code = 65;
    char ch = (char) code;
    // 65 соответствует символу 'A'
    System.out.println("int 65 → char: " + ch); // A

}