void main(){
    // Базовые типы
    int a = 10;
    int b = 3;
    double x = 5.5;
    boolean flag = true;

    // Арифметические операторы
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);
    System.out.println(x / b);

    // Инкремент и декремент
    int c = 5;
    System.out.println(++c); // префиксный ++ (сначала увеличить)
    System.out.println(c++); // постфиксный ++ (сначала использовать)
    System.out.println(--c); // префиксный --
    System.out.println(c--); // постфиксный --

    // Операторы сравнения
    System.out.println(a > b);
    System.out.println(a < b);
    System.out.println(a >= b);
    System.out.println(a <= b);
    System.out.println(a == b);
    System.out.println(a != b);

    // Логические операторы
    System.out.println(flag && (a > b)); // && логическое И
    System.out.println(flag || (a < b)); // || логическое ИЛИ
    System.out.println(!flag);            // ! логическое НЕ

    // Побитовые операторы
    int m = 6;   // 110
    int n = 3;   // 011
    System.out.println(m & n);  // & побитовое И
    System.out.println(m | n);  // | побитовое ИЛИ
    System.out.println(m ^ n);  // ^ побитовое исключающее ИЛИ
    System.out.println(~m);     // ~ побитовое НЕ
    System.out.println(m << 1); // << сдвиг влево
    System.out.println(m >> 1); // >> сдвиг вправо

    // Операторы присваивания
    int d = 5;
    d += 2;
    d -= 1;
    d *= 3;
    d /= 2;
    d %= 2;
    System.out.println(d);

    // Тернарный оператор
    int max = (a > b) ? a : b;
    System.out.println(max);

    //Строки
    String s1 = "Hello";
    String s2 = "World";

    // Конкатенация строк
    String s3 = s1 + " " + s2; // +
    System.out.println(s3);

    // Конкатенация строки с базовым типом
    String s4 = "Value: " + a;
    System.out.println(s4);

    // Сравнение ссылок
    System.out.println(s1 == s2);
    System.out.println(s1 != s2);

    // Оператор instanceof
    System.out.println(s1 instanceof String);

    // Тернарный оператор со String
    String result = (a > b) ? "a больше b" : "a не больше b";
    System.out.println(result);

}