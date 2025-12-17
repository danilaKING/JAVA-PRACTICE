void main() {
    System.out.println("=== Все способы создания Boolean ===");

    // 1. Через конструкторы
    System.out.println("\n1. Через конструкторы (deprecated):");
    Boolean boolConst1 = new Boolean(true);
    Boolean boolConst2 = new Boolean("true");
    Boolean boolConst3 = new Boolean("TRUE");
    Boolean boolConst4 = new Boolean("false");
    Boolean boolConst5 = new Boolean("anything");

    System.out.println("new Boolean(true): " + boolConst1);
    System.out.println("new Boolean(\"true\"): " + boolConst2);
    System.out.println("new Boolean(\"TRUE\"): " + boolConst3);
    System.out.println("new Boolean(\"false\"): " + boolConst4);
    System.out.println("new Boolean(\"anything\"): " + boolConst5);

    // 2. Через статический метод valueOf()
    System.out.println("\n2. Через Boolean.valueOf() (рекомендуется):");
    Boolean boolVal1 = Boolean.valueOf(true);
    Boolean boolVal2 = Boolean.valueOf("true");
    Boolean boolVal3 = Boolean.valueOf("TRUE");
    Boolean boolVal4 = Boolean.valueOf("false");
    Boolean boolVal5 = Boolean.valueOf("anything");
    Boolean boolVal6 = Boolean.valueOf("True");
    Boolean boolVal7 = Boolean.valueOf("False");

    System.out.println("Boolean.valueOf(true): " + boolVal1);
    System.out.println("Boolean.valueOf(\"true\"): " + boolVal2);
    System.out.println("Boolean.valueOf(\"TRUE\"): " + boolVal3);
    System.out.println("Boolean.valueOf(\"false\"): " + boolVal4);
    System.out.println("Boolean.valueOf(\"anything\"): " + boolVal5);
    System.out.println("Boolean.valueOf(\"True\"): " + boolVal6);
    System.out.println("Boolean.valueOf(\"False\"): " + boolVal7);

    // 3. Через автоупаковку
    System.out.println("\n3. Через автоупаковку:");
    Boolean boolAuto1 = true;          // автоупаковка boolean -> Boolean
    Boolean boolAuto2 = false;         // автоупаковка
    boolean primitive = true;
    Boolean boolAuto3 = primitive;     // автоупаковка из переменной

    System.out.println("Boolean boolAuto1 = true: " + boolAuto1);
    System.out.println("Boolean boolAuto2 = false: " + boolAuto2);
    System.out.println("Boolean boolAuto3 = primitive: " + boolAuto3);

    // 4. Константы TRUE и FALSE
    System.out.println("\n4. Через константы класса:");
    Boolean boolConstTrue = Boolean.TRUE;
    Boolean boolConstFalse = Boolean.FALSE;

    System.out.println("Boolean.TRUE: " + boolConstTrue);
    System.out.println("Boolean.FALSE: " + boolConstFalse);

    // 5. Через статический метод parseBoolean()
    System.out.println("\n5. parseBoolean() + автоупаковка:");
    boolean parsed1 = Boolean.parseBoolean("true");
    boolean parsed2 = Boolean.parseBoolean("false");
    boolean parsed3 = Boolean.parseBoolean("TRUE");
    boolean parsed4 = Boolean.parseBoolean("anything");

    Boolean boolParse1 = Boolean.parseBoolean("true"); // автоупаковка
    Boolean boolParse2 = parsed1; // автоупаковка

    System.out.println("Boolean.parseBoolean(\"true\"): " + parsed1);
    System.out.println("Boolean.parseBoolean(\"false\"): " + parsed2);
    System.out.println("Boolean.parseBoolean(\"TRUE\"): " + parsed3);
    System.out.println("Boolean.parseBoolean(\"anything\"): " + parsed4);

    // 6. Сравнение объектов
    System.out.println("\n6. Сравнение Boolean объектов:");
    Boolean b1 = Boolean.valueOf(true);
    Boolean b2 = Boolean.valueOf(true);
    Boolean b3 = new Boolean(true);
    Boolean b4 = true;

    System.out.println("valueOf(true) == valueOf(true): " + (b1 == b2)); // true (кеширование)
    System.out.println("valueOf(true) == new Boolean(true): " + (b1 == b3)); // false
    System.out.println("valueOf(true) == true (autobox): " + (b1 == b4)); // true
    System.out.println("valueOf(true).equals(new Boolean(true)): " + b1.equals(b3)); // true

    // 7. Демонстрация кеширования
    System.out.println("\n7. Демонстрация кеширования:");
    System.out.println("Boolean.valueOf(true) == Boolean.TRUE: " + (Boolean.valueOf(true) == Boolean.TRUE));
    System.out.println("Boolean.valueOf(false) == Boolean.FALSE: " + (Boolean.valueOf(false) == Boolean.FALSE));

    // 8. Создание через логические выражения
    System.out.println("\n8. Через логические выражения:");
    int x = 10;
    int y = 20;
    Boolean boolExpr1 = x < y;
    Boolean boolExpr2 = (x > 5) && (y < 30);
    Boolean boolExpr3 = "hello".equals("world");

    System.out.println("x = 10, y = 20");
    System.out.println("Boolean boolExpr1 = x < y: " + boolExpr1);
    System.out.println("Boolean boolExpr2 = (x > 5) && (y < 30): " + boolExpr2);
    System.out.println("Boolean boolExpr3 = \"hello\".equals(\"world\"): " + boolExpr3);
}