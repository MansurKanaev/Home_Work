import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Main {
    public static boolean status = false;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь до папки, для ее копирования:");
        String sourceDirectory = scanner.nextLine();
        System.out.println("Введите путь до папки куда копировать файлы:");
        String destinationDirectory = scanner.nextLine();
        Path source = Paths.get(sourceDirectory);
        Path destination = Paths.get(destinationDirectory);
        Files.walkFileTree(source, new walkFileTree.CopyingFileVisitor(source, destination));
        System.out.println("Копирование завершено!");

//        do {
//            System.out.println("Введите путь до папки, для ее копирования:");
//
//            System.out.println("Введите путь до папки куда копировать файлы:");
//
//            try {
//                FileUtils.copyFolder(sourceDirectory, destinationDirectory);
//                if (status) {
//                    System.out.println("Копирование завершено!");
//                } else {
//                    System.err.println("Ошибка введите запрос корректно!");
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } while (!sourceDirectory.isEmpty());


    }
}
