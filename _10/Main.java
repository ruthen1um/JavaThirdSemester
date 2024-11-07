package _10;

public class Main {
    public static void main(String[] args) {
        var name1 = new Name<>(1);
        var name2 = new Name<>(1.23);
        var name3 = new Name<>(false);
        var name4 = new Name<>(new Object());
        var name5 = new Name<>("Привет, мир");

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);
    }
}
