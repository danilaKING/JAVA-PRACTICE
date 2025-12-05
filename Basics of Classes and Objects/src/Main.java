// Общий интерфейс для всех фигур.
// Любая фигура должна уметь возвращать свою площадь.
interface Shape {
    int getArea();
}

// Класс прямоугольника.
// Он просто хранит ширину и высоту и вычисляет площадь.
class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

// Класс квадрата.
// Квадрат НЕ наследуется от Rectangle.
// Он реализует Shape напрямую, со своей логикой.
class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

public class Main {
        static void main(String[] args) {
        // Создаём разные фигуры.
        Shape rect = new Rectangle(5, 10);
        Shape square = new Square(5);

        // Метод принимает Shape, и ему всё равно, какая именно фигура.
        // Это и есть соблюдение LSP.
        printArea(rect);    // Выведет: Area: 50
        printArea(square);  // Выведет: Area: 25
    }

    // Метод работает одинаково для Rectangle и Square,
    // потому что оба соблюдают контракт интерфейса Shape.
    public static void printArea(Shape s) {
        System.out.println("Area: " + s.getArea());
    }
}
