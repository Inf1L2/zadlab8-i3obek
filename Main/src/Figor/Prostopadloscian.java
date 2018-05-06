package Figor;

public class Prostopadloscian extends FiguraPrzestrzenna {

    private double a,b,h;

    public Prostopadloscian() {
    }

    public Prostopadloscian(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double obliczPole() {
        return 2*(a*b)+2*(b*h)+2*(a*h);
    }

    @Override
    public double obliczObjetosc() {
        return a*b*h;
    }

    @Override
    public String toString() {
        return super.toString()+"\nProstopadloscian\nPole= "+obliczPole()+"\tObjętość= "+obliczObjetosc()+"\n";
    }
}
