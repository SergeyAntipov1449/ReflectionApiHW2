package Task1;

public class Dog extends Animal{
    String name;
    double age;
    String sex;
    String breed;

    public Dog(String name, double age, String sex, String breed) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.breed = breed;
    }
    public void makeSound(){
        System.out.println("Ауф");
    }
}
