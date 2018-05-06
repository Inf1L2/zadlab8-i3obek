package Figor;

public class Stozek extends FiguraPrzestrzenna {

    private double h,r,l,kat;

    public Stozek() {
    }

    public Stozek(double h, double r, double l, double kat) {
        this.h = h;
        this.r = r;
        this.l = l;
        this.kat = kat;
    }

    public Stozek(double h, double r, double kat) {
        this.h = h;
        this.r = r;
        this.l = Math.sqrt((h*h)+(r*r));
        this.kat = kat;
        //l = Math.sqrt((h*h)+(r*r));
    }

    @Override
    public double obliczPole() {
        return Math.PI*r*(r+l);
    }

    @Override
    public double obliczObjetosc() {
        return (1/3)*Math.PI*(r*r)*h;
    }

    @Override
    public String toString() {
        return super.toString()+"\nStozek\nPole= "+obliczPole()+"\tObjętość= "+obliczObjetosc()+"\n";
    }
}
