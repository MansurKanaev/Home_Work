public class Main {
    public static void main(String[] args) {
        // вывод дз

        TwoDimensionalArray.getTwoDimensionalArray(3);
        System.out.println();

        // Доп задание

        int[][] twoArray = new int[3][3];

        twoArray[0][0] = 1;
        twoArray[0][1] = 2;
        twoArray[0][2] = 3;
        twoArray[1][0] = 4;
        twoArray[1][1] = 5;
        twoArray[1][2] = 6;
        twoArray[2][0] = 7;
        twoArray[2][1] = 8;
        twoArray[2][2] = 9;

        // обычный вывод было

        for (int[] ints : twoArray) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // вывод после стало

        int side = twoArray.length;
        int[][] result = new int[side][side];

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                result[i][j] = twoArray[side - j - 1][i];

                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

