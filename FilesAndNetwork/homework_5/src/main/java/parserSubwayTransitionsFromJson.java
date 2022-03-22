import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class parserSubwayTransitionsFromJson {
    private static final String TAG_NAME = "connections";

    public static void readingJson(String json) throws IOException {
        StringBuilder builder = new StringBuilder();
        List<String> lines = Files.readAllLines(Paths.get(json));
        lines.forEach(builder::append);
        JSONParser parser = new JSONParser();
        ArrayList<String> connectionsList = new ArrayList<>();

        try {
            JSONObject jsonFile = (JSONObject) parser.parse(builder.toString());
            JSONObject lineObject = (JSONObject) jsonFile.get(TAG_NAME);
            lineObject.keySet().forEach(line -> {
                JSONArray stations = (JSONArray) lineObject.get(line);
                stations.forEach(element -> {
                    String connection = (String) element;
                    connectionsList.add(connection);
                });
            });
            System.out.println("Всего переходов " + connectionsList.size());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
