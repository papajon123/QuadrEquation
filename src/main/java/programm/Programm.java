package programm;

import java.util.Scanner;

import static Equations.QuadrEquation.QuadrEquation;

/**
 * Created by Alexander Nosenko on 26.06.2016.
 */

public class Programm {
    public static void main(String[] args) {
        System.out.println("Решение квадратного уравнения.");
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a=");
            double a=scanner.nextDouble();
            System.out.println("Введите b=");
            double b=scanner.nextDouble();
            System.out.println("Введите c=");
            double c=scanner.nextDouble();

            double[] roots = QuadrEquation(a,b,c);
            if(roots == null)
                System.out.println("Корней нет");
            else
            if(roots.length == 1)
                System.out.println("x1 = " + roots[0]);
            else
                System.out.println("x1 = " + roots[0] + "\nx2 = " + roots[1]);

            System.out.println("'Y'  для выхода");

            String q = scanner.next();
            if(q.equals("Y"))
                break;
        }
    }
}
