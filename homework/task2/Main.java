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

        System.out.println();

        myComplex1.setValue(7, -4);
        System.out.println(myComplex1.toString());
        System.out.print("Argument: ");
        System.out.format("%.3f%n", myComplex1.argument());
        System.out.print("Magnitude: ");
        System.out.format("%.3f%n", myComplex1.magnitude());

        System.out.println();

        MyComplex myComplex2 = new MyComplex(7, -4.5);
        System.out.println("Equals check: ");
        System.out.println(myComplex2.toString() +
                (myComplex2.equals(myComplex1) ? " is equals " : " is not equals ") + myComplex1.toString());
        System.out.println(myComplex2.toString() +
                (myComplex2.equals(7, -4.5) ? " is equals " : " is not equals ") + "(7-4.5i)");
        System.out.println(myComplex2.toString() +
                (myComplex2.equals(7, -45) ? " is equals " : " is not equals ") + "(7-45.0i)");

        System.out.println();

        //add, addNew, subtract, subtractNew, divide, multiply, conjugate
        MyComplex mC1 = new MyComplex(1, 1);
        MyComplex mC2 = new MyComplex(5, -7);
        MyComplex mC3 = new MyComplex(-10, 500);
        MyComplex mC4 = new MyComplex(-1000, 1000);

        System.out.println(mC1.toString());
        System.out.println(mC2.toString());
        mC1.add(mC2);
        System.out.println(mC1.toString());
        System.out.println(mC2.toString());

        System.out.println(mC3.toString());
        System.out.println(mC4.toString());
        System.out.println(mC3.subtractNew(mC4).toString());
        System.out.println(mC3.toString());
        System.out.println(mC4.toString());

        System.out.println(mC3.conjugate().toString());

//-------------------------------------MyPolynomial--------------------------------------------


    }
}
