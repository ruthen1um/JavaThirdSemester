package _8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException, InterruptedException {
        System.out.print("Введите номер числа Фибоначчи: ");

        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Результат: " + Fibonacci.calculate(n));
    }
}

class Constants {
    public static final long[] matrix = {
        1, 1,
        1, 0
    };
}

class Fibonacci {
    public static long calculate(int n) throws InterruptedException, IllegalArgumentException {
        long result_matrix[] = {
            1, 1,
            1, 0
        };

        if (n < 1) {
            throw new IllegalArgumentException("Число n должно быть натуральным");
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        while (n-- > 3) {
            CellMultiplierThread threads[] = {
                new CellMultiplierThread0(result_matrix),
                new CellMultiplierThread1(result_matrix),
                new CellMultiplierThread2(result_matrix),
                new CellMultiplierThread3(result_matrix)
            };

            for (int i = 0; i < threads.length; ++i) {
                threads[i].start();
            }

            for (int i = 0; i < threads.length; ++i) {
                threads[i].join();
            }

            for (int i = 0; i < threads.length; ++i) {
                result_matrix[i] = threads[i].getResult();
            }

        }

        return result_matrix[0];
    }
}

class CellMultiplierThread extends Thread {
    protected long value;
    protected long[] matrix;

    public CellMultiplierThread(long[] matrix) {
        this.matrix = matrix;
    }

    public long getResult() {
        return value;
    }
}

class CellMultiplierThread0 extends CellMultiplierThread {
    /*
        * x,
        x x
    */
    public CellMultiplierThread0(long[] matrix) {
        super(matrix);
    }

    public void run() {
        value = Constants.matrix[0] * matrix[0] + Constants.matrix[1] * matrix[2];
    }
}

class CellMultiplierThread1 extends CellMultiplierThread {
    /*
        x *,
        x x
    */
    public CellMultiplierThread1(long[] matrix) {
        super(matrix);
    }

    public void run() {
        value = Constants.matrix[0] * matrix[1] + Constants.matrix[1] * matrix[3];
    }
}

class CellMultiplierThread2 extends CellMultiplierThread {
    /*
        x x,
        * x
    */
    public CellMultiplierThread2(long[] matrix) {
        super(matrix);
    }

    public void run() {
        value = Constants.matrix[2] * matrix[0] + Constants.matrix[3] * matrix[2];
    }
}

class CellMultiplierThread3 extends CellMultiplierThread {
    /*
        x x,
        x *
    */
    public CellMultiplierThread3(long[] matrix) {
        super(matrix);
    }

    public void run() {
        value = Constants.matrix[2] * matrix[1] + Constants.matrix[3] * matrix[3];
    }
}
