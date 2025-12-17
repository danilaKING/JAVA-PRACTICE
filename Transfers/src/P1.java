public class P1 {

    // Перечисление с инициализацией элементов
    enum Day {
        MONDAY("Понедельник", 1),
        TUESDAY("Вторник", 2),
        WEDNESDAY("Среда", 3),
        THURSDAY("Четверг", 4),
        FRIDAY("Пятница", 5),
        SATURDAY("Суббота", 6),
        SUNDAY("Воскресенье", 7);

        private final String name;
        private final int dayNumber;

        // Конструктор перечисления
        Day(String name, int dayNumber) {
            this.name = name;
            this.dayNumber = dayNumber;
        }

        public String getName() {
            return name;
        }

        public int getDayNumber() {
            return dayNumber;
        }
    }

    public static void main(String[] args) {
        // Использование элементов перечисления
        for (Day day : Day.values()) {
            System.out.println(day.getName() + " — день недели номер " + day.getDayNumber());
        }

        // Пример обращения к конкретному элементу
        Day today = Day.FRIDAY;
        System.out.println("Сегодня: " + today.getName());
    }
}
