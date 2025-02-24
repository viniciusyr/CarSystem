package entities;

import enums.VehicleStatus;

public class Car {
    private String model;
    private int year;
    private String plate;
    private VehicleStatus status;

    private Car(String model, int year, String plate, VehicleStatus status) {
        this.model = model;
        this.year = year;
        this.plate = plate;
        this.status = status;
    }

    public static class CarBuilder {
        private String model;
        private int year;
        private String plate;
        private VehicleStatus status;

        public CarBuilder modelBuilder(String model){
            this.model = model;
            return this;
        }

        public CarBuilder yearBuilder(int year){
            this.year = year;
            return this;
        }

        public CarBuilder plateBuilder(String plate){
            this.plate = plate;
            return this;
        }

        public CarBuilder statusBuilder(VehicleStatus status){
            this.status = status;
            return this;
        }

        public Car build(){
            return new Car(model, year, plate, status);
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", plate='" + plate + '\'' +
                ", status=" + status +
                '}';
    }
}
