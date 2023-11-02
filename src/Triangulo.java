public abstract class Triangulo extends FigGeo{

    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        super(3);
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
        return base * altura / 2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + super.toString() +
                " base=" + base +
                ", altura=" + altura +
                '}';
    }
}
