package demo01;

import java.util.Arrays;

public class MainThree {
    public static void main(String[] args) {
        String collection = String.join("-", "J", "a", "v", "a", "\u2122");
        System.out.println(collection);

        String name = "Hello World";
        String newName = String.join("-", name.split(""));
        System.out.println(newName);

    }

}
