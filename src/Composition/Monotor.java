package Composition;

/**
 * @Author pankaj
 * @create 4/25/21 5:10 PM
 */
public class Monotor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution resulation;// HAS A

    public Monotor(String model, String manufacturer, int size, Resolution resulation) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.resulation = resulation;
    }

    // =================== drawPixel ===================
    public void drawPixelAt(int x,int y ,String color){
        System.out.println("Drawing pixel at "+x+" , "+y+" color "+color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResulation() {
        return resulation;
    }
}
