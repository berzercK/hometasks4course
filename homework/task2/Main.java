package education.homework.task2;

import education.homework.task2.complex.MyComplex;

public class Main {
    public static void main(String[] args) {
//-------------------------------------Complex-----------------------------------------
        MyComplex myComplex1 = new MyComplex();

        System.out.println(myComplex1.toString());
        System.out.println("Real is exist? - " + myComplex1.isReal());
        System.out.println("Imag is exist? - " + myComplex1.isImaginary());

        System.out.println();

        myComplex1.setReal(2.0);
        System.out.println(myComplex1.toString());
        System.out.println("Real is exist? - " + myComplex1.isReal());


    }
}
