package _1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Введите число юаней: ");

        var yuan = scanner.nextInt();
        scanner.close();

        var roubles = Converter.yuan_to_ruble(yuan);

        System.out.println("Результат конвертирования: " + (int)Math.ceil(roubles));
    }

}

class Converter {
    final static double ROUBLES_PER_YUAN = 11.91;

    public static double yuan_to_ruble(int yuan) {
        return ROUBLES_PER_YUAN * yuan;
    }
}
