
import core.Line;
import core.Station;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;

public class ParserMetro {

    private final Elements lineMetro;
    private final Elements stationsMetro;
    private String connections;
    private String stationNumber;
    private String stationName;
    private String lineNumber;
    private String lineName;

    private List<Line> lines = new LinkedList<>();
    private Map<String, List<String>> stations = new TreeMap<>();
    private List<Station> connection = new ArrayList<>();


    public ParserMetro(String webAddress) throws IOException {
        Document doc = Jsoup.connect(webAddress).maxBodySize(0).get();
        this.lineMetro = doc.select("span.js-metro-line");
        this.stationsMetro = doc.select("div.js-metro-stations");
    }

    public void parserMetroJsoup() {

        // получает номер линии и имя
        lineMetro.forEach(element1 -> {
            lineNumber = element1.attributes().get("data-line");
            lineName = element1.text();

            stationsMetro.forEach(element2 -> {
                if (element2.attributes().get("data-line").equals(element1.attributes().get("data-line"))) {
                    element2.select("span").forEach(element3 -> {
                        // получает номер станции
                        if (element3.attributes().get("class").equals("num")) {
                            stationNumber = element3.text();
                        }
                        // получает имя станции
                        if (element3.attributes().get("class").equals("name")) {
                            stationName = element3.text();
                            System.out.println(stationName);
                        }
                        // получает переходы станций
                        if (!(element3.attr("title").isEmpty())) {
                            connections = element3.attr("title");
                            String[] connection = connections.split("»");
                            String[] connection2 = connection[0].split("«");
//                            connectList.add(connection2[1]);
                        }
                    });
                }
            });
        });

//        Set<String> set = new LinkedHashSet<>(connect);
//        connect.clear();
//        connect.addAll(set);
//        for (String e : connect) {
//            System.out.println(e);
//        }
//        System.out.println(connect.size());

    }

    public void writeJson(String name) {

    }
//        try {
//            PrintWriter writer = new PrintWriter(name);
//            for (int i = 0; i < textForWrite.length(); i++) {
//                char sumChar = textForWrite.charAt(i);
//                writer.write(sumChar);
//            }
//            writer.flush();
//            writer.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Текст сохранен в JSON файл!");
//    }

}