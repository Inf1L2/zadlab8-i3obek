package Figor;

public class Kolo extends FiguraPlaska {

    private double r;

    public Kolo() {
    }

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double obliczPole() {
        return Math.PI*r;
    }

    @Override
    public double obliczObwod() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return super.toString()+"\nKoło\nPole= "+obliczPole()+"\tObwod= "+obliczObwod()+"\n";
    }
}
