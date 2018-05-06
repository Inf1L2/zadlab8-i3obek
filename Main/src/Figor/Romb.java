package Figor;

public class Romb extends FiguraPlaska {

    private double a,h;

    public Romb() {
    }

    public Romb(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double obliczPole() {
        return a*h;
    }

    @Override
    public double obliczObwod() {
        return 4*a;
    }

    @Override
    public String toString() {
        return super.toString()+"\nRomb\nPole= "+obliczPole()+"\tObwod= "+obliczObwod()+"\n";
    }
}
