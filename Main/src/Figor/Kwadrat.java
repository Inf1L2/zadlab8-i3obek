package Figor;

public class Kwadrat extends FiguraPlaska {

    private double a;

    public Kwadrat() {
    }

    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    public double obliczPole() {
        return a*a;
    }

    @Override
    public double obliczObwod() {
        return a+a;
    }

    @Override
    public String toString() {
        return super.toString()+"\nKwadrat\nPole= "+obliczPole()+"\tObwod= "+obliczObwod()+"\n";
    }
}
