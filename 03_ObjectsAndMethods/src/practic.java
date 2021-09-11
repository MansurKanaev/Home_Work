public class practic {
    public static String items = "";
    private static int sum;
    private static int addition;
    private static int maxNumber;
    private static int minNumber;

    public static void main(String[] args) {
        variables(6,4);

    }

    public static void variables(int x, int y)
    {

        items = items + "\n" + "Переменная х=" + x + "\n" + "Переменная у=" + y;
        sum = x + y ;
        addition = x * y;
        System.out.println(items);
        System.out.println("Сумма двух переменных равна:" + sum);
        System.out.println("Произведение двух переменных равна:" + addition);
        if (x == y) {

            System.out.println("Переменные равны:" + x);
            return;
        }
        if(x>y) {
         maxNumber=x;
            System.out.println("Максимальное из двух чисел:" + maxNumber );

        }else {
            System.out.println("Максимальное из двух чисел:" + y );

    }
            if(y<x){
                minNumber = y;
                System.out.println("Минмальное  из двух чисел:" + minNumber );
            }else {
                System.out.println("Минмальное  из двух чисел:" + x );
            }




    }





    }








