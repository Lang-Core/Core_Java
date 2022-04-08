package demo02;

public class MainTwo {
    public static void main(String[] args) {
        SumDemo sd1 = new SumDemo();
        sd1.displaySum();

        SumDemo sd2 = new SumDemo(5, 5);
        sd2.displaySum();
    }
}
