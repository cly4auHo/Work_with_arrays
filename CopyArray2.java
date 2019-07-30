package arraywork;

public class CopyArray2 {

    public static void main(String[] args) {

        int[][] ar = {{1, 4, 5}, {0, 4, 6}, {5, 0, 8}};
        int[][] cp = new int[3][3];

        System.arraycopy(ar, 0, cp, 0, ar.length);

        for (int i = 0; i < 3; i++) {
            String str = " ";
            for (int j = 0; j < 3; j++) {
                str = str + ar[i][j] + " ";
            }
            System.out.println(str);
        }

        for (int i = 0; i < 3; i++) {
            String str = " ";
            for (int j = 0; j < 3; j++) {
                str = str + cp[i][j] + " ";
            }

            System.out.println(str);
        }
        ar[2][2] = 88;

        System.out.println(ar[2][2]);
        System.out.println(cp[2][2]);

        cp[2][2] = 99;

        System.out.println(ar[2][2]);
        System.out.println(cp[2][2]);

    }

}
