package Inheritance;

/**
 * @Author pankaj
 * @create 4/24/21 5:44 PM
 */
public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name,int brain, int body, int size, int weight) {
        this.name = name;
        this.brain=brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
        public void eat(){
            System.out.println("Animal is Eating ?????");
        }

        public void move(int speed){
        System.out.println("Animal moving at speed at "+speed);
        }
}
