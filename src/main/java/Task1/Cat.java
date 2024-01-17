package Task1;

public class Cat extends Animal{
    String name;
    double age;
    String color;

    public Cat(String name, double age, String color) {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public void goForAWalk(){
        System.out.println("Гуляю!");
    }
}
