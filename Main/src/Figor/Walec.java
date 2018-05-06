package Figor;

public class Walec extends FiguraPrzestrzenna {

    private double r,h;

    public Walec() {
    }

    public Walec(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double obliczPole() {
        return (2*Math.PI*(r*r))+(2*Math.PI*r*h);
    }

    @Override
    public double obliczObjetosc() {
        return Math.PI*(r*r)*h;
    }

    @Override
    public String toString() {
        return super.toString()+"\nWalec\nPole= "+obliczPole()+"\tObjętość= "+obliczObjetosc()+"\n";
    }
}
