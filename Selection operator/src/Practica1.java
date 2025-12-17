void main() {

    // Целочисленные типы
    int n = 2;
    switch (n) {
        case 1: System.out.println("Один"); break;
        case 2: System.out.println("Два"); break;
        default: System.out.println("Другое");
    }

    Integer m = 1;
    switch (m) {
        case 0: System.out.println("Ноль"); break;
        case 1: System.out.println("Один"); break;
    }

    // Тип String
    String day = "Понедельник";
    switch (day) {
        case "Понедельник": System.out.println("Начало недели"); break;
        case "Пятница": System.out.println("Конец недели"); break;
        default: System.out.println("День недели");
    }

    // Тип enum
    enum Color { RED, GREEN, BLUE }

    Color color = Color.GREEN;
    switch (color) {
        case RED: System.out.println("Красный"); break;
        case GREEN: System.out.println("Зелёный"); break;
        case BLUE: System.out.println("Синий"); break;
    }
}