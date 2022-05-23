package com;

public class ComplexNumber {
    double x;
    double y;

    public ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public ComplexNumber() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double module(){
        return Math.sqrt(x*x + y*y);
    }
    public ComplexNumber plus(ComplexNumber complexNumber1, ComplexNumber complexNumber2){
        return new ComplexNumber(complexNumber1.getX() + complexNumber2.getX(),
                complexNumber1.getY() + complexNumber2.getY());
    }
    public ComplexNumber minus(ComplexNumber complexNumber1, ComplexNumber complexNumber2){
        return new ComplexNumber(complexNumber1.getX() - complexNumber2.getX(),
                complexNumber1.getY() - complexNumber2.getY());
    }
    public ComplexNumber multiplication(ComplexNumber complexNumber1, ComplexNumber complexNumber2){
        return new ComplexNumber(complexNumber1.getX() * complexNumber2.getX() - complexNumber1.getY() * complexNumber2.getY(),
                complexNumber1.getX() * complexNumber2.getY() + complexNumber1.getY() * complexNumber2.getX());
    }

    public ComplexNumber del(ComplexNumber complexNumber1, ComplexNumber complexNumber2){
        return new ComplexNumber(complexNumber1.getX());
    }

    //1/a = x/(x^2+y^2) - i*y/(x^2+y^2)
    public ComplexNumber getReciprocal() {
        double denominator = x*x + y*y;
        if (denominator !=0){
            return new ComplexNumber(x/denominator, -y/denominator);
        } else {
            throw new IllegalStateException("a = 0");
        }
    }

    public double root(double a, int n){
        return Math.pow(a, 1/n);
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y +
                '}';
    }
}
