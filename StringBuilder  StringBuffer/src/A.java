public class A {
    public static void main(String[] args) {
        // ===== StringBuffer =====
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append() — добавление строки в конец
        sb.append(" World");
        System.out.println("1. append: " + sb);

        // 2. insert() — вставка строки по индексу
        sb.insert(5, ",");
        System.out.println("2. insert: " + sb);

        // 3. replace() — замена подстроки
        sb.replace(6, 11, "Java");
        System.out.println("3. replace: " + sb);

        // 4. delete() — удаление подстроки
        sb.delete(5, 10);
        System.out.println("4. delete: " + sb);

        // 5. reverse() — разворот строки
        sb.reverse();
        System.out.println("5. reverse: " + sb);

        // 6. charAt() — получение символа по индексу
        System.out.println("6. charAt(0): " + sb.charAt(0));

        // 7. setCharAt() — установка символа по индексу
        sb.setCharAt(0, 'h');
        System.out.println("7. setCharAt(0, 'h'): " + sb);

        // 8. length() — длина строки
        System.out.println("8. length(): " + sb.length());

        // 9. capacity() — вместимость буфера
        System.out.println("9. capacity(): " + sb.capacity());

        // 10. substring() — получение подстроки
        System.out.println("10. substring(1,5): " + sb.substring(1, 5));

        // ===== StringBuilder =====
        StringBuilder sbd = new StringBuilder("Start");

        // Применим те же методы
        sbd.append(" End");                   // append
        sbd.insert(5, " Middle");             // insert
        sbd.replace(0, 5, "Begin");           // replace
        sbd.delete(5, 12);                    // delete
        sbd.reverse();                        // reverse
        System.out.println("StringBuilder reverse: " + sbd);
        System.out.println("StringBuilder charAt(0): " + sbd.charAt(0));
        sbd.setCharAt(0, 'S');                // setCharAt
        System.out.println("StringBuilder setCharAt: " + sbd);
        System.out.println("StringBuilder length(): " + sbd.length());
        System.out.println("StringBuilder capacity(): " + sbd.capacity());
        System.out.println("StringBuilder substring(1,5): " + sbd.substring(1,5));
    }
}
