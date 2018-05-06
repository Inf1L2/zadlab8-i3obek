package Figor;

public class Trojkat extends FiguraPlaska {

    private double a,b,c,h;

    public Trojkat() {
    }

    public Trojkat(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public Trojkat(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double obliczPole() {
        return (1/2)*a*h;
    }

    @Override
    public double obliczObwod() {
        return a+b+c;
    }

    @Override
    public String toString() {
        return super.toString()+"\nTrójkąt\nPole= "+obliczPole()+"\tObwod= "+obliczObwod()+"\n";
    }
}
