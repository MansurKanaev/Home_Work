public class Main {

  public static void main(String[] args) {

  }
  public static String splitTextIntoWords(String text) {
    String fullText = text.replaceAll("[0-9.,-:;]", " ");
    StringBuilder result = new StringBuilder();
    String[] words = fullText.split("\\s+");
    if(fullText.isEmpty()){
      return "";
    }
    for (String word : words) {
      result.append(word).append(System.lineSeparator());
    }
    System.out.println(result.toString().trim());
    return result.toString().trim();
  }
}