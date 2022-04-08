package demo02;

public class MainThree extends VersionDemo{
    public MainThree(){
        super(2,3);
        System.out.println("MainThree invoked!");
    }

    public static void main(String[] args) {
        MainThree mt1 = new MainThree();
    }
}
