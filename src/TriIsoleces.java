import static java.lang.Math.sqrt;

public class TriIsoleces extends Triangulo{
    private float lado1;
    private float lado2;

    public TriIsoleces(float lado1, float lado2) {
        super(lado1, (float) sqrt((lado2*lado2)  - ((lado1/2)*(lado1/2))));
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    @Override
    public float darPermitero() {
        return lado1 + 2*lado2;
    }

    @Override
    public String toString() {
        return "TriIsoleces{" + super.toString() +
                " lado1=" + lado1 +
                ", lado2=" + lado2 +
                '}';
    }
}
