package _6;
import _6.exceptions.NotANumberException;

import java.util.InputMismatchException;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Scanner;

public class CustomScanner implements Closeable {
    private Scanner scanner;
    public CustomScanner(InputStream source) {
        scanner = new Scanner(source);
    }

    public int nextInt() throws NotANumberException {
        try {
            var result = scanner.nextInt();
            return result;
        } catch (InputMismatchException e) {
            throw new NotANumberException("Введённое значение не является числом");
        }
    }

    @Override
    public void close() {
        scanner.close();
    }
}
