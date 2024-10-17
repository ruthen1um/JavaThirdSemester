package _2;

public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1\n");
        var car_1 = new Car("Alfa Romeo Giulia Quadrifoglio", "У467АС", "Зелёный", 2024);
        var car_2 = new Car();
        var car_3 = new Car("Lada Samara Sedan", "Красный");

        System.out.println("\nзадание 2\n");
        car_1.To_String();;

        System.out.println("цвет первой машины: " + car_1.getColor());
    }
}

class Car {
    private String model;
    private String license;
    private String color;
    private int year;

    public Car(String model, String license, String color, int year) {
        System.out.println("конструктор со всеми полями");
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car() {
        System.out.println("конструктор по умолчанию");
        this.model = "Cadillac Escalade";
        this.license = "В007АБ";
        this.color = "Синий";
        this.year = 2024;
    }

    public Car(String model, String color) {
        System.out.println("конструктор с произвольными параметрами: модель и цвет");
        this.model = model;
        this.license = "А123БВ";
        this.color = color;
        this.year = 2024;
    }

    public void To_String() {
        System.out.println("модель: " + model);
        System.out.println("номер: " + license);
        System.out.println("цвет: " + color);
        System.out.println("год: " + year);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
