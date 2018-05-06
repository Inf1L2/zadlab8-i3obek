package Figor;

public class Prostokat extends FiguraPlaska {

    private double a,b;

    public Prostokat() {
    }

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obliczPole() {
        return a*b;
    }

    @Override
    public double obliczObwod() {
        return 2*(a+b);
    }

    @Override
    public String toString() {
        return super.toString()+"\nProstokąt\nPole= "+obliczPole()+"\tObwod= "+obliczObwod()+"\n";
    }
}
