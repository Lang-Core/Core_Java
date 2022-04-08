package demo02;

public class SumDemo {
    private int sum;

    public SumDemo() {
        this(2,2);
    }

    public SumDemo(int num1, int num2){
        this.sum = num1 + num2;
    }

    public void displaySum(){
        System.out.println("Sum: " + this.sum);
    }
}
