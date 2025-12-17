void main() {
    Integer a = Integer.decode("123");     // десятичное

    Integer b = Integer.decode("0x7B");    // hex

    Integer c = Integer.decode("#7B");     // hex альтернативно
    Integer d = Integer.decode("0173");    // восьмеричное

    Integer e = Integer.decode("-0xA");    // знак перед префиксом

    Long f = Long.decode("0x100");          // возвращает обертку

    Short g = Short.decode("010");          // должно влезать в диапазон

    Byte h = Byte.decode("0xA");            // переполнение ошибка

    Integer i = Integer.decode("0x10");     // parseInt так не умеет

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
    System.out.println(h);
    System.out.println(i);

}