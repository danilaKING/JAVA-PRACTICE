public class Outer {
    class Inner {
        private int privateField = 10;
        int defaultField = 20;
        protected int protectedField = 30;
        public int publicField = 40;

        private void privateMethod() { System.out.println("Inner privateMethod"); }
        void defaultMethod() { System.out.println("Inner defaultMethod"); }
        protected void protectedMethod() { System.out.println("Inner protectedMethod"); }
        public void publicMethod() { System.out.println("Inner publicMethod"); }
    }

    public void accessInner() {
        Inner inner = new Inner(); // создаем объект внутреннего класса

        // Внешний класс видит все поля и методы внутреннего класса
        System.out.println("privateField = " + inner.privateField);
        System.out.println("defaultField = " + inner.defaultField);
        System.out.println("protectedField = " + inner.protectedField);
        System.out.println("publicField = " + inner.publicField);

        inner.privateMethod();
        inner.defaultMethod();
        inner.protectedMethod();
        inner.publicMethod();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.accessInner();
    }
}
