package education.homework.task3structures.arrays.oneDim;

import java.util.Arrays;
import java.util.Random;

import static education.homework.task3structures.nestedloops.LoopsMain.nextLine;

public class Methods {
    private static Random rand = new Random();

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] initRandArray(int size, int from, int to) {
        if (size <= 0) {
            return new int[0];
        }

        if (from > to) {
            int t= from;
            from = to;
            to = t;
        }

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = from + rand.nextInt(Math.abs(to) + (from > 0 ? -Math.abs(from) : Math.abs(from)) + 1);
        }
        return array;
    }



    public static int[] columnFromArray(int numOfColumn, int[][] arrNumbAndCount) {
        int[] temp = new int[arrNumbAndCount.length];
        for (int i = 0; i < arrNumbAndCount.length; i++) {
            temp[i] = arrNumbAndCount[i][numOfColumn];
        }
        return temp;
    }

    public static void equalsRepeating(int[][] firstArray, int[][] secondArray) {
        int index = 0;
        int k = 0;
        int tempAmount = 0; //количество повторений (д.б. > 1)
        int tempTimes = 0; //количество повторений в первом массиве
        int[] tempArrayToOut = new int[firstArray.length]; //хранится повторяющиеся числа

        while (index < secondArray.length && secondArray[index][1] != 0) {
            if (secondArray[index][1] > 1) {
                while (k < firstArray.length) {
                    if (secondArray[index][0] == firstArray[k][1]) {
                        tempArrayToOut[tempAmount] = firstArray[k][0];
                        tempTimes = firstArray[k][1];
                        tempAmount++;
                    }
                    k++;
                }
                if (tempAmount > 1) {
                    printEqualsRepeating(tempTimes, tempArrayToOut, tempAmount);
                }//вывод_Одинаковых_Повторений_Чисел(количество раз, числа которые встречаются)
                if (tempAmount != 0) {
                    clearArray(tempArrayToOut, tempAmount);
                    tempAmount = 0;
                    tempTimes = 0;
                }
            }
            index++;
            k = 0;
        }
    }

    public static void clearArray(int[] tempArrayToOut, int tempAmount) {
        for (int i = 0; i < tempAmount; i++) {
            tempArrayToOut[i] = 0;
        }
    }

    public static void printEqualsRepeating(int time, int[] tempArrayToOut, int tempAmount) {
        System.out.print("По " + time + " раз(а) встречаются элементы --> ");
        for (int i = 0; i < tempAmount; i++) {
            System.out.print(tempArrayToOut[i] + " ");
        }
        nextLine();
    }

    public static void maxRepeating(int[][] arrNumbAndCount) {
        int indexOfMax = 0;
        for (int i = 1; i < arrNumbAndCount.length; i++) {
            if (arrNumbAndCount[i][1] >= arrNumbAndCount[indexOfMax][1]) {
                indexOfMax = i;
            }
        }
        System.out.println("Чаще всего встречается число " + '\"' + arrNumbAndCount[indexOfMax][0] + "\"" + " --> " + arrNumbAndCount[indexOfMax][1] + " раз(а)");
    }

    public static void showRepeating(int[][] arrNumbAndCount) {
        System.out.println("Встречающиеся числа в массиве: ");
        for (int[] anArrNumbAndCount : arrNumbAndCount) {
            if (anArrNumbAndCount[1] != 0) {
                System.out.println(anArrNumbAndCount[0] + " -> " + anArrNumbAndCount[1] + " раз(а)");
            }
        }
        nextLine();
    }

    public static int[][] searchOfRepeatingNumbers(int[] array, int amountOfNumbers) {

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
