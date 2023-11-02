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
                        switch (opcion) {
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
                                double lado1 = sc.nextDouble();
                                System.out.println("Ingrese la longitud de otro lado:");
                                double lado2 = sc.nextDouble();
                                System.out.println("Ingrese la longitud del tercer lado:");
                                double lado3 = sc.nextDouble();

                                // Calcular el área del triángulo escaleno
                                double semisumaLados = (lado1 + lado2 + lado3) / 2;
                                double area = Math.sqrt(semisumaLados * (semisumaLados - lado1) * (semisumaLados - lado2) * (semisumaLados - lado3));

                                // Imprimir el área del triángulo escaleno
                                System.out.println("El área del triángulo escaleno es de " + area + " unidades cuadradas");
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }

                        imprimirMenu();
                        opcion = sc.nextInt();
                    }

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

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
        System.out.println("6. Calcular los perímetros de todas las figuras");
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