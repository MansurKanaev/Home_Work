public class Main {

    public static void main(String[] args) {

        String text = "Вася заработал  5000 рублей, Петя  7563 рубля, а Маша - 30000 рублей";
        //TODO: напишите ваш код, результат вывести в консоль

        System.out.println(getWage(text));
    }

    public static String getWage(String text) {
        String vasyStart = "Вася заработал";
        String petyStart = "Петя";
        String mashaStart = "Маша -";
        String end = "руб";

        int newVasyStart = text.indexOf(vasyStart) + vasyStart.length();
        int newPetyStart = text.indexOf(petyStart) + petyStart.length();
        int newMashaStart = text.indexOf(mashaStart) + mashaStart.length();

        int endVasy = text.indexOf(end, newVasyStart);
        int endPety = text.indexOf(end, newPetyStart);
        int endMasha = text.indexOf(end, newMashaStart);

        int sumVasy = Integer.parseInt(text.substring(newVasyStart, endVasy).trim());
        int sumPety = Integer.parseInt(text.substring(newPetyStart, endPety).trim());
        int sumMasha = Integer.parseInt(text.substring(newMashaStart, endMasha).trim());

        return String.valueOf(sumVasy + sumPety + sumMasha);
    }
}