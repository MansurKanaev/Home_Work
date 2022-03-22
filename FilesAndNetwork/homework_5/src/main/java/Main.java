
public class Main {

    public static void main(String[] args) throws Exception {
        ParserMetroMoscow parser = new ParserMetroMoscow("https://skillbox-java.github.io/");
        parser.parsingSiteInJsonFormat();
        parser.writeJson("src/main/resources/metro.json");
        parserSubwayTransitionsFromJson.readingJson("src/main/resources/metro.json");

    }
}
