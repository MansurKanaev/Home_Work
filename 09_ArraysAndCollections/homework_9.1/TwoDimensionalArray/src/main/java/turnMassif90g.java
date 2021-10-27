public class turnMassif90g {
    // Доп задание
    public static int[][] getTernArray(int size) {
        int[][] twoArray = new int[size][size];
        int lineArray = twoArray.length * twoArray.length;

        //  было
        for (int x = 1; x <= lineArray; x++) {

            for (int i = 0; i < twoArray.length; i++) {
                for (int j = 0; j < twoArray[i].length; j++) {
                    twoArray[i][j] = x;
                    System.out.print(twoArray[i][j] + "\t");
                    x++;
                }
                System.out.println();
            }
            System.out.println();
        }

        //  стало
        int side = twoArray.length;
        int[][] result = new int[side][side];
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                result[i][j] = twoArray[side - j - 1][i];
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
        return twoArray;
    }
}
