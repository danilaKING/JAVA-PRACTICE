public class OuterClass {

    // Внутренний класс с доступом private — доступен только внутри OuterClass
    private class PrivateInner {
        void show() {
            System.out.println("PrivateInner доступен только внутри OuterClass");
        }
    }

    // Внутренний класс с доступом default (package-private) — доступен внутри пакета
    class DefaultInner {
        void show() {
            System.out.println("DefaultInner доступен внутри пакета");
        }
    }

    // Внутренний класс с доступом protected — доступен в пакете и подклассах
    protected class ProtectedInner {
        void show() {
            System.out.println("ProtectedInner доступен в пакете и подклассах");
        }
    }

    // Внутренний класс с доступом public — доступен из любого места
    public class PublicInner {
        void show() {
            System.out.println("PublicInner доступен везде");
        }
    }

    public void testInnerClasses() {
        // Все внутренние классы доступны внутри OuterClass
        new PrivateInner().show();
        new DefaultInner().show();
        new ProtectedInner().show();
        new PublicInner().show();
    }
}

// Класс в том же пакете
class SamePackageClass {
    public void accessInner() {
        OuterClass outer = new OuterClass();

        // PrivateInner недоступен
        // OuterClass.PrivateInner pi = outer.new PrivateInner(); // ошибка компиляции

        // DefaultInner доступен
        OuterClass.DefaultInner di = outer.new DefaultInner();
        di.show();

        // ProtectedInner доступен
        OuterClass.ProtectedInner pri = outer.new ProtectedInner();
        pri.show();

        // PublicInner доступен
        OuterClass.PublicInner pub = outer.new PublicInner();
        pub.show();
    }
}
