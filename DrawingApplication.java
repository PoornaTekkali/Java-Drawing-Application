import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter; // Import MouseAdapter
import java.awt.event.MouseEvent; // Import MouseEvent
import java.util.List;
import java.util.ArrayList;

public class DrawingApplication {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        DrawingCanvas canvas = new DrawingCanvas();
        frame.add(canvas);
        JPanel controlPanel = new JPanel();
        controlPanel.setPreferredSize(new Dimension(120, frame.getHeight()));
        controlPanel.setBackground(Color.GRAY);
        JButton circleButton = new JButton("Circle");
        JButton boxButton = new JButton("Box");

        circleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.setCurrentShape(new Circle(30)); // Change radius as needed
            }
        });

        boxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.setCurrentShape(new Box(70)); // Change size as needed
            }
        });

        controlPanel.add(circleButton);
        controlPanel.add(boxButton);
        frame.add(controlPanel, BorderLayout.WEST);
        frame.setVisible(true);
    }
}

// DrawingCanvas.java (Updated without clearCanvas method)
class DrawingCanvas extends JPanel {
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
