package Figor;

public abstract class FiguraPrzestrzenna extends FigoraGeometryczna {

    @Override
    public double obliczPole() {
        return 0;
    }

    public abstract double obliczObjetosc();

    @Override
    public String toString() {
        return "Obliczanie parametrów figury przestrzennej";
    }
}
