import java.util.Arrays;

public class Sort {
    /**
     * To perform insertion sort on an integer array in ascending order.
     * An insertion sort starts from the second element. Each element serves as a key. The key will then be compared
     * with all values on its left side.
     *
     * The best case is O(n)
     * The worst case is O(n^2)
     * On average, the algorithm is O(n^2)
     * In the best case, the algorithm needs memory of O(1)
     *
     * @param inputArray the input integer array
     * @return a sorted (ascending) integer array
     */
    public static int[] insertionSort(int[] inputArray) {
        System.out.println(Arrays.toString(inputArray));
        int key;
        int temp;
        for (int i = 1; i < inputArray.length; i++) {
            key = inputArray[i];
            for (int j = i - 1; j >= 0; j--) {
                if (key < inputArray[j]) {
                    temp = inputArray[j];
                    inputArray[j] = key;
                    inputArray[j+1] = temp;
                    System.out.println(Arrays.toString(inputArray));
                }
            }
        }
        return inputArray;
    }

    /**
     * To perform bubble sort on an integer array in ascending order.
     * A bubble sort swaps all possible adjacent elements in one pass, if the latter one is smaller.
     * AFTER ONE PASS, the last element swapped is sorted and needless to be checked again.
     *
     * A bubble sort has TWO for loops:
     * The first one is used to control the length of the second loop
     * (BECAUSE THE SECOND LOOP WILL BE ONE ELEMENT SHORTER AFTER EACH PASS)
     * The second one is used to navigate and swap
     *
     * The best case is O(n)
     * The worst case is O(n^2)
     * On average, the algorithm is O(n^2)
     * In the best case, the algorithm needs memory of O(1)
     *
     * @param inputArray the input integer array
     * @return a sorted (ascending) integer array
     */
    public static int[] bubbleSort(int[] inputArray) {
        System.out.println(Arrays.toString(inputArray));
        boolean isSwaped = false;
        int temp;
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < inputArray.length - 1 - i; j++) {
                if (inputArray[j] > inputArray[j+1]) {
                    isSwaped = true;
                    temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                    System.out.println(Arrays.toString(inputArray));
                }
            }
            if (isSwaped == false) {
                break;
            }
        }
        return inputArray;
    }





    public static void main(String[] args) {
        int[] normTestArray = new int[] { 8, 5, 7, 3, 4, 11, 6, -1, 9, 10, 20, 21 };
        int[] sortedTestArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int[] revTestArray = new int[] { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };


/*        int[] resultInsertionSort = Sort.insertionSort(revTestArray);
        System.out.println(Arrays.toString(resultInsertionSort));*/


        int[] resultBubbleSort = Sort.bubbleSort(revTestArray);
        System.out.println(Arrays.toString(resultBubbleSort));
    }
}
