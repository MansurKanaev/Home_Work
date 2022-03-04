import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://lenta.ru/").get();
        Elements elements = doc.select("img[src~=(?i)\\.(png|gif|jpe?g)]");
        parsingProgram.downloadFile(elements);
    }
}
