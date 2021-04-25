package Composition;

/**
 * @Author pankaj
 * @create 4/25/21 5:06 PM
 */
public class Motherboard {
    private String  odel;
    private String manufacture;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String odel, String manufacture, int ramSlots, int cardSlots, String bios) {
        this.odel = odel;
        this.manufacture = manufacture;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public String getOdel() {
        return odel;
    }

    public void setOdel(String odel) {
        this.odel = odel;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
    //=================== loadProgram=====================
    public void loadProgram(String programName) {
        System.out.println("Program "+programName+" is Noe Running !!!");
    }
}
