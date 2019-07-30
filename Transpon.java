package arraywork;

public class Transpon {

    public static void main(String[] args) {

        double[][] array = {{1.1, 1.2, 1.3},
        {2.1, 2.2, 2.3},
        {3.1, 3.2, 3.3}};
        double[][] res = new double[array.length][array.length];

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                res[array.length - 1 - i][j] = array[j][i];
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
