package education.homework.task3structures.sorting;

import java.util.Arrays;
import java.util.Random;

public class SortingMain {
    public static void main(String[] args) {
        int n = 100_000;
        int[] arr = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100_000);
        }

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, arr.length);

        long startTime1 = System.nanoTime();
        Arrays.sort(arr);
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("Arrays.sort(arr)   -> " + (estimatedTime1 / 1e+9) + " sec");

        long startTime2 = System.nanoTime();
        selectionSort(arr2);
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("selectionSort(arr) -> " + (estimatedTime2 / 1e+9) + " sec");

        long startTime3 = System.nanoTime();
        bubbleSort(arr3);
        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println("bubbleSort(arr)    -> " + (estimatedTime3 / 1e+9) + " sec");

        /*
        Out:
        Arrays.sort(arr)   -> 0.026453056 sec
        selectionSort(arr) -> 3.454667223 sec
        bubbleSort(arr)    -> 16.637687648 sec
         */

    }

    private static void selectionSort(int[] numbers) {
        int min, temp;

        for (int index = 0; index < numbers.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < numbers.length; scan++) {
                if (numbers[scan] < numbers[min])
                    min = scan;
            }

            // Swap the values
            temp = numbers[min];
            numbers[min] = numbers[index];
            numbers[index] = temp;
        }
    }

    private static void bubbleSort(int[] numbers) {
        int i = 0;
        int goodPairsCounter = 0;

        while (true) {
            if (numbers[i] > numbers[i + 1]) {
                int q = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = q;
                goodPairsCounter = 0;
            } else {
                goodPairsCounter++;
            }
            i++;
            if (i == numbers.length - 1) {
                i = 0;
            }
            if (goodPairsCounter == numbers.length - 1) {
                break;
            }
        }
    }
}
