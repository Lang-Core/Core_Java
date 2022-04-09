package demo03;

import java.util.Locale;

public class ExceptionDemoOne {
    public static void say(){
        sayHello(null);
    }

    private static void sayHello(String msg){
        System.out.println(msg.toUpperCase(Locale.ROOT));
    }
}
