package education.homework.task3_structures.factorial;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int a = 100;
        BigInteger fac1;
        int fac2;

        long startTime = System.nanoTime();
        System.out.print("Factorial " + a + " -> " + factorial(a));
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(" || " + (estimatedTime / 1e+9) + " sec");

        long startTime2 = System.nanoTime();
        System.out.print("Factorial " + a + " -> " + factorial2(a));
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println(" || " + (estimatedTime2 / 1e+9) + " sec");

        System.out.println("Recurse method in " + estimatedTime / estimatedTime2 + " times longer.");
    }

    private static BigInteger factorial(int a) {
        if (a < 0) {
            return BigInteger.valueOf(-1);
        } else
        if (a == 0) {
            return BigInteger.valueOf(1);
        } else {
            return factorial(a - 1).multiply(BigInteger.valueOf(a));
        }
    }

    private static BigInteger factorial2(int a) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= a; ++i) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}

//    long startTime = System.nanoTime();
//    //
//    long estimatedTime = System.nanoTime() - startTime;
//        System.out.println(" -> " + (estimatedTime2 / 1e+9) + " sec");
