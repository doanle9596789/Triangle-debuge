package triangle;

import a.IllegalTriangleException;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c)throws IllegalTriangleException {
        if (a<=0||b<=0||c<=0){
            throw new IllegalTriangleException("cạnh tam giác phai lớn hơn 0");
        }else if (a+b<c||a+c<b||b+c<a){
            throw new IllegalTriangleException("không phai ba cạnh tam giác");
        }else {
            System.out.println(" tam giác có các cạnh là "+ """
                  a,b,c
                  """);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}


