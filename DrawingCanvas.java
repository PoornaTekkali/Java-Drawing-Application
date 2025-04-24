
// DrawingCanvas.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class DrawingCanvas extends JPanel {
    private List<Shape> shapes = new ArrayList<>();
    private Shape currentShape = null;

    public DrawingCanvas() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (currentShape != null) {
                    shapes.add(currentShape);
                    currentShape.draw(getGraphics(), e.getX(), e.getY());
                }
            }
        });
    }

    public void setCurrentShape(Shape shape) {
        currentShape = shape;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g, 0, 0);
        }
    }
}
