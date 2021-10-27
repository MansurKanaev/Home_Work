import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();
        int numBoxes = Integer.parseInt(boxes);
        int truck = 0;
        int container = 0;
        for (int i = 1; i <= numBoxes; i++) {
            if (i % 324 == 1) {
                truck += 1;
                System.out.println("Грузовик: " + truck);

            }
            if (i % 27 == 1) {
                container += 1;
                System.out.println("\tКонтейнер: " + container);
            }
            System.out.println("\t\tЯщик: " + i);
        }
        System.out.println("Необходимо:" + System.lineSeparator() + "грузовиков - " + truck + " шт." +
                System.lineSeparator() + "контейнеров - " + container + " шт.");

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }
}
