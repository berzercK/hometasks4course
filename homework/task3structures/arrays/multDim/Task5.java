package education.homework.task3structures.arrays.multDim;

import static education.homework.task3structures.arrays.multDim.Methods.*;
import static education.homework.task3structures.arrays.oneDim.Methods.*;
import static education.homework.task3structures.nestedloops.LoopsMain.nextLine;
import static java.lang.Math.abs;

public class Task5 {

    public static void taskA(int row, int col, int from, int to) {
        System.out.println("\t\t\tTask \"a\"");
        int[][] arr = initRandArray(row, col, from, to);
        printArray(arr);

        System.out.println("Сумма главной диагонали --> " + sumAndMultOfMainDiag(arr)[0]);
        System.out.println("Сумма побочной диагонали --> " + sumAndMultOfSecondDiag(arr)[0]);
        System.out.println("Произведение главной диагонали --> " + sumAndMultOfMainDiag(arr)[1]);
        System.out.println("Произведение побочной диагонали --> " + sumAndMultOfSecondDiag(arr)[1]);
        nextLine();
    }

    static void taskB(int row, int col, int from, int to) {
        System.out.println("\t\tTask \"b\"");
        int[][] arr = initRandArray(row, col, from, to);

        int max = arr[0][0];
        int[][] iOfMax = new int[row * col][2];

        fillArray(iOfMax, -1);
        int q = 0;

        printArray(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    q = 0;
                    fillArray(iOfMax, -1);
                    max = arr[i][j];
                    iOfMax[q][0] = i;
                    iOfMax[q++][1] = j;
                } else if (max == arr[i][j]) {
                    iOfMax[q][0] = i;
                    iOfMax[q++][1] = j;
                }
            }
        }

        System.out.println("Maximum --> " + max);
        System.out.print("Indexes --> ");

        int i = 0;
        while (iOfMax[i][0] != -1) {
            System.out.print("[" + iOfMax[i][0] + " " + iOfMax[i++][1] + "] ");
        }

        nextLine();
        nextLine();

        /* int[] colOfMax = new int[arr.length]; //столбец из максимальных чисел для каждой строки
        int[][] indexColOfMax = new int[arr.length][2]; //столбец из максимальных чисел для каждой строки
        int[] indexOfMax = new int[2];
        for (int i = 0, j = 0; i < arr.length; i++, j = 0) {
            colOfMax[i] = arr[i][j];
            indexColOfMax[i][0] = i;
            indexColOfMax[i][1] = j++;
            for (; j < arr[i].length; j++) {
                if (arr[i][j] > colOfMax[i]) {
                    colOfMax[i] = arr[i][j];
                    indexColOfMax[i][0] = i;
                    indexColOfMax[i][1] = j;
                }
            }
        } //составляем Массив максимальных чисел каждой строки и запоминаем их индексы

        max = colOfMax[0];
        indexOfMax[0] = indexColOfMax[0][0];
        indexOfMax[1] = indexColOfMax[0][1];

        for (int i = 1; i < colOfMax.length; i++) {
            if (colOfMax[i] > max) {
                max = colOfMax[i];
                indexOfMax[0] = indexColOfMax[i][0];
                indexOfMax[1] = indexColOfMax[i][1];
            }
        } //ищем максимальный элемент в Массиве

        System.out.println("Maximum --> " + max);
        System.out.println("Indexes --> [" + indexOfMax[0] + ", " + indexOfMax[1] + "]"); */
    }

    static void taskC(int row, int col, int from, int to) {
        System.out.println("\t\tTask \"c\"");
        int[][] arr = initRandArray(row, col, from, to);

//        arr[0] = new int[]{10, 20, 15, 4, 5};
//        arr[3] = new int[]{10, 20, 15, 4, 5};

//        arr[7] = new int[]{3, 8, -10, -7, 4};
//        arr[2] = new int[]{10, -3, 8, -7, -4};
        printArray(arr);

        int[] multOfColumn = new int[arr.length];
        int[] indexRow = new int[multOfColumn.length];
        fillArray(multOfColumn, 1);
        fillArray(indexRow, -1);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                multOfColumn[i] *= arr[i][j];
            }
        }

        int max = abs(multOfColumn[0]);
        indexRow[0] = 0;
        int q = 0;
        //ищем максимальный по модулю эелмент
        for (int i = 1; i < multOfColumn.length; i++) {
            if (max < abs(multOfColumn[i])) {
                q = 0;
                fillArray(indexRow, -1);
                indexRow[q++] = i;
                max = abs(multOfColumn[i]);
            } else if (max == abs(multOfColumn[i])) {
                indexRow[q] = i;
                q++;
            }
        }

        System.out.println("Multiply of each row: ");
        printArray(multOfColumn);

        System.out.println("Maximum --> " + max);
        System.out.print("Indexes --> ");
        int i = 0;
        while (indexRow[i] != -1) {
            System.out.print("[" + indexRow[i++] + "] ");
        }

        nextLine();
        nextLine();
    }


    public static void taskD(int row, int col, int from, int to) {
        System.out.println("\t\tTask \"d\"");
        int[][] arr = initRandArray(row, col, from, to);
        printArray(arr);

        Integer[][] sortArray = new Integer[row][col];
        for (int i = 0; i < arr.length; i++) {
            sortArray[i] = reversSortArray(arr[i]);
        }
        System.out.println("Array sorted by each row:");
        printArray(sortArray);
        nextLine();
    }
}
