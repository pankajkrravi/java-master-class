package Inheritance;

/**
 * @Author pankaj
 * @create 4/24/21 5:47 PM
 */
public class Dog extends Animal{
    private int  eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name,1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    //=============================================
    public void chew(){
        System.out.println("Dog ---> chewing()");
    }
    public void move()
    {
        System.out.println("Dog.move()");
    }
    public void walk() {
        System.out.println("Dog.walk()");
    }
    public void run() {
        System.out.println("Dog.run()");
    }
    @Override
    public void eat() {
        System.out.println("Dog class --> eat() called");
        chew();
        super.eat();
    }
}
