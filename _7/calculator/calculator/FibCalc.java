package calculator;

import fibonacci.FibNumber;
import first.FirstPrevFibNumber;
import second.SecondPrevFibNumber;

public class FibCalc {
    public static int calculate(int n) {
        var firstPrev = new FirstPrevFibNumber();
        var secondPrev = new SecondPrevFibNumber();

        Functions.get_nth_fib_number(secondPrev, firstPrev, n);

        return secondPrev.getValue();
    }
}

class Functions {
    public static void get_nth_fib_number(FibNumber first, FibNumber second, int n) throws IllegalArgumentException {
        if (n < 1) {
            throw new IllegalArgumentException("Число n должно быть натуральным");
        } else if (n == 1) {
            return;
        }

        int sum = first.getValue() + second.getValue();
        first.setValue(second.getValue());
        second.setValue(sum);

        get_nth_fib_number(first, second, n - 1);
    }
}
