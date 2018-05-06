package Figor;

public abstract class FiguraPlaska extends  FigoraGeometryczna {

    @Override
    public double obliczPole() {
        return 0;
    }

    public abstract double obliczObwod();

    @Override
    public String toString() {
        return "Obliczanie parametrów figury płaskiej";
    }
}
