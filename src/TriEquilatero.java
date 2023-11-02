import static java.lang.Math.sqrt;

public class TriEquilatero extends Triangulo
{
    private float lado;
    public TriEquilatero(float lado) {
        super(lado, (float) sqrt((lado*lado)  - ((lado/2)*(lado/2))));
        this.lado = lado;
    }


    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float darPermitero() {
        return lado * 3;
    }

    @Override
    public String toString() {
        return "TriEquilatero{" + super.toString() +
                " lado=" + lado +
                '}';
    }
}
