package arraywork;

public class Search {

    public static void main(String[] args) {
        int[] array = new int[]{213, 12412, 14423, 22, 32};

    }

    public static int searchLinear(int[] array, int elementToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind) {
                return i;
            }
        }
        return -1;
    }

    public static int searchBinary(int[] array, int startIndex, int endIndex, int elementToFind) {
        // массив уже должен быть отсортирован по-возрастанию
        if (endIndex >= startIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == elementToFind) {
                return middleIndex;
            }

            if (array[middleIndex] > elementToFind) {
                return searchBinary(array, startIndex, middleIndex - 1, elementToFind);
            } else {
                return searchBinary(array, startIndex, middleIndex + 1, elementToFind);
            }
        }
        return -1;
    }

    public static int searchBinarySecond(int[] array, int elementToFind) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
// массив уже должен быть отсортирован по-возрастанию
        while (startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == elementToFind) {
                return middleIndex;
            }
            if (array[middleIndex] > elementToFind) {
                endIndex = middleIndex - 1;
            } else {
                endIndex = middleIndex + 1;
            }
        }

        return -1;
    }
}
