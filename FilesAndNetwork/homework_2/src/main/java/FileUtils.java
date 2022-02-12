import java.io.*;
import java.util.Objects;

public class FileUtils {

    public static void copyFolder(String sourceDirectory, String destinationDirectory) throws IOException {
        File fOrig = new File(sourceDirectory);
        File fCop = new File(destinationDirectory);
        if (fOrig.isDirectory()) {
            if (!fCop.exists()) {
                //noinspection ResultOfMethodCallIgnored
                fCop.mkdir();
            }
            for (String file : Objects.requireNonNull(fOrig.list())) {
                try {
                    copyFolder(new File(fOrig, file).getPath(), new File(fCop, file).getPath());
                } catch (NullPointerException e) {
                    System.err.println("Не удалось скопировать файл \"" + file + "\"!");
                }
            }
        } else {
            if (fOrig.exists()) {
                InputStream is = null;
                OutputStream os = null;
                try {
                    is = new FileInputStream(fOrig);
                    os = new FileOutputStream(fCop);
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = is.read(buffer)) > 0) {
                        os.write(buffer, 0, length);
                    }
                } finally {
                    if (is != null && os != null) {
                        is.close();
                        os.close();
                    }
                }
            }
            if (fCop.exists() && fOrig.exists()) {
                Main.status = true;
            }
        }
    }
}



