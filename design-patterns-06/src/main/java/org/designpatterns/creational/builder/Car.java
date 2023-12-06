package org.designpatterns.creational.builder;

public class Car {
    private String name;
    private boolean sportExhaust;
    private boolean daylight;

    private Car() {

    }

    private Car(CarBuilder carBuilder) {
        this.name = carBuilder.name;
        this.daylight = carBuilder.daylight;
        this.sportExhaust = carBuilder.sportExhaust;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", sportExhaust=" + sportExhaust +
                ", daylight=" + daylight +
                '}';
    }

    public static class CarBuilder { // nested class
        private String name; // mandatory
        private boolean sportExhaust; // optional
        private boolean daylight; // optional

        public CarBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder setSportExhaust(boolean sportExhaust) {
            this.sportExhaust = sportExhaust;
            return this;
        }

        public CarBuilder setDaylight(boolean daylight) {
            this.daylight = daylight;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Car mazda = new Car.CarBuilder()
                .setName("mazda")
                .setDaylight(true)
                .setSportExhaust(false)
                .build();
        System.out.println(mazda);
    }
}
