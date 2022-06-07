public class TwoDimensionalArray {
    public static char symbol = 'X';
    public static char empty = ' ';

    public static char[][] getTwoDimensionalArray(int size) {
        char[][] array = new char[size][size];
        // первая проверка по symbol
        for (int i = 0; i < size; i++) {
            array[i][i] = symbol;
            array[i][size - 1 - i] = symbol;
        }
        // вторая проверка по empty
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!(array[i][j] == symbol)) {
                    array[i][j] = empty;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return array;
    }
}

