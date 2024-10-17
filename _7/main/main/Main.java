package main;

import java.util.Scanner;
import calculator.FibCalc;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Введите номер числа Фибоначчи: ");
        var n = scanner.nextInt();
        System.out.println("Число Фибоначчи под номером " + n + ": " + FibCalc.calculate(n));
    }
}
