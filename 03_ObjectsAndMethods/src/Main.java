public class Main {



    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Молоко",0 ,0 ,0 );
        basket.add("Хлеб", 0, 0,0 );
        basket.add("Макароны", 0, 0, 0);
        basket.print("");


        // Arithmetic класс

        Arithmetic myArithmetic = new Arithmetic( 4, 5);

        System.out.println();
        myArithmetic.print();


      // Класс Printer

        Printer myPrinter = new Printer();
        System.out.println();
        System.out.println();
        myPrinter.append("Практика в Джава","Смотреть, учить, практиковать дважды.", 5);
        myPrinter.print();
        System.out.println();
        myPrinter.append("Реферат","как программировать",4);
        myPrinter.print();
        System.out.println();
        myPrinter.append("Доклад","Инвестиции",8);
        myPrinter.print();
        System.out.println();
    }
}

