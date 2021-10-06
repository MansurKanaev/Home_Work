import java.math.BigDecimal;
import java.math.BigInteger;

public class GeometryCalculator {


    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        return Math.PI * Math.pow(radius, 2);

    }

    // метод должен использовать абсолютное значение radius

    public static double getSphereVolume(double radius) {

        return Math.abs((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));

    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    public static boolean isTrianglePossible(double a, double b, double c) {

        if (a + b > c && b + c > a && c + a > b) {
            return true;
        }
        return false;
    }

    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (isTrianglePossible(a, b, c) == true) {
            double p = (a + b + c) / 2.0;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return -1;
    }
}