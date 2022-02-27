package Interface;

interface Interface {

    int INT_CONSTANT = 0; // it's a constant, the same as public static final int INT_FIELD = 0

    void instanceMethod1(); // is abstract method

    void instanceMethod2();

    static void staticMethod() {
        System.out.println("Interface.Interface: static method");
    }

    // implement but it can overriden in subclass
    default void defaultMethod() {
        System.out.println("Interface.Interface: default method. It can be overridden");
    }

    private void privateMethod() {
        System.out.println("Interface.Interface: private methods in interfaces are acceptable but should have a body");
    }
}