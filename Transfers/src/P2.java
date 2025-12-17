public class P2 {

    // Перечисление с дополнительным методом
    enum Level {
        LOW(1),
        MEDIUM(5),
        HIGH(10);

        private final int value;

        // Конструктор перечисления
        Level(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        // Дополнительный метод, проверяющий, выше ли текущий уровень другого
        public boolean isHigherThan(Level other) {
            return this.value > other.value;
        }
    }

    public static void main(String[] args) {
        Level l1 = Level.MEDIUM;
        Level l2 = Level.LOW;

        System.out.println("Значение уровня " + l1 + ": " + l1.getValue());
        System.out.println("Значение уровня " + l2 + ": " + l2.getValue());

        if (l1.isHigherThan(l2)) {
            System.out.println(l1 + " выше, чем " + l2);
        } else {
            System.out.println(l1 + " не выше, чем " + l2);
        }
    }
}
