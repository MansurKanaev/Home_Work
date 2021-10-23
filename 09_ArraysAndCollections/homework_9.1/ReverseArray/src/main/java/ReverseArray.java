public class ReverseArray {

    //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
    public static String[] reverse(String[] strings) {

        int symbols = strings.length;
        String endSigns;

        for (int i = 0; i < symbols / 2; i++) {
            endSigns = strings[symbols - i - 1]; // берем  значения с конца
            strings[symbols - i - 1] = strings[i]; // берем значения с начала
            strings[i] = endSigns; // меняем  начальные значения на конечные
        }

        for (String string : strings) {
            System.out.println(string); // формируем обратный вывод символов из массива string[n]
        }
        return strings;
    }
}

