package education.homework.task3structures.arrays.oneDim;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static education.homework.task3structures.arrays.oneDim.Methods.*;
import static education.homework.task3structures.arrays.oneDim.Methods.equalsRepeating;
import static education.homework.task3structures.arrays.oneDim.Methods.maxRepeating;
import static education.homework.task3structures.nestedloops.LoopsMain.nextLine;

public class Tasks4 {
    private static Random rand = new Random();

    public static void taskA(int size, int from, int to) {
        System.out.println("\t\tTask \"a\"");
        int[] arr = new int[size];
        int temp;

        for (int i = 0; i < size; i++) {
            temp = from + rand.nextInt(to - 1);
            arr[i] = (temp % 2 != 0) ? temp : temp + 1;
        }

        System.out.println("Current array:");
        printArray(arr);

        Arrays.sort(arr);
        System.out.println("Sorted array:");
        printArray(arr);

        Integer[] arrInt = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arrInt, Collections.reverseOrder());
        System.out.println("Reverse sorted:");
        System.out.println(Arrays.toString(arrInt));
        nextLine();
    }

    public static void taskB(int size, int from, int to) {
        System.out.println("\t\tTask \"b\"");

        int[] array = initRandArray(size, from, to);
        printArray(array);

        int amountEvenNumber = 0;
        int amountOddNumber = 0;
        int amountOfZero = 0;

        for (int number : array) {
            if (number != 0) {
                if (number % 2 == 0) {
                    amountEvenNumber++;
                } else {
                    amountOddNumber++;
                }
            } else {
                amountOfZero++;
            }
        }

        System.out.println("Количество нулей          -> " + amountOfZero);
        System.out.println("Количество чётных чисел   -> " + amountEvenNumber);
        System.out.println("Количество нечётных чисел -> " + amountOddNumber);
        nextLine();
    }

    public static void taskC(int size, int from, int to) {
        System.out.println("\t\tTask \"c\"");

        int[] array = initRandArray(size, from, to);
        printArray(array);
        System.out.print("Current array to string: ");
        for (int number : array) {
            System.out.print(String.valueOf(number) + ' ');
        }
        nextLine();

        for (int index = 1; index < size; index += 2) {
            array[index] = 0;
        }

        System.out.print("Changed array to string: ");
        for (int number : array) {
            System.out.print(String.valueOf(number) + ' ');
        }
        nextLine();
        nextLine();
    }

    public static void taskD(int size, int from, int to) {
        System.out.println("\t\tTask \"d\"");

        int[] array = initRandArray(size, from, to);
        printArray(array);

        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[indexOfMax]) {
                indexOfMax = i;
            } else if (array[i] <= array[indexOfMin]) {
                indexOfMin = i;
            }
        }

        System.out.println("Minimum of this array --> " + array[indexOfMin]);
        System.out.println("Last index of minimum --> " + indexOfMin);
        System.out.println("Maximum of this array --> " + array[indexOfMax]);
        System.out.println("Last index of maximum --> " + indexOfMax);
        nextLine();
//        System.out.println(indexOfMax + " " + indexOfMin);

    }

    public static void taskE(int size, int from, int to) {
        System.out.println("\t\tTask \"e\"");

        int[] array1 = initRandArray(size, from, to);
        int[] array2 = initRandArray(size, from, to);
        printArray(array1);
        printArray(array2);

        double avarage1 = 0.;
        double avarage2 = 0.;

        for (int index = 0; index < size; index++) {
            avarage1 += array1[index];
            avarage2 += array2[index];
        }

        avarage1 /= size;
        avarage2 /= size;

        System.out.println("Avarage1 --> " + avarage1);
        System.out.println("Avarage2 --> " + avarage2);

        if (avarage1 == avarage2) {
            System.out.println("Среднее арифметичские двух массивов равны (" + avarage1 + ')');
        } else {
            System.out.println("Среднее арифметическое " + (avarage1 > avarage2 ? "первого" : "второго") + " массива "
                    + "больше, чем " + (avarage1 < avarage2 ? "первого" : "второго."));
        }


        nextLine();
    }

    public static void taskF(int size, int from, int to) {
        System.out.println("\t\tTask \"f\"");

        int[] array = initRandArray(size, from, to);
        printArray(array);

        /*
        //-----------------------------------simple counting-----------------------------------
        int amountNegative = 0; //-1
        int amountPositive = 0; // 1
        int amountZero = 0; // 0

        for (int index = 0; index < size; index++) {
            switch (array[index]) {
                case -1: {
                    amountNegative++;
                    break;
                }
                case 0: {
                    amountZero++;
                    break;
                }
                case 1: {
                    amountPositive++;
                    break;
                }
            }
        }

        System.out.println("Amount of -1 --> " + amountNegative);
        System.out.println("Amount of  0 --> " + amountZero);
        System.out.println("Amount of  1 --> " + amountPositive);
*/

        //------------------------------------another way (универсальный)--------------------------------------
        // Сортируем
        //два массива: число[], количество[] (можно и через двумерный сделать), первый элемент массива "число" соответсвует первому элементу массива "количество"
        //идем по текущему массиву, считаем одинаковые числа, встречается другое число -> у массива число[] индекс++

        int amountOfNumbers = Math.abs(to) + (from > 0 ? -Math.abs(from) : Math.abs(from)) + 1;
        int[][] arrNumbAndCount = searchOfRepeatingNumbers(array, amountOfNumbers);
        int[][] arrNumbAndCount2; //для анализа первого массива и построения выводов

        showRepeating(arrNumbAndCount);

        int[] tempArray = columnFromArray(0, arrNumbAndCount);
        printArray(tempArray);

        arrNumbAndCount2 = searchOfRepeatingNumbers(tempArray, amountOfNumbers);
        showRepeating(arrNumbAndCount2);

        maxRepeating(arrNumbAndCount);
        equalsRepeating(arrNumbAndCount, arrNumbAndCount2);

        nextLine();
    }



}
