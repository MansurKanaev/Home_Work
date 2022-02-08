import java.io.File;

public class FileUtils {

    private static final String[] sizeUnits = {"B", "Kb", "Mb", "Gb", "Tb"};

    public static long calculateFolderSize(String path) {
        File file = new File(path);
        return calculate(file);
    }

    private static long calculate(File file) {
        long size = 0;
        File[] files = file.listFiles();
        for (File file1 : files != null ? files : new File[0]) {
            if (file1.isDirectory()) {
                size += calculate(file1);
            } else {
                size += file1.length();
            }
        }
        return size;
    }

    public static String getSize(double size) {
        for (int i = 0; i < sizeUnits.length; i++) {
            double value = size / Math.pow(1024, i);
            if (value < 1024) {
                return String.format("%.1f", value) + " " + sizeUnits[i];
            }
        }
        return String.format("%.1f", size) + "b";
    }
}
