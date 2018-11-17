package education.homework.task3structures.arrays.oneDim;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static education.homework.task3structures.nestedloops.LoopsMain.nextLine;

public class Main {
    private static Random rand = new Random();

    public static void main(String[] args) {
//        taskA(100, 1, 99);
//        taskB(20, 0, 10);
//        taskC(10, 1, 100);
//        taskD(15, -50, 50);
//        taskE(10, 0, 10);
        taskF(20, -1, 1);

    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static int[] initRandArray(int size, int from, int to) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = from + rand.nextInt(Math.abs(to) + (from > 0 ? -Math.abs(from) : Math.abs(from)) + 1);
        }
        return array;
    }

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
//    public int[] arrayRevert(int[] array) {
//
//    }

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

        //------------------------------------another way--------------------------------------
        //Сортируем
        //два массива: число[], количество[] (можно и через двумерный сделать), первый элемент массива "число" соответсвует первому элементу массива "количество"
        //идем по текущему массиву, считаем одинаковые числа, встречается другое число -> у массива число[] индекс++

        int amountOfNumbers = Math.abs(to) + (from > 0 ? -Math.abs(from) : Math.abs(from)) + 1;
        int[][] arrNumbAndCount = searchOfRepeatingNumbers(array, amountOfNumbers);
        int[][] arrNumbAndCount2;

        showRepeating(arrNumbAndCount);
        int[] tempArray = new int[arrNumbAndCount.length];

        for (int i = 0; i < arrNumbAndCount.length; i++) {
            tempArray[i] = arrNumbAndCount[i][1];
        }

        printArray(tempArray);
        arrNumbAndCount2 = searchOfRepeatingNumbers(tempArray, amountOfNumbers);
        showRepeating(arrNumbAndCount2);

        maxRepeating(arrNumbAndCount);
//        equalsRepeating(arrNumbAndCount, arrNumbAndCount2);

//        for (int i = 0; i < arrNumbAndCount2.length; i++) {
//            if (arrNumbAndCount2[i][1] > 0) {
//                System.out.println("Элемент \'" + array[arrNumbAndCount[arrNumbAndCount2[i][1]][1]] + "\' и элемент \'" +
//                        findElement(arrNumbAndCount, array[arrNumbAndCount[arrNumbAndCount2[i][1]][1]], ) + "\' встречаются в " +
//                        "исходном массиве " + arrNumbAndCount2[i][2] + "раз(а)");
//            }
//        }

        nextLine();
    }

    private static void maxRepeating(int[][] arrNumbAndCount) {
        int indexOfMax = 0;
        for (int i = 1; i < arrNumbAndCount.length; i++) {
            if (arrNumbAndCount[i][1] >= arrNumbAndCount[indexOfMax][1]) {
                indexOfMax = i;
            }
        }
        System.out.println("Чаще всего встречается число " + '\"' + arrNumbAndCount[indexOfMax][0] + "\"" + " --> " + arrNumbAndCount[indexOfMax][1] + " раз");
    }

    private static String findElement(int[] mass, int number, int from) {

        return null;
    }

    private static void showRepeating(int[][] arrNumbAndCount) {
        System.out.println("Встречающиеся чсила в массиве: ");
        for (int[] anArrNumbAndCount : arrNumbAndCount) {
            System.out.println(anArrNumbAndCount[0] + " -> " + anArrNumbAndCount[1]);
        }
        nextLine();
    }

    private static int[][] searchOfRepeatingNumbers(int[] array, int amountOfNumbers) {

        Arrays.sort(array);

        int[][] arrNumbAndCount = new int[amountOfNumbers][2];
        arrNumbAndCount[0][0] = array[0];
        arrNumbAndCount[0][1] = 1;
        for (int arrIndex = 1, numbersIndex = 0; arrIndex < array.length; arrIndex++) {
            if (array[arrIndex] == arrNumbAndCount[numbersIndex][0]) {
                arrNumbAndCount[numbersIndex][1]++;
            } else {
                numbersIndex++;
                arrNumbAndCount[numbersIndex][0] = array[arrIndex];
                arrNumbAndCount[numbersIndex][1]++;
            }
        }
        return arrNumbAndCount;

        /*
         * Получает на вход массив чисел
         * Возвращает массив[число][кол-во повторений]
         *
         * Например:
         * массив{
         *     {5, 4} - число 5 встречается 4 раза
         *     {2, 3} - число 2 встречается 3 раза
         *     {0, 1} - число 0 встречается 1 раз
         *     {0, 0} - число 0 встречается 0 раз - значит с этого момента чисел больше нет
         * }
         */
    }
}


//        int[] arrDifferentNumbs = new int[amountOfNumbers];
//        int[] amountOfEveryNumb = new int[amountOfNumbers];
//
//        Arrays.sort(array);
//
//        arrDifferentNumbs[0] = array[0];
//        amountOfEveryNumb[0] = 1;
//        for (int arrIndex = 1, numbersIndex = 0; arrIndex < size; arrIndex++) {
//            if (array[arrIndex] == arrDifferentNumbs[numbersIndex]) {
//                amountOfEveryNumb[numbersIndex]++;
//            } else {
//                numbersIndex++;
//                arrDifferentNumbs[numbersIndex] = array[arrIndex];
//                amountOfEveryNumb[numbersIndex]++;
//            }
//        }
//        System.out.print("Встречающиеся чсила в массиве: ");
//        printArray(arrDifferentNumbs);
//        System.out.print("Количество встреч таких чисел: ");
//        printArray(amountOfEveryNumb);

