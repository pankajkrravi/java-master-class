package Composition;

/**
 * @Author pankaj
 * @create 4/25/21 5:28 PM
 */
public class PC {
    private Case aCase;
    private Monotor monotor;
    private Motherboard motherboard;

    public PC(Case aCase, Monotor monotor, Motherboard motherboard) {
        this.aCase = aCase;
        this.monotor = monotor;
        this.motherboard = motherboard;
    }

    public Case getaCase() {
        return aCase;
    }

    public Monotor getMonotor() {
        return monotor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
