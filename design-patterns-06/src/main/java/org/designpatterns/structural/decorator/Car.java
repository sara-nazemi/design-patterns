package org.designpatterns.structural.decorator;

public interface Car {
    void assemble();
}

class NormalCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Normal Car is created.");
    }
}

class CarDecorator implements Car {

    private Car car; // warpper

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}

class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Luxury Car assembled.");
    }
}

class Main {
    public static void main(String[] args) {
        LuxuryCar luxuryCar = new LuxuryCar(new NormalCar());
        luxuryCar.assemble();
    }
}