void main() {
    // 1. ArithmeticException — деление на ноль
    try {
        int a = 10;
        int b = 0;
        int c = a / b; // здесь возникнет исключение
    } catch (ArithmeticException e) {
        System.out.println("ArithmeticException поймано: " + e.getMessage());
    }

    // 2. ArrayIndexOutOfBoundsException — выход за границы массива
    try {
        int[] arr = {1, 2, 3};
        int value = arr[5]; // индекс 5 не существует
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException поймано: " + e.getMessage());
    }

    // 3. IllegalArgumentException — передан недопустимый аргумент
    try {
        int number = -5;
        setAge(number); // метод бросает исключение при отрицательном возрасте
    } catch (IllegalArgumentException e) {
        System.out.println("IllegalArgumentException поймано: " + e.getMessage());
    }

    // 4. ClassCastException — неправильное приведение типов
    try {
        Object obj = "Hello";
        Integer num = (Integer) obj; // строку нельзя привести к Integer
    } catch (ClassCastException e) {
        System.out.println("ClassCastException поймано: " + e.getMessage());
    }

    // 5. NullPointerException — доступ к null-объекту
    try {
        String str = null;
        System.out.println(str.length()); // str равен null
    } catch (NullPointerException e) {
        System.out.println("NullPointerException поймано: " + e.getMessage());
    }
}

// Метод для демонстрации IllegalArgumentException
static void setAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("Возраст не может быть отрицательным");
    }
    System.out.println("Возраст установлен: " + age);
}