class A {
    int a;
    int b;
    int c;
    int z;

    // Базовый конструктор
    public A() {
        z = 1;
    }

    public A(int a) {
        this();      // вызывает A()
        this.a = a;
    }

    public A(int a, int b) {
        this(a);     // вызывает A(int a)
        this.b = b;
    }

    public A(int a, int b, int c) {
        this(a, b);  // вызывает A(int a, int b)
        this.c = c;
    }
}
