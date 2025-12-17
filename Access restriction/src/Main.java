// public — доступен из любого пакета
public class Main {

    // private — доступен только внутри этого класса
    private int privateField = 1;

    // default (package-private) — доступен внутри того же пакета
    int defaultField = 2;

    // protected — доступен внутри пакета и в подклассах
    protected int protectedField = 3;

    // public — доступен везде
    public int publicField = 4;

    // Метод для демонстрации доступа к private полю внутри класса
    public void showPrivateField() {
        System.out.println("privateField = " + privateField);
    }

    public static void main(String[] args) {
        Main obj = new Main();

        // Доступ к полям внутри класса
        System.out.println("defaultField = " + obj.defaultField);
        System.out.println("protectedField = " + obj.protectedField);
        System.out.println("publicField = " + obj.publicField);

        // private поле доступно через метод класса
        obj.showPrivateField();
    }
}