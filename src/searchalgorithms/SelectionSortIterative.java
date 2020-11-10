package searchalgorithms;


public class SelectionSortIterative {
    public static int[] selectionSort(int[] array) {
        //Write your code here.
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[lowestIndex]) {
                    lowestIndex = j;
                    found = true;
                }
                if (j == array.length - 1 && found == true) {
                    int tmp = array[i];
                    array[i] = array[lowestIndex];
                    array[lowestIndex] = tmp;
                    found = false;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{8, 5, 2, 9, 5, 6, 3};

        for (int i : SelectionSortIterative.selectionSort(array)) {
            System.out.printf("%d ", i);
        }
    }
}
