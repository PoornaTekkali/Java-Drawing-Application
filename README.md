# Java Swing Drawing Application

## 🖌️ Description

This is a simple Java desktop drawing application built with **Swing**. It allows users to:

- 🎯 Choose between two shapes: **Circle** and **Box**
- 🖱️ Draw selected shapes by clicking anywhere on the canvas

The app demonstrates core **object-oriented programming** concepts like **interfaces**, **inheritance**, and **polymorphism**, along with **GUI development** using Java Swing.

---

## 🔧 Technologies Used

- Java SE
- Java Swing (GUI)
- AWT Graphics for custom drawing

---

## 📦 Features

- Choose and draw circles or squares (boxes)
- Add multiple shapes with clicks
- Uses a `Shape` interface for clean structure
- Separates logic into classes for maintainability:
  - `Shape` (interface)
  - `Circle` and `Box` (implementations)
  - `DrawingCanvas` (drawing surface)
  - `DrawingApplication` (main GUI setup)

---

## 🧠 How It Works

- `Shape` interface defines a `draw()` method
- `Circle` and `Box` implement `Shape` with custom drawing logic
- `DrawingCanvas` stores selected shape and handles mouse clicks
- When the user clicks on the canvas, the current shape is drawn at that position

---

## 🗂️ Project Structure

DrawingApp/
├── src/
│   ├── Shape.java              # Defines draw(Graphics, x, y)
│   ├── Box.java                # Implements Shape.draw as a square
│   ├── Circle.java             # Implements Shape.draw as a circle
│   ├── DrawingCanvas.java      # JPanel that stores & paints shapes
│   └── DrawingApplication.java # Main class: sets up JFrame & buttons
├── lib/                        # (optional) any external JARs
├── resources/                  # (optional) images, icons, etc.
├── .gitignore                  # Git ignore rules
└── README.md                   # Project overview and instructions

---

## 🚀 How to Run

1. Make sure Java is installed on your system.
2. Save all `.java` files in the same folder.
3. Compile and run from terminal:

```bash
javac *.java
java DrawingApplication

🖼️ Usage
Run the application

Click "Circle" or "Box" to select a shape

Click on the white canvas area to draw the selected shape

🔍 Known Limitations
Shapes are currently drawn at a fixed size

Shapes are always drawn at the top-left of the canvas (doesn’t remember individual positions properly in paintComponent)

👉 You can fix this by storing position data along with each shape.
