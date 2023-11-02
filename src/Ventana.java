import java.util.ArrayList;
import java.util.List;

public class Ventana {
    List<FigGeo> listaFigGeo;

    public Ventana() {
        this.listaFigGeo = new ArrayList<>();
    }

    public int crearCuadrado(float lado){
        Cuadrado cuadrado = new Cuadrado(lado);

        if(cuadrado != null)
        {
            listaFigGeo.add(cuadrado);
            return 0;
        }
        else
            return 1;
    }

    public int crearRectangulo(float base, float altura){
        Rectangulo rec = new Rectangulo(base, altura);

        if(rec != null)
        {
            listaFigGeo.add(rec);
            return 0;
        }
        else
            return 1;
    }

    public int crearTriangualoEscaleno(float lado1, float lado2, float lado3){
        TriEscaleno triEsc = new TriEscaleno(lado1, lado2, lado3);

        if(triEsc != null)
        {
            listaFigGeo.add(triEsc);
            return 0;
        }
        else
            return 1;
    }

    public int crearTriangualoRectangulo(float base, float altura){
        TriRectangulo triRec = new TriRectangulo(base, altura);

        if(triRec != null)
        {
            listaFigGeo.add(triRec);
            return 0;
        }
        else
            return 1;
    }

    public int crearTriangualoIsoceles(float lado1, float lado2){
        TriIsoleces triIso = new TriIsoleces(lado1, lado2);

        if(triIso != null)
        {
            listaFigGeo.add(triIso);
            return 0;
        }
        else
            return 1;
    }

    public int crearTriangualoEquilatero(float lado){
        TriEquilatero triEqui = new TriEquilatero(lado);

        if(triEqui != null)
        {
            listaFigGeo.add(triEqui);
            return 0;
        }
        else
            return 1;
    }

    public List<Float> darAreas(){
        List<Float> areas = new ArrayList<>();

        for(FigGeo f: listaFigGeo)
        {
            areas.add(f.darArea());
        }

        return areas;
    }

    public List<Float> darPerimetros(){
        List<Float> perimetros = new ArrayList<>();

        for(FigGeo f: listaFigGeo)
        {
            perimetros.add(f.darPermitero());
        }

        return perimetros;
    }

    public int cuantosTriRec()
    {
        int contador = 0;

        for(FigGeo f: listaFigGeo)
        {
            if(f instanceof TriRectangulo)
            {
                contador++;
            }
        }

        return contador;
    }

    public int cuantosRectan()
    {
        int contador = 0;

        for(FigGeo f: listaFigGeo)
        {
            if(f instanceof Rectangulo)
            {
                contador++;
            }
        }

        return contador;
    }

    public int cuantosCuadrdados()
    {
        int contador = 0;

        for(FigGeo f: listaFigGeo)
        {
            if(f instanceof Cuadrado)
            {
                contador++;
            }
        }

        return contador;
    }




}
