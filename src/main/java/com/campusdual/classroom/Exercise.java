package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Focus", "Gasolina");
        car.start();
        car.start();
        car.accelerate();
        car.accelerate();

        for (int i = 0; i < 20; i++) {
            car.brake();
            car.start();
            car.accelerate();
            car.stop();

            car.turnAngleOfWheels (20);
            car.turnAngleOfWheels (30);
            System.out.println(car.showSteeringWheelDetail());

            car.accelerate();
            car.setReverse(true);
            car.brake();
            car.setReverse(true);

            car.showDetails();
        }
    }

}