package _6;

import _6.exceptions.WrongNumberOfDigitsException;
import _6.exceptions.NotAPositiveNumberException;

public class Converter {
    public static String convert(int number) throws NotAPositiveNumberException, WrongNumberOfDigitsException {
        if (number < 0) {
            throw new NotAPositiveNumberException("Введенное число не является положительным");
        } else if (number < 100 || number > 999) {
            throw new WrongNumberOfDigitsException("Введенное число не является трёхзначным");
        }

        var buffer = new StringBuffer();

        var tens = (number / 10) % 10;
        var ones = (number) % 10;

        // сотни
        String[] hundreds_names = {
            "сто", "двести", "триста", "четыреста",
            "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"
        };

        // десятки (без особого случая)
        String[] tens_names = {
            "двадцать", "тридцать", "сорок", "пятьдесят",
            "шестьдесят", "семьдесят", "восемьдесят", "девяносто"
        };

        // единицы
        String[] ones_names = {
            "один", "два", "три", "четыре",
            "пять", "шесть", "семь", "восемь", "девять"
        };

        // особый случай
        String[] specials_names = {
            "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
            "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"
        };

        buffer.append(hundreds_names[number / 100 - 1]);

        if (tens == 1) {
            buffer.append(' ');
            buffer.append(specials_names[ones]);
        } else if (tens > 1) {
            buffer.append(' ');
            buffer.append(tens_names[tens - 2]);
            buffer.append(' ');
            buffer.append(ones_names[ones - 1]);
        }

        return buffer.toString();
    }
}
