package Composition;

/**
 * @Author pankaj
 * @create 4/25/21 5:12 PM
 */
public class Resolution {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
