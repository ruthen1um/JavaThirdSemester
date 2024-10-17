package _4._1._1;

public class Sheep extends Animal {
    public Sheep(int age, int size) {
        super(age, size);
    }

    @Override
    public int toHumanAge() {
        // будем считать, что овцы живут 25 лет, а человек - 100 лет
        return this.get_age() * 100 / 25;
    }

    @Override
    public void move() {
        System.out.println("Овца идёт");
    }
}
