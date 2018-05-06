package Figor;

public class Szescian extends FiguraPrzestrzenna {

    private double a;

    public Szescian() {
    }

    public Szescian(double a) {
        this.a = a;
    }

    @Override
    public double obliczPole() {
        return 6*(a*a);
    }

    @Override
    public double obliczObjetosc() {
        return a*a*a;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSzescian\nPole= "+obliczPole()+"\tObjętość= "+obliczObjetosc()+"\n";
    }
}
