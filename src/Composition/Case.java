package Composition;

/**
 * @Author pankaj
 * @create 4/25/21 5:19 PM
 */
public class Case {
    private String model;
    protected String manufacture;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacture, String powerSupply, Dimensions dimensios) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
        this.dimensions = dimensios;
    }
    public void pressPowerButton(){
        System.out.println("Button Pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
