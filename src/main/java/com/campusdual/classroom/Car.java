package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer;
    public int tachometer;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
        this.brand = "Citroën";
        this.model = "Xsara";
        this.fuel = "Diesel";
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("Vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se puede apagar el vehículo. Primero tiene que estar detenido");
        }
    }

    public void accelerate() {
        if (this.tachometer == 0) {
            System.out.println("No se puede acelerar. El vehículo está apagado");
            return;
        }
        if (this.reverse) {
            System.out.println("Acelerando en marcha atrás...");
            if (this.speedometer < 30) {
                this.speedometer += 10;
            } else {
                System.out.println("Velocidad máxima en marcha atrás alcanzada (30 km/h).");
            }
        } else {
            if (this.speedometer < MAX_SPEED) {
                this.speedometer += 10;
                if (this.speedometer > MAX_SPEED) {
                    this.speedometer = MAX_SPEED;
                }
                System.out.println("Acelerando... Velocidad actual: " + this.speedometer + " km/h");
            } else {
                System.out.println("No se puede superar la velocidad máxima (" + MAX_SPEED + " km/h).");
            }
        }
    }

    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer -= 10;
            if (this.speedometer < 0) {
                this.speedometer = 0;
            }
            System.out.println("Frenando...Velocidad actual: " + this.speedometer + " km/h");
        } else {
            System.out.println("El vehículo ya está detenido.");
        }
    }

    public void turnAngleOfWheels(int angle) {
        int newAngle = this.wheelsAngle + angle;
        if (newAngle > 45) {
            this.wheelsAngle = 45;
            System.out.println("No se puede girar más de 45° hacia ningún lado.");
        } else if (newAngle < -45) {
            this.wheelsAngle = -45;
            System.out.println("No se puede girar más de 45° hacia la izquierda.  Ángulo máximo: -45°.");
        } else {
             this.wheelsAngle = newAngle;
            System.out.println("Volante girado a " + this.wheelsAngle + "°.");
        }
    }

    public String showSteeringWheelDetail() {

        return "El volante está girado " + this.wheelsAngle + "° a la derecha.";
    }

    public boolean isReverse() {
        return this.reverse; // Aquí decía return false;
    }

    public void setReverse(boolean reverse) {
        if (reverse) {
            if (this.speedometer > 0) {
                System.out.println("No se puede poner en marcha atrás mientras el vehículo está en movimiento.");
                return;
            }
            this.reverse = true;
            this.gear = "R";
            System.out.println("Marcha atrás activada.");
        } else {
            this.reverse = false;
            this.gear = "N";
            System.out.println("Marcha adelante (o punto muerto) activada.");
        }
    }

    public void showDetails() {
        System.out.println("------- Detalles de vhículo ------");
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Combustible: " + this.fuel);
        System.out.println("Velocidad: " + this.speedometer + "km/h");
        System.out.println("Tecómetro: " + this.tachometer + "rpm");
        System.out.println("Marcha: " + this.gear);
        System.out.println("Ángulo de las ruedas: " + this.wheelsAngle + "°");
        System.out.println("-----------------------");
    }


    public boolean isTachometerGreaterThanZero() {

        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {

        return this.tachometer == 0;
    }

    public static void main(String[] args) {

    }
}


