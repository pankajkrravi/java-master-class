package Inheritance;

/**
 * @Author pankaj
 * @create 4/24/21 5:57 PM
 */
public class RunMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long Silkky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
