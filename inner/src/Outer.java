public class Outer{
    private int privateField = 10;
    int defaultField = 20;
    protected int protectedField = 30;
    public int publicField = 40;

    private void privateMethod() {
        System.out.println("privateMethod вызван");
    }

    void defaultMethod() {
        System.out.println("defaultMethod вызван");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod вызван");
    }

    public void publicMethod() {
        System.out.println("publicMethod вызван");
    }

    // Внутренний класс
    class Inner {
        void accessOuterMembers() {
            // Внутренний класс видит все поля и методы внешнего класса
            System.out.println("privateField = " + privateField);
            System.out.println("defaultField = " + defaultField);
            System.out.println("protectedField = " + protectedField);
            System.out.println("publicField = " + publicField);

            privateMethod();
            defaultMethod();
            protectedMethod();
            publicMethod();
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.accessOuterMembers();
    }
}
