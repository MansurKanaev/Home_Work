import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<String> list = CoolNumbers.generateCoolNumbers();
        HashSet<String> list1 = new HashSet<>(list);
        TreeSet<String> list2 = new TreeSet<>(list);
        CoolNumbers.bruteForceSearchInList(list, "К999МР95");
        CoolNumbers.binarySearchInList(list, "К999МР95");
        CoolNumbers.searchInHashSet(list1, "К999МР95");
        CoolNumbers.searchInTreeSet(list2, "К999МР95");
        System.out.println("Всего красивых номеров: " + list.size());
    }
}
