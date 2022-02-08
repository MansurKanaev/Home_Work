import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь до папки:");

        while (true) {
            String path = scanner.nextLine();
            double size;
            try {
                size = FileUtils.calculateFolderSize(path);

                if (size == 0) {
                    throw new Exception("Путь до папки введен не верно! Пример: F:\\Mansur");
                }
                System.out.println("Размер папки \"" + path + "\" составляет " + FileUtils.getSize(size));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            if (path.isEmpty()) {
                break;
            }
        }
    }
}
