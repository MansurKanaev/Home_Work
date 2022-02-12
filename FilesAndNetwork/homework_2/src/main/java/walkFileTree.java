import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class walkFileTree {

    public static class CopyingFileVisitor extends SimpleFileVisitor<Path> {
        private final Path source;
        private final Path destination;

        public CopyingFileVisitor(Path source, Path destination) {
            this.source = source;
            this.destination = destination;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                throws IOException {
            System.out.println("Процесс обработки директории: " + dir);
            Path destinationPath = destination.resolve(source.relativize(dir));
            if (!destinationPath.toFile().exists()) {
                Files.createDirectory(destinationPath);
            }
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            System.out.println("Файл скопирован: " + file);
            Path destinationPath = destination.resolve(source.relativize(file));
            Files.copy(file, destinationPath, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);
            return FileVisitResult.CONTINUE;
        }

    }
}
