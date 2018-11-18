package education.homework.task3structures.arrays.multDim;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Methods {
    private static Random rand = new Random();

    static int[][] initRandArray(int row, int col, int from, int to) {
        if (row <= 0 || col <= 0) {
            return new int[0][0];
        }

        if (from > to) {
            int t = from;
            from = to;
            to = t;
        }

        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = from + rand.nextInt(Math.abs(to) + (from > 0 ? -Math.abs(from) : Math.abs(from)) + 1);
            }
        }
        return array;
    }

    static void printArray(int[][] arr) {
        printArray(intToInteger(arr));
    }

    static Integer[][] intToInteger(int[][] arr) {
        Integer[][] integers = new Integer[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                integers[i][j] = arr[i][j];
            }
        }
        return integers;
    }

    static void printArray(Integer[][] arr) {
        StringBuilder result = new StringBuilder();
        String separator = " ";

        for (Integer[] anArr : arr) {
            for (int j = 0; j < anArr.length; ++j) {
                if (anArr[j] < 10 && anArr[j] > -10) {
                    result.append(separator);
                }
                if (anArr[j] >= 0) {
                    result.append(separator);
                }
                if (j == anArr.length - 1) {
                    result.append(anArr[j]);
                } else {
                    result.append(anArr[j]).append(separator);
                }
            }
            result.append('\n');
        }
        System.out.println(result.toString());
    }


    static BigInteger[] sumAndMultOfMainDiag(int[][] arr) {
        int row = arr.length;
        BigInteger[] result = new BigInteger[2];

        result[0] = BigInteger.valueOf(arr[0][0]);
        result[1] = BigInteger.valueOf(arr[0][0]);

        for (int i = 1, j = 1; i < row; i++, j++) {
            result[0] = result[0].add(BigInteger.valueOf(arr[i][j]));
            result[1] = result[1].multiply(BigInteger.valueOf(arr[i][j]));
        }
        return result;
    }

    static BigInteger[] sumAndMultOfSecondDiag(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        BigInteger[] result = new BigInteger[2];

        result[0] = BigInteger.valueOf(arr[row - 1][col - 1]);
        result[1] = BigInteger.valueOf(arr[0][0]);

        for (int i = row - 2, j = col - 2; i > 0; --i, --j) {
            result[0] = result[0].add(BigInteger.valueOf(arr[i][j]));
            result[1] = result[1].multiply(BigInteger.valueOf(arr[i][j]));
        }
        return result;
    }

    static void fillArray(int[][] array, int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = number;
            }
        }
    }

    static void fillArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
    }

    static Integer[] reversSortArray(int[] ints) {
        Integer[] arrInt = Arrays.stream(ints).boxed().toArray(Integer[]::new);
        Arrays.sort(arrInt, Collections.reverseOrder());
        return arrInt;
    }

    static Integer[] reversSortArray(Integer[] ints) {
        Arrays.sort(ints, Collections.reverseOrder());
        return ints;
    }
}

