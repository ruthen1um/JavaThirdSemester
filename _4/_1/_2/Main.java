package _4._1._2;

public class Main {
    public static void main(String[] args) {
        var sheep = new Sheep(20, 100);
        var dog = new Dog(5, 50);

        sheep.move();
        dog.move();
    }
}
