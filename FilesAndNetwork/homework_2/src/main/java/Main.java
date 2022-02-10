import java.util.Scanner;

public class Main {
    public static boolean status = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите путь до папки, для ее копирования:");
            String sourceDirectory = scanner.nextLine();
            System.out.println("Введите путь до папки куда копировать файлы:");
            String destinationDirectory = scanner.nextLine();
            try {
                FileUtils.copyFolder(sourceDirectory, destinationDirectory);
                if (status) {
                    System.out.println("Копирование завершено!");
                } else {
                    System.err.println("Ошибка введите запрос корректно!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (sourceDirectory.isEmpty()) {
                break;
            }
        }
    }
}
