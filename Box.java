
// Box.java
import java.awt.Graphics;

public class Box implements Shape {
    private int size;

    public Box(int size) {
        this.size = size;
    }

    @Override
    public void draw(Graphics g, int x, int y) {
        g.drawRect(x, y, size, size);
    }
}
