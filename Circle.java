
// Circle.java
import java.awt.Graphics;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g, int x, int y) {
        g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}
