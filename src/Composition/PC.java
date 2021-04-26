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


    //================= powerUp() ===============
    public void powerUp(){
        aCase.pressPowerButton();
        drawLogo();
    }
    public void drawLogo(){
        monotor.drawPixelAt(1200,50,"Yellow");
    }
}
