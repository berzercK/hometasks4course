package education.homework.task3structures.factorial;

import java.math.BigInteger;

public class FactorialMain {
    public static void main(String[] args) {
        int a = 100;
        BigInteger fac1;
        BigInteger fac2;

        long startTime = System.nanoTime();
        fac1 = factorial(a);
//        System.out.print("Factorial " + a + " -> " + factorial(a));
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("factorialRecur --> " + (estimatedTime / 1e+9) + " sec");

        long startTime2 = System.nanoTime();
        fac2 = factorialCycle(a);
//        System.out.print("Factorial " + a + " -> " + factorialCycle(a));
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("factorialCycle --> " + (estimatedTime2 / 1e+9) + " sec");

        System.out.println("Recurse method in " + (estimatedTime / estimatedTime2) + " times longer.");
        System.out.println();
        System.out.println(fac1);
        System.out.println(fac2);

        /*
        Out: 100!
        factorialRecur --> 7.08551E-4 sec
        factorialCycle --> 7.1111E-5 sec
        Recurse method in 9 times longer.

        93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000
        93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000
         */
    }

    private static BigInteger factorial(int a) {
        if (a < 0) {
            return BigInteger.valueOf(-1);
        } else if (a == 0) {
            return BigInteger.valueOf(1);
        } else {
            return factorial(a - 1).multiply(BigInteger.valueOf(a));
        }
    }

    private static BigInteger factorialCycle(int a) {
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
