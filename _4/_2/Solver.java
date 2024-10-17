package _4._2;

import java.util.ArrayList;

public class Solver extends AbstractSolver {
    Solver(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public ArrayList<Double> solve() {
        var roots = new ArrayList<Double>();

        if (a == 0) {
            if (b == 0) return roots;
            roots.add((double)-c / (double)b);
            return roots;
        }

        var d = b * b - 4 * a * c;

        if (d == 0) {
            roots.add((double)-b / (double)(2 * a));
        } else if (d > 0) {
            roots.add((double)(-b + Math.sqrt(d)) / (double)(2 * a));
            roots.add((double)(-b - Math.sqrt(d)) / (double)(2 * a));
        }

        return roots;
    }
}
