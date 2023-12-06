package org.designpatterns.structural.bridge;

public class Bridge {
    public static void main(String[] args) {
        Square square = new Square(new Red());
    }
}

interface Color {

}

class Red implements Color {

}

class Green implements Color {

}

interface Shape {

}

class Square implements Shape {
    Color color;

    public Square(Color color) {
        this.color = color;
    }
}

class Circle implements Shape {
    Color color;

    public Circle(Color color) {
        this.color = color;
    }
}

class Triangle implements Shape {

}