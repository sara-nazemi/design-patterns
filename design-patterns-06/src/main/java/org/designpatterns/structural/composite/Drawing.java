package org.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    List<Shape> shapes = new ArrayList<>(); // composite

    @Override
    public void draw(String color) {
        for (Shape shape : shapes) {
            shape.draw(color);
        }
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        this.shapes.remove(shape);
    }

    public void clear() {
        this.shapes.clear();
    }
}

interface Shape {
    void draw(String color);
}

class Triangle implements Shape {

    @Override
    public void draw(String color) {
        System.out.println("triangle drawing with color: " + color);
    }
}

class Circle implements Shape {

    @Override
    public void draw(String color) {
        System.out.println("circle drawing with color: " + color);
    }
}

class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape triangle2 = new Triangle();

        Drawing drawing = new Drawing();
        drawing.addShape(triangle);
        drawing.addShape(circle);
        drawing.addShape(triangle2);

        drawing.draw("red");

        drawing.removeShape(triangle2);

        drawing.draw("green");

    }
}
