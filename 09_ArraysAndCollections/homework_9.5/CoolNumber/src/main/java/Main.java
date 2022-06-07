import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<String> list = CoolNumbers.generateCoolNumbers();
        HashSet<String> list1 = new HashSet<>(list);
        TreeSet<String> list2 = new TreeSet<>(list);
        CoolNumbers.bruteForceSearchInList(list, "Н444НН44");
        CoolNumbers.binarySearchInList(list, "Н444НН44");
        CoolNumbers.searchInHashSet(list1, "Н444НН44");
        CoolNumbers.searchInTreeSet(list2, "Н444НН44");
        System.out.println("Всего красивых номеров: " + list.size());
    }
}
