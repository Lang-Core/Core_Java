package demo01;

public class InitializationDemoOrder {

    {
        System.out.println("Initialization block");
    }

    static {
        System.out.println("static block");
    }

    public InitializationDemoOrder() {
        System.out.println("constructor");
    }
}
