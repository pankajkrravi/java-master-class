package Classes;

/**
 * @Author pankaj
 * @create 4/24/21 4:13 PM
 */
public class MainRunner {
    public static void main(String[] args) {
        Car  car=new Car();
        car.setColor("Red");
        car.setDoors(2);
        car.setEngine("");
        car.setWheels(4);
        car.setModel("Carrera");
        System.out.println("Color = "+car.getColor());
    }
}
