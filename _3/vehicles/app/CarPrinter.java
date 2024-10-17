package _3.vehicles.app;

import _3.vehicles.Car;

public class CarPrinter {
    public static void print(Car car) {
        System.out.println("Владелец: " + car.getOwnerName());
        System.out.println("Номер страховки: " + car.getInsuranceNumber());
        System.out.println("Тип двигателя: " + car.getEngineType());
    }
}
