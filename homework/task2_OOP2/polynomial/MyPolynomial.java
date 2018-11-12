package education.homework.task2_OOP2.polynomial;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = new double[coeffs.length];
        System.arraycopy(coeffs, 0, this.coeffs, 0, coeffs.length);
    }

    public int getDegree() {
        return (coeffs.length != 0) ? coeffs.length - 1 : -1000;
    }

    @Override
    public String toString() {
        if (coeffs.length == 0) {
            return "Not exist";
        } else if (coeffs.length == 1 && coeffs[0] == 0) {
            return "0";
        }

        StringBuilder str = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] == 0) {
                continue;
            } // его не выводим
            if (i != 0 && i != 1) {
                str.append(coeffs[i]).append("x^").append(i).append((coeffs[i - 1] > 0) ? "+" : "");
            } else if (i == 1) {
                str.append(coeffs[i]).append("x").append((coeffs[i - 1] > 0) ? "+" : "");
            } else {
                str.append(coeffs[i]);
            }
        }

        return str.toString();
    }

    public double evaluate(double x) {
        double value = 0.0;

        for (int i = 0; i < coeffs.length; i++) {
            value += coeffs[i] * Math.pow(x, i);
        }

        return value;
    }

    public MyPolynomial add(MyPolynomial right) {
        int lenThis = this.coeffs.length;
        int lenRight = right.coeffs.length;

        //если полином right пустой (тут бы правильно вообще ошибку вывести) или равен нулю, то возвращаем this - полином,
        // т.к. складывать нечего
        // если наоборот - возвращаем правый полином
        if (lenRight == 0 || (right.getDegree() == 0 && right.coeffs[0] == 0)) {
            return this;
        } else if (lenThis == 0 || (this.getDegree() == 0 && this.coeffs[0] == 0)) {
            return right;
        }
        //в ином случае (все полиномы существуют) можно пытаться производить манипуляции

//        int min = Math.min(lenRight, lenThis);
        int max = Math.max(lenRight, lenThis);
        double[] newCoeffs = new double[max];
        System.arraycopy((lenThis >= lenRight) ? this.coeffs : right.coeffs, 0, newCoeffs, 0, max);

        for (int i = 0; i < Math.min(lenRight, lenThis); i++) {
            newCoeffs[i] += right.coeffs[i];
        }

        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int lenThis = this.coeffs.length;
        int lenRight = right.coeffs.length;

        if (lenRight == 0 || (right.getDegree() == 0 && right.coeffs[0] == 0) ||
                lenThis == 0 || (this.getDegree() == 0 && this.coeffs[0] == 0)) {
            return new MyPolynomial(new double[] {0});
        }

        if (lenRight == 1 && right.coeffs[0] == 1) {
            return this;
        } //если полином умножается на 1 или 0,
        // то нечего цикл гнать - экономим чуть-чуть по памяти и времени
        if (lenThis == 1 && coeffs[0] == 1) {
            return right;
        }

        double[][] newCoeffs = new double[lenThis][lenRight + lenThis - 1];
        MyPolynomial[] multResult = new MyPolynomial[lenThis];

        for (int i = lenThis - 1; i >= 0; i--) {
            for (int j = lenRight - 1; j >= 0; j--) {
                newCoeffs[i][i + j] = coeffs[i] * right.coeffs[j];
            }
            multResult[i] = new MyPolynomial(newCoeffs[i]);
        }

        MyPolynomial returnPoly = new MyPolynomial(multResult[0].coeffs);

        for (int i = 0; i < newCoeffs.length - 1; i++) {
            returnPoly = new MyPolynomial(returnPoly.add(multResult[i + 1]).coeffs);
        }

        return returnPoly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPolynomial)) return false;

        MyPolynomial myPolynomial = (MyPolynomial) o;
        return Arrays.equals(myPolynomial.coeffs, coeffs);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + Arrays.hashCode(coeffs);
        return result;
    }

}
