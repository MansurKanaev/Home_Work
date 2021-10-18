public class Main {

  public static void main(String[] args) {

  }
  public static String splitTextIntoWords(String text) {
    String fullText = text.replaceAll("[0-9\\.,-:;]", " ");
    String result = "";
    String[] words = fullText.split("\\s+");
    if(fullText.isEmpty()){
      return "";
    }
    for(int i = 0; i < words.length; i++) {
     result += words[i] + System.lineSeparator();
    }
    return result.trim();
  }
}