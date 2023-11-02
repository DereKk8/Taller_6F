public abstract class FigGeo {
    private int numLados;

    public FigGeo(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public abstract float  darArea();
    public abstract float darPermitero();

    @Override
    public String toString() {
        return "numLados=" + numLados +
                '}';
    }
}
