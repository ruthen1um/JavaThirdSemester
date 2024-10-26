package fibonacci;

class Functions {
    public static int calculate(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return calculate(n - 2) + calculate(n - 1);
    }
}

public class FibNumber {
    protected int n;

    public int getValue() {
        return Functions.calculate(n);
    }
}
