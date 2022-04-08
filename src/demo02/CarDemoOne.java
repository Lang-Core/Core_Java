package demo02;

public class CarDemoOne {
    int number;
    String type;

    public CarDemoOne() {
        this.number = 1;
        this.type = "None";
    }

    public CarDemoOne(int number, String type) {
        this.number = number;
        this.type = type;
    }

    public void displayNumber(){
        System.out.println(this.number);
    }

    public void displayType(){
        System.out.println(this.type);
    }
}
