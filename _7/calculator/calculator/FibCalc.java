package calculator;

import first.FirstPrevFibNumber;
import second.SecondPrevFibNumber;

public class FibCalc {
    public static int calculate(int n) throws IllegalArgumentException {
        var firstPrev = new FirstPrevFibNumber(n);
        var secondPrev = new SecondPrevFibNumber(n);

        if (n <= 0) {
            throw new IllegalArgumentException("Номер члена последовательности Фибоначчи должен быть натуральным");
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        return secondPrev.getValue() + firstPrev.getValue();
    }
}
