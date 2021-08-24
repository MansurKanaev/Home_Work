public class Arithmetic {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int sum;
        int addition;
        int c = x + y;
        sum = c;
        System.out.println("Сумма двух переменных равна:" + sum);
        int d = x * y;
        addition = d;
        System.out.println("Произведение двух переменных:" + addition);

        if (x == y) {

            System.out.println("Переменные равны:" + x);
            return;

        }

        if (x > y) {

            System.out.println("Максимальное из двух чисел:" + x);
        } else {
            System.out.println("Максимальное из двух чисел:" + y);
        }
        if (x < y) {
            System.out.println("Минимальное  из двух чисел:" + x);
        }else {
            System.out.println("Минимальное  из двух чисел:" + y);
        }
    }


}
