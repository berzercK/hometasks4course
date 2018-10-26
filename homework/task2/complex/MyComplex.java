package education.homework.task2.complex;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + ((imag < 0) ? "" : "+") + imag + "i)";
    }

    public boolean isReal() {
        return real != 0.0;
    }

    public boolean isImaginary() {
        return imag != 0.0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return this.real == another.real && this.imag == another.imag;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    } //модуль комплексного числа

    public double argument() {
        return Math.atan(imag / real);
    }

    //Добавить/вычесть/умножить/разделить данный экземпляр прямо в этом экземпляре и вернуть этот экземпляр

    public MyComplex add(MyComplex right) {
        right.setValue(right.real + this.real, right.imag + this.imag);
        return right;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        right.setValue(right.real - this.real, right.imag - this.imag);
        return right;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        right.setValue(right.real * this.real, right.imag * this.imag);

        return right;
    }

    public MyComplex divide(MyComplex right) {
        right.setValue(right.real / this.real, right.imag / this.imag);
        return right;
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }//Метод conjugate() возвращает объект MyComplex комлексного числа, сопряжённого с текущим (т.е. c this)


}
