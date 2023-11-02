import java.util.List;
import java.util.Scanner;

public class Consola {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        mostrarMenu(ventana);
    }

    private static void mostrarMenu(Ventana v) {
        boolean salir = false;
        while (!salir) {
            mostrarOpciones();
            int opcion = obtenerOpcion();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la longitud de los lados del cuadrado: ");
                    float ent = scanner.nextFloat();

                    int salida = v.crearCuadrado(ent);

                    if(salida == 1){
                        System.out.println("No se pudo Crear el Cuadrado!");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la longitud de la base del rectagulo: ");
                    float base = scanner.nextFloat();
                    System.out.println("Ingrese la longitud de la altura del rectagulo: ");
                    float alt = scanner.nextFloat();

                    salida = v.crearRectangulo(base, alt);

                    if(salida == 1){
                        System.out.println("No se pudo Crear el Cuadrado!");
                    }

                    break;
                case 3:

                    imprimirMenu();

                    int opcionTri = scanner.nextInt();

                    while (opcionTri != 0) {
                        switch (opcionTri) {
                            case 1:
                                // Crear triángulo rectángulo
                                System.out.println("Ingrese la longitud del cateto adyacente:");
                                float catA = scanner.nextFloat();
                                System.out.println("Ingrese la longitud del cateto opuesto:");
                                float catO = scanner.nextFloat();

                                salida = v.crearTriangualoRectangulo(catA, catO);

                                if(salida == 1){
                                    System.out.println("No se pudo Crear el Triangulo!");
                                }
                            break;

                            case 2:
                                // Crear triángulo equilátero
                                System.out.println("Ingrese la longitud del lado:");
                                float lado = scanner.nextFloat();

                                salida = v.crearTriangualoEquilatero(lado);

                                if(salida == 1){
                                    System.out.println("No se pudo Crear el Triangulo!");
                                }
                                break;
                            case 3:
                                // Crear triángulo isósceles
                                System.out.println("Ingrese la longitud del primer lado:");
                                float lado1 = scanner.nextFloat();
                                System.out.println("Ingrese la longitud del segundo lado:");
                                float lado2 = scanner.nextFloat();

                                salida = v.crearTriangualoIsoceles(lado1, lado2);

                                if(salida == 1){
                                    System.out.println("No se pudo Crear el Triangulo!");
                                }
                                break;
                            case 4:
                                // Crear triángulo escaleno
                                System.out.println("Ingrese la longitud de un lado:");
                                lado1 = scanner.nextFloat();
                                System.out.println("Ingrese la longitud de otro lado:");
                                lado2 = scanner.nextFloat();
                                System.out.println("Ingrese la longitud del tercer lado:");
                                float lado3 = scanner.nextFloat();

                                salida = v.crearTriangualoEscaleno(lado1, lado2, lado3);
                                if(salida == 1){
                                    System.out.println("No se pudo Crear el Triangulo!");
                                }
                                break;

                            case 0:
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }

                        imprimirMenu();
                        opcionTri = scanner.nextInt();
                    }

                    break;
                case 4:
                    if(v.listaFigGeo.isEmpty())
                    {
                        System.out.println("La lista de figuras esta vacia");
                    }
                    else
                        System.out.println(v.listaFigGeo);

                    break;
                case 5:
                    List<Float> areas = v.darAreas();

                    if(areas.isEmpty())
                    {
                        System.out.println("Ha ocurrido un error al calcular las areas");
                    }
                    else
                        System.out.println("Las Areas de todos las figuras son" + areas);
                    break;
                case 6:
                    List<Float> perimetros = v.darPerimetros();

                    if(perimetros.isEmpty())
                    {
                        System.out.println("Ha ocurrido un error al calcular los perimetros");
                    }
                    else
                        System.out.println("Los perimetros de todoas las figutas son" + perimetros);
                    break;
                case 7:
                    System.out.println("Hay " + v.cuantosTriRec() + " Triangulos Rectangulo/s");
                    break;

                case 8:
                    System.out.println("Hay " + v.cuantosCuadrdados() + " Cuadrado/s");
                    break;

                case 9:
                    System.out.println("Hay " + v.cuantosRectan() + " Rectangulo/s");
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }

    private static void mostrarOpciones() {
        System.out.println("Menú de opciones:");
        System.out.println("1. Crear un Cuadrado");
        System.out.println("2. Crear un Rectángulo");
        System.out.println("3. Crear un Triangulo");
        System.out.println("4. Mostrar la información de todas las figuras");
        System.out.println("5. Calcular las áreas de todas las figuras");
        System.out.println("6. Calcular los perimetros de todas las figuras");
        System.out.println("7. Consultar el numero de triangulos rectangulos");
        System.out.println("8. Consultar el numero de cuadrados");
        System.out.println("9. Consultar el numero de rectangulos");
        System.out.println("0. Salir");
    }

    public static void imprimirMenu() {
        System.out.println("** Menú de creación de triángulos **");
        System.out.println("1. Crear triángulo rectángulo");
        System.out.println("2. Crear triángulo equilátero");
        System.out.println("3. Crear triángulo isósceles");
        System.out.println("4. Crear triángulo escaleno");
        System.out.println("0. Salir");
    }

    private static int obtenerOpcion() {
        System.out.print("Selecciona una opción: ");
        return scanner.nextInt();
    }
}