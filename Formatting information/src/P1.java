import java.util.Date;

void main() {
    boolean boolValue = true;
    char charValue = 'A';
    int intValue = 123;
    double doubleValue = 456.789;
    String strValue = "Hello";
    Date dateValue = new Date();

    // %b — логическое значение
    System.out.printf("Boolean value: %b%n", boolValue);

    // %c — символ
    System.out.printf("Character value: %c%n", charValue);

    // %d — десятичное целое число
    System.out.printf("Integer value: %d%n", intValue);

    // %f — число с плавающей точкой
    System.out.printf("Double value: %.2f%n", doubleValue);
    // %s — строковое представление
    System.out.printf("String value: %s%n", strValue);

    // %t — дата и время
    System.out.printf("Current date and time: %tF %tT%n", dateValue, dateValue);

    // %% — знак %
    System.out.printf("Progress: 50%% complete%n");
}