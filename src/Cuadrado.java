public class Cuadrado extends FigGeo{
    private float lado;

    public Cuadrado(float lado) {
        super(4);
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float darArea() {
        return lado * lado;
    }

    @Override
    public float darPermitero() {
        return lado * 4;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + super.toString()  + " lado=" + lado +
                '}';
    }
}
