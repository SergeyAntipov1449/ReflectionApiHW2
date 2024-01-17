package Task1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Barbos", 3, "male" , "colly");
        animals[1] = new Dog("Strelka", 5, "female", "bulldog");
        animals[2] = new Cat("Barsik", 1.3, "black");
        animals[3] = new Cat("Mirzik", 4.0, "white");

        for (Animal animal : animals) {
            Class clazz = animal.getClass();
            Field[] fields = clazz.getDeclaredFields();
            Method[] methods = clazz.getDeclaredMethods();
            System.out.println(clazz.getName());
            for (Field field : fields) {
                System.out.println(field.getName() + ": " + field.get(animal));
            }
            System.out.println("Methods: ");
            for (Method method : methods) {
                String methodName = method.getName();
                System.out.println(methodName);
                if (methodName == "makeSound") {
                    method.invoke(animal);
                }
            }
            System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=");
        }
    }
}