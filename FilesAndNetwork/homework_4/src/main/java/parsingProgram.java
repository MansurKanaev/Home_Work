import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;


public class parsingProgram {


    public static void downloadFile(Elements elements) {
        ArrayList<String> img = new ArrayList<>();
        FileOutputStream fout = null;
        BufferedInputStream in = null;


        for (Element element : elements) {
            String url = element.select("img").attr("src");
            img.add(url);
        }

        for (String s : img) {
            String name = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.indexOf('/', 8) > 0) {
                    name = s.substring(61);
                    break;
                }
            }
            try {
                try {
                    in = new BufferedInputStream(new URL(s).openStream());
                    fout = new FileOutputStream("src/images/" + name);
                    byte[] data = new byte[1024];
                    int count;
                    int file = 0;
                    while ((count = in.read(data, 0, 1024)) != -1) {
                        fout.write(data, 0, count);
                        fout.flush();
                        System.out.println("Файл: " + name + " загружена.");
                        file++;
                    }
                    System.out.println("Всего загружено: " + file + " файлов");
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    assert in != null;
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        assert fout != null;
                        fout.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

