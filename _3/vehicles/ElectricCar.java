package _3.vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity = 100;
    public ElectricCar(String ownerName, int insuranceNumber) {
        super(ownerName, insuranceNumber, "Electric");
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
