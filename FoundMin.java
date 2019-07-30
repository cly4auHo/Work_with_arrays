package arraywork;

public class FoundMin {

    public static void main(String[] args) {
        int[] array = {123, 11, 9, 7, 0, 123, 44};
        int minValues = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValues) {
                minValues = array[i];
                minIndex = i;
            }
        }
        System.out.println(minValues);
        System.out.println(minIndex);
    }
}
