public class Rectangulo extends FigGeo{
    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        super(4);
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float darArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + super.toString() +
                " base=" + base +
                ", altura=" + altura +
                '}';
    }
}
