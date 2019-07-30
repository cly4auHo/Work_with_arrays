package arraywork;

import java.util.Random;

public class CopyArray {

    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt(101);
        int[] ar = new int[5];
        int[] cp = new int[5];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(101);
        }

        System.arraycopy(ar, 0, cp, 0, ar.length);
        String str = "";

        for (int b : ar) {
            str += b + " ";
        }

        System.out.println(str);

        str = "";

        for (int b : cp) {
            str += b + " ";
        }
        System.out.println(str);
    }
}
