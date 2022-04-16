import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;


public class Main {

    private static String connections;
    private static String stationNumber;
    private static String stationName;
    private static String lineNumber;
    private static String lineName;

    public static void main(String[] args) throws Exception {

        Document doc = Jsoup.connect("https://skillbox-java.github.io/").maxBodySize(0).get();
        Elements line = doc.select("span.js-metro-line");
        Elements station = doc.select("div.js-metro-stations").select("span");
        Elements conection = doc.select("div.js-metro-stations").select("span");


        // получает номер линии и имя
        line.forEach(element1 -> {
            lineNumber = element1.attributes().get("data-line");
            lineName = element1.text();
//            System.out.println(lineNumber + "." + lineName);
        });

        station.forEach(element2 -> {
            // получает номер станции
            if (element2.attributes().get("class").equals("num") && !element2.attributes().get("class").isEmpty()) {
                stationNumber = element2.text();
            }
            // получает имя станции
            if (element2.attributes().get("class").equals("name")) {
                stationName = element2.text();
            }
            System.out.println(stationNumber + stationName);
        });

        conection.forEach(element3 -> {
            // получает переходы станций
            if (!(element3.attr("title").isEmpty())) {
                connections = element3.attr("title");

            }
        });


//        String jsonFile = "src/main/resources/metro.json";
//        ParserMetro parser = new ParserMetro("https://skillbox-java.github.io/");
//        parser.parserMetroJsoup();
//        parser.writeJson(jsonFile);
//        parserJSON.readingJson(jsonFile);

    }
}
