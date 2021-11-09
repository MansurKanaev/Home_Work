import java.util.*;

public class CoolNumbers {
    public static ArrayList<String> list = new ArrayList<>();

    public static List<String> generateCoolNumbers() {
        ArrayList<String> coolNumbersListWithoutRegion = new ArrayList<>();
        String numberplate;
        String numberplateWithoutRegion;

        char x; // первая буква
        char z; // вторая буква
        char y; // третья буква

        ArrayList<Character> allowedLetters = new ArrayList<>() {{
            add('А');
            add('В');
            add('Е');
            add('К');
            add('М');
            add('Н');
            add('О');
            add('Р');
            add('С');
            add('Т');
            add('У');
            add('Х');
        }};

        Collections.shuffle(allowedLetters, new Random());

        for (Character firstLetter : allowedLetters) {
            x = firstLetter;
            for (int n = 0; n < 10; n++) {
                for (Character secondLetter : allowedLetters) {
                    z = secondLetter;
                    for (Character thirdLetter : allowedLetters) {
                        y = thirdLetter;
                        numberplateWithoutRegion = String.format("%c%d%d%d%c%c", x, n, n, n, z, y);
                        coolNumbersListWithoutRegion.add(numberplateWithoutRegion);
                    }
                }
            }
        }

        Collections.shuffle(coolNumbersListWithoutRegion, new Random());

        for (String numberWithoutRegion : coolNumbersListWithoutRegion) {
            for (int j = 1; j <= 199; j++) {

                if (j < 10) {
                    numberplate = String.format("%s0%d", numberWithoutRegion, j);

                } else {
                    numberplate = String.format("%s%d", numberWithoutRegion, j);
                }
                list.add(numberplate);
            }
            if (list.size() >= 2_000_000) {
                break;
            }
        }

        Collections.shuffle(list, new Random());
        return list;
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
