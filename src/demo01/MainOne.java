package demo01;

public class MainOne {

    enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}

    public static void main(String[] args) {
        Size s = Size.SMALL;

        System.out.println(s);
    }
}
