package Figor;

public class Trapez extends FiguraPlaska {

    private double a,b,c,d,h;

    public Trapez() {
    }

    public Trapez(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    public Trapez(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double obliczPole() {
        return (1/2)*(a+b)*h;
    }

    @Override
    public double obliczObwod() {
        return a+b+c+d;
    }

    @Override
    public String toString() {
        return super.toString()+"\nTrapez\nPole= "+obliczPole()+"\tObwod= "+obliczObwod()+"\n";
    }
}
