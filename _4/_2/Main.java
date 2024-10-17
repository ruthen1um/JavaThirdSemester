package _4._2;

import java.util.ArrayList;

// вариант 1
public class Main {
    public static void main(String[] args) {
        var solvers = new ArrayList<Solver>();
        solvers.add(new Solver(1, 2, -3));
        solvers.add(new Solver(0, 4, 2));
        solvers.add(new Solver(0, 0, 0));
        solvers.add(new Solver(0, 2, 0));
        solvers.add(new Solver(0, 0, 2));

        for (var solver: solvers) {
            var roots = solver.solve();
            System.out.println("Текущее уравнение: " + solver.a + "x^2 + " + solver.b + "x + " + solver.c);

            if (roots.isEmpty()) {
                System.out.println("Корней нет");
            } else {
                System.out.println("Корни:");
                for (var el : roots) {
                    System.out.println(el);
                }
            }
            System.out.println("--------");
        }
    }
}
