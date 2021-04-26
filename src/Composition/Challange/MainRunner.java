package Composition.Challange;

/**
 * @Author pankaj
 * @create 4/26/21 4:13 PM
 */
public class MainRunner {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wal2= new Wall("East");

        Wall wall3= new Wall("South");

        Wall wall4 = new Wall("North");
        Ceiling ceiling= new Ceiling(22,36);

        Bed bed=new Bed("Modern",4,3,2,1);

        Lamp lamp= new Lamp("Classic ",false,55);

        BedRoom bedRoom=new BedRoom("Pankaj rooms",wall1,wal2,wall3,wall4,ceiling,bed,lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

    }
}
