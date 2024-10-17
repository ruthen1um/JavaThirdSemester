package _5;

public class Main {
    public static void main(String[] args) {
        var mySet = new PairSet(5);

        System.out.println("Добавим элементы в множество и выведем их:");
        mySet.insert('c', 981);
        mySet.insert('a', 2341);
        mySet.insert('d', 461);
        mySet.insert('l', -3213);
        mySet.insert('x', -3213);
        mySet.display();
        System.out.println();

        System.out.println("Выведем значение элемента множества:");
        System.out.println("a = " + mySet.get('a'));
        System.out.println();

        System.out.println("Удалим элемент из множества и выведем его элементы:");
        mySet.remove('a');
        mySet.display();
    }
}
