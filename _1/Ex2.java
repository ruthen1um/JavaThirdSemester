package _1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Введите число юаней: ");

        var yuan = scanner.nextInt();
        scanner.close();

        var printer = new YuanPrinter(yuan);
        printer.print();

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

class YuanPrinter {
    private int yuan;

    public YuanPrinter(int yuan) {
        this.yuan = yuan;
    }

    public void print() {
        System.out.print("Вы ввели " + yuan + ' ');

        int digit = yuan % 10;


        if (11 <= yuan % 100 && yuan % 100 <= 14) {
            System.out.println("китайских юаней");
        } else if (digit == 1) {
            System.out.println("китайский юань");
        } else if (2 <= digit && digit <= 4) {
            System.out.println("китайских юаня");
        } else {
            System.out.println("китайских юаней");
        }
    }
}
