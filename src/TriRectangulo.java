import static java.lang.Math.sqrt;

public class TriRectangulo extends Triangulo{

    private float catetoA;
    private float catetoO;

    public TriRectangulo(float catetoA, float catetoO) {
        super(catetoA, catetoO);
        this.catetoA = catetoA;
        this.catetoO = catetoO;
    }

    public float getCatetoA() {
        return catetoA;
    }

    public void setCatetoA(float catetoA) {
        this.catetoA = catetoA;
    }

    public float getCatetoO() {
        return catetoO;
    }

    public void setCatetoO(float catetoO) {
        this.catetoO = catetoO;
    }

    public  float darHipotenusa(){
        return (float) sqrt((catetoA*catetoA) + (catetoO * catetoO));
    }


    @Override
    public float darPermitero() {
        return catetoO + catetoA + darHipotenusa();
    }

    @Override
    public String toString() {
        return "TriRectangulo{" + super.toString() +
                " catetoA=" + catetoA +
                ", catetoO=" + catetoO +
                '}';
    }
}
