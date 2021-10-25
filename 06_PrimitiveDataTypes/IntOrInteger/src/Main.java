import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
       double a = 5;
        double b = 5;
        double c = 20;


            BigDecimal decimal = new BigDecimal(a + b);
            BigDecimal decimal1 = new BigDecimal(b + c);
            BigDecimal decimal2 = new BigDecimal(c + a);
            BigDecimal decimal3 = new BigDecimal(a);
            BigDecimal decimal4 = new BigDecimal(b);
            BigDecimal decimal5 = new BigDecimal(c);

            decimal.compareTo(decimal5);
            decimal1.compareTo(decimal3);
            decimal2.compareTo(decimal4);

        System.out.println(decimal.compareTo(decimal5));

        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

        for(int i = 1040; i <= 1045 ; i++){
            char c1 = (char) i;
            System.out.println(i + " - " + c1);
        }
        System.out.println("1025" + " - " + (char) 1025);

        for(int i = 1046; i <= 1077 ; i++){
            char c2 = (char) i;
            System.out.println(i + " - " + c2);
        }
        System.out.println("1105" + " - " + (char) 1105);

        for(int i = 1078; i <= 1103 ; i++){
            char c3 = (char) i;
            System.out.println(i + " - " + c3);
        }

    }
}
