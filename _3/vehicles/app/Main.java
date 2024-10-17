package _3.vehicles.app;

import _3.vehicles.Car;
import _3.vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        var car_1 = new Car("Oleg", 41242, "Diesel");
        var car_2 = new ElectricCar("Ivan", 42389);

        CarPrinter.print(car_1);
        CarPrinter.print(car_2);
    }
}
