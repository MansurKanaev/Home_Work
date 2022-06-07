import java.util.*;

public class CoolNumbers {
    public static ArrayList<String> list = new ArrayList<>();

    public static List<String> generateCoolNumbers() {
        // буквы
        ArrayList<String> letters = new ArrayList<>();
        // номера
        ArrayList<String> numbers = new ArrayList<>();
        // регион
        ArrayList<String> regions = new ArrayList<>();
        // конечный формат номера
        ArrayList<String> carNumber = new ArrayList<>();
        letters.add("A");
        letters.add("В");
        letters.add("E");
        letters.add("К");
        letters.add("M");
        letters.add("Н");
        letters.add("О");
        letters.add("Р");
        letters.add("С");
        letters.add("Т");
        letters.add("У");
        letters.add("Х");

        int l = 12;
        int n = 10;
        int r = 95;

        for (int i = 0; i <= 999; i += 111) {
            if (i == 0) {
                numbers.add(i + "" + i + "" + i);
                continue;
            }
            numbers.add(String.valueOf(i));
        }
        for (int i = 1; i <= 95; i++) {
            if (i < 10) {
                regions.add("0" + i);
                continue;
            }
            regions.add(String.valueOf(i));
        }
        for (int f = 1; f <= 2_000_001; f++) {
            int randomL = (int) (Math.random() * l);
            int randomN = (int) (Math.random() * n);
            int randomR = (int) (Math.random() * r);
            carNumber.add(letters.get(randomL) + numbers.get(randomN) +
                    letters.get(randomL) + letters.get(randomL) + regions.get(randomR));
        }
        return carNumber;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        long time1 = System.nanoTime();
        if (list.contains(number)) {
            long time2 = System.nanoTime();
            System.out.println("Поиск перебором: номер найден за " + (time2 - time1) + " нс");
            return true;
        }
        long time2 = System.nanoTime();
        System.out.println("Поиск перебором: номер найден за " + (time2 - time1) + " нс");
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        Collections.sort(sortedList);
        long time1 = System.nanoTime();
        if (Collections.binarySearch(sortedList, number) >= 0) {
            long time2 = System.nanoTime();
            System.out.println("Бинарный поиск: номер найден за " + (time2 - time1) + " нс");
            return true;
        }
        long time2 = System.nanoTime();
        System.out.println("Бинарный поиск: номер не найден за " + (time2 - time1) + " нс");
        return false;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        long time1 = System.nanoTime();
        if (hashSet.contains(number)) {
            long time2 = System.nanoTime();
            System.out.println("Поиск в HashSet: номер найден за " + (time2 - time1) + " нс");
            return true;
        }
        long time2 = System.nanoTime();
        System.out.println("Поиск в HashSet: номер не найден за " + (time2 - time1) + " нс");
        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        long time1 = System.nanoTime();
        if (treeSet.contains(number)) {
            long time2 = System.nanoTime();
            System.out.println("Поиск в TreeSet: номер найден за " + (time2 - time1) + " нс");
            return true;
        }
        long time2 = System.nanoTime();
        System.out.println("Поиск в TreeSet: номер не найден за " + (time2 - time1) + " нс");
        return false;
    }
}
