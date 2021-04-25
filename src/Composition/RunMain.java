package Composition;

/**
 * @Author pankaj
 * @create 4/25/21 5:31 PM
 */
public class RunMain {
    public static void main(String[] args) {
        Dimensions dimensions= new Dimensions(20,20,5);
        Case aCase=new Case("220B","Dell","240",dimensions);

        Monotor monotor=new Monotor("27 inch Best","Acer",27,new Resolution(2500,1500));

        Motherboard motherboard= new Motherboard("Bj-300","Asus",4,6,"v2.11");

        PC pc=new PC(aCase,monotor,motherboard);
        pc.getMonotor().drawPixelAt(0,2000,"Red");
        pc.getMotherboard().loadProgram("Linux 1.1");
        pc.getaCase().pressPowerButton();
    }
}
