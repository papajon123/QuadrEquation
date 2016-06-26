package Equations;

/**
 * Created by Alexander Nosenko on 26.06.2016.
 */

public class QuadrEquation {
    public static double Discriminant(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public static double[] QuadrEquation(double a, double b, double c) {
        double x1, x2;
        double D = Discriminant(a, b, c);
        if(D < 0)
            return null; //new double[0]
        if(D ==0){
            x1 = (-1) * b;
            return new double[]{ x1 };
        }
        if(D > 0) {
            x1 = ((-1) * b + Math.sqrt(D)) / 2 * a; //два корня
            x2 = ((-1) * b - Math.sqrt(D)) / 2 * a; //
            return new double[]{x1, x2};
        }
        return null;
    }
}
