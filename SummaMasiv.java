package arraywork;

public class SummaMasiv {

    public static void main(String[] args) {

        int[] array1 = {5, 5, 5};
        int[] array2 = {3, 3, 3};
        int[] array3 = {1, 1, 1};
        int[] a = summa(array1, array2, array3);

        for (int x : a) {
            System.out.print(String.format("%3d", x));
        }
    }

     public static int[] summa(int[]... arrays) {
        int s = 0;
        int d = 0;
        
        for (int[] a : arrays) {
            s = s + a.length;
        }
        int[] res = new int[s];
        
        for (int i = 0; i < arrays.length; i++) {
            if (i > 0) {
                d = d + arrays[i - 1].length;
            }
            int length = arrays[i].length;
            System.arraycopy(arrays[i], 0, res, d, length);
        }
        return res;      
    }
}
