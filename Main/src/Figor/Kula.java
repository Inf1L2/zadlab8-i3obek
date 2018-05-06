package Figor;

public class Kula extends FiguraPrzestrzenna {

    private double r;

    public Kula() {
    }

    public Kula(double r) {
        this.r = r;
    }

    @Override
    public double obliczPole() {
        return 4*Math.PI*(r*r);
    }

    @Override
    public double obliczObjetosc() {
        return (4/3)*Math.PI*(r*r*r);
    }

    @Override
    public String toString() {
        return super.toString()+"\nKula\nPole= "+obliczPole()+"\tObjętość= "+obliczObjetosc()+"\n";
    }
}
