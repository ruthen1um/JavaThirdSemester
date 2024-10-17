package _6;

import _6.exceptions.*;

public class Main {
    public static void main(String[] args)
    throws NotANumberException, WrongNumberOfDigitsException, NotAPositiveNumberException {
        var scanner = new CustomScanner(System.in);

        System.out.print("Введите положительное трёхзначное число: ");

        var number = scanner.nextInt();

        var result = Converter.convert(number);

        System.out.println("Вы ввели число " + result);

        scanner.close();
    }
}
