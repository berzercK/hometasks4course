package education.homework.task2OOP2;

import education.homework.task2OOP2.complex.MyComplex;
import education.homework.task2OOP2.polynomial.MyPolynomial;

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

        System.out.print("---------------------------------------MyPolynomial--------------------------------------------");
        double[] coeffs = new double[]{4, -3, 0, 9, 6};

        MyPolynomial myPolynomial = new MyPolynomial(coeffs);
        System.out.println("\nmyPolynomial is = " + myPolynomial.toString()); // --> myPolynomial is = 6.0x^4+9.0x^3+8.0x^2-3.0x+4.0
        System.out.println("His degree is = " + myPolynomial.getDegree());    // --> His degree is = 4

        double[] c1 = new double[]{1};
        MyPolynomial myPolynomial1 = new MyPolynomial(c1);
        System.out.println("\nmyPolynomial is = " + myPolynomial1.toString()); // --> myPolynomial is = 1.0
        System.out.println("His degree is = " + myPolynomial1.getDegree());    // --> His degree is = 0

        double[] c2 = new double[]{5, -5, -7};
        MyPolynomial myPolynomial2 = new MyPolynomial(c2);
        System.out.println("\nmyPolynomial is = " + myPolynomial2.toString()); // --> myPolynomial is = -7.0x-5.0
        System.out.println("His degree is = " + myPolynomial2.getDegree());    // --> His degree is = 1

        double[] c3 = new double[]{};
        MyPolynomial myPolynomial3 = new MyPolynomial(c3);
        System.out.println("\nmyPolynomial is = " + myPolynomial3.toString()); // --> myPolynomial is = Not exist
        System.out.println("His degree is = " + myPolynomial3.getDegree());    // --> His degree is = -1000

        double[] c4 = new double[]{0};
        MyPolynomial myPolynomial4 = new MyPolynomial(c4);
        System.out.println("\nmyPolynomial is = " + myPolynomial4.toString()); // --> myPolynomial is = 0.0
        System.out.println("His degree is = " + myPolynomial4.getDegree());    // --> His degree is = 0

//-------------------------------------test ADDING--------------------------------------------------------------------
        System.out.println("\n---------add---------");
        System.out.print("\n(" + myPolynomial.toString() + ") + (" + myPolynomial1.toString() + ") = ");
        System.out.println(myPolynomial.add(myPolynomial1).toString());

        System.out.print("\n(" + myPolynomial.toString() + ") + (" + myPolynomial2.toString() + ") = ");
        System.out.println(myPolynomial.add(myPolynomial2).toString());

        System.out.print("\n(" + myPolynomial.toString() + ") + (" + myPolynomial3.toString() + ") = ");
        System.out.println(myPolynomial.add(myPolynomial3).toString());

        System.out.print("\n(" + myPolynomial.toString() + ") + (" + myPolynomial4.toString() + ") = ");
        System.out.println(myPolynomial.add(myPolynomial4).toString());

//Result.txt:
/*
        6.0x^4+9.0x^3+8.0x^2-3.0x+4.0__+__1.0 = 6.0x^4+9.0x^3+8.0x^2-3.0x+5.0

        6.0x^4+9.0x^3+8.0x^2-3.0x+4.0__+__-7.0x-5.0 = 6.0x^4+9.0x^3+8.0x^2-10.0x-1.0

        6.0x^4+9.0x^3+8.0x^2-3.0x+4.0__+__Not exist = 6.0x^4+9.0x^3+8.0x^2-3.0x+4.0

        6.0x^4+9.0x^3+8.0x^2-3.0x+4.0__+__0.0 = 6.0x^4+9.0x^3+8.0x^2-3.0x+4.0*/

// test successfull
//
//        Если один из слагаемых полинома = 0
//        6.0x^4+9.0x^3-3.0x+4.0__+__1.0 = 6.0x^4+9.0x^3-3.0x+5.0
//
//        6.0x^4+9.0x^3-3.0x+4.0__+__-7.0x^2-5.0x+5.0 = 6.0x^4+9.0x^3-7.0x^2-8.0x+9.0

//-------------------------------------test MULTY--------------------------------------------------------------------

        System.out.println("\n---------multiply---------");
        System.out.print("\n(" + myPolynomial.toString() + ") * (" + myPolynomial2.toString() + ") = ");
        System.out.println(myPolynomial.multiply(myPolynomial2).toString());

        System.out.print("\n" + myPolynomial.toString());
        System.out.print("\n" + myPolynomial.evaluate(4));
        System.out.print("\n" + myPolynomial.evaluate(1));

    }
}
