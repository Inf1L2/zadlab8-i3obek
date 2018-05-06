package Figor;

public class Rownoleglobok extends FiguraPlaska {

    private double a,b,h;

    public Rownoleglobok() {
    }

    public Rownoleglobok(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double obliczPole() {
        return a*h;
    }

    @Override
    public double obliczObwod() {
        return (2*a)+(2*b);
    }

    @Override
    public String toString() {
        return super.toString()+"\nRównoległobok\nPole= "+obliczPole()+"\tObwod= "+obliczObwod()+"\n";
    }
}
