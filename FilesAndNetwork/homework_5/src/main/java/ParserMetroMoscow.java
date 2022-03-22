import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.PrintWriter;

public class ParserMetroMoscow {
    private final Elements lineMetro;
    private final Elements stationsMetro;
    private final Elements connections;
    private StringBuilder textForWrite;

    public ParserMetroMoscow(String webAddress) throws IOException {
        Document doc = Jsoup.connect(webAddress).maxBodySize(0).get();
        this.lineMetro = doc.select("span.js-metro-line");
        this.stationsMetro = doc.select("div.js-metro-stations");
        this.connections = doc.select("div.js-metro-stations");
    }

    public void parsingSiteInJsonFormat() {

        textForWrite = new StringBuilder();
        textForWrite.append("{").append(System.lineSeparator()).append("\t\"stations\": {")
                .append(System.lineSeparator());
        lineMetro.forEach(element1 -> {
            textForWrite.append("\t\t\"").append(element1.attributes().get("data-line"))
                    .append(". ").append(element1.text()).append("\": [").append(System.lineSeparator());
            stationsMetro.forEach(element2 -> {
                if (element2.attributes().get("data-line").equals(element1.attributes().get("data-line"))) {
                    element2.select("span").forEach(element3 -> {
                        if (element3.attributes().get("class").equals("num")) {
                            textForWrite.append("\t\t\t\"").append(element3.text()).append(" ");
                        }
                        if (element3.attributes().get("class").equals("name")) {
                            textForWrite.append(element3.text()).append("\"").append(",")
                                    .append(System.lineSeparator());
                        }
                    });
                    textForWrite.setLength(textForWrite.length() - 3);
                    textForWrite.append(System.lineSeparator()).append("\t\t],").append(System.lineSeparator());
                }
            });

        });
        textForWrite.setLength(textForWrite.length() - 3);
        textForWrite.append(System.lineSeparator()).append("},").append(System.lineSeparator())
                .append("\t\"connections\": {").append(System.lineSeparator());
        lineMetro.forEach(element1 -> {
            textForWrite.append("\t\t\"").append(element1.attributes().get("data-line"))
                    .append(". ").append(element1.text()).append("\": [").append(System.lineSeparator());
            connections.forEach(element -> {
                if (element.attributes().get("data-line").equals(element1.attributes().get("data-line"))) {
                    element.select("span").forEach(element4 -> {
                        if (!(element4.attr("title").isEmpty())) {
                            textForWrite.append("\t\t\t\"").append(element4.attr("title"))
                                    .append("\",").append(System.lineSeparator());
                        }
                    });
                    textForWrite.setLength(textForWrite.length() - 3);
                    textForWrite.append(System.lineSeparator()).append("\t\t],").append(System.lineSeparator());
                }
            });
        });
        textForWrite.setLength(textForWrite.length() - 3);
        textForWrite.append(System.lineSeparator()).append("\t}").append(System.lineSeparator()).append("}");
        System.out.println("Сайт пропарсен!");
    }

    public void writeJson(String name) {
        try {
            PrintWriter writer = new PrintWriter(name);
            for (int i = 0; i < textForWrite.length(); i++) {
                char sumChar = textForWrite.charAt(i);
                writer.write(sumChar);
            }
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Текст сохранен в JSON файл!");
    }
}