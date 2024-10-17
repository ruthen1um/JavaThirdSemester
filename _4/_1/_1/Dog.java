package _4._1._1;

public class Dog extends Animal {
    public Dog(int age, int size) {
        super(age, size);
    }

    @Override
    public int toHumanAge() {
        // будем считать, что собаки живут 12 лет, а человек - 100 лет
        return this.get_age() * 100 / 12;
    }

    @Override
    public void move() {
        System.out.println("Собака идёт");
    }
}
