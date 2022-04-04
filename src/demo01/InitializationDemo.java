package demo01;

public class InitializationDemo {
    private String name;
    private int age;

    {
        name = "JoJo";
        age = 16;
    }


    public InitializationDemo() {
    }

    public InitializationDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "InitializationDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
