import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * Se usa el sout para solicitar que figura quieres que nombre le vas a poner y el color y lo necesario segun la figura con el tipo de figura==1,2,3
         * se usa el double para poder ingresa un numero que no sea entero para los lados etc
         */
        System.out.println("Ingrese el nombre de la figura:");
        String nombre = scanner.nextLine();


        System.out.println("Ingrese el color de la figura:");
        String color = scanner.nextLine();


        System.out.println("Ingrese el tipo de figura (1: Circulo, 2: Rectangulo, 3: Triangulo):");
        int tipoFigura = scanner.nextInt();

        FiguraGeometrica figura = null;

        if (tipoFigura == 1) {

            System.out.println("Ingrese el radio del círculo:");
            double radio = scanner.nextDouble();
            figura = new Circulo(nombre, color, radio);

        } else if (tipoFigura == 2) {

            System.out.println("Ingrese el valor del lado 1 del rectangulo:");
            double lado1 = scanner.nextDouble();
            System.out.println("Ingrese el valor del lado 2 del rectángulo:");
            double lado2 = scanner.nextDouble();
            figura = new Rectangulo(nombre, color, lado1, lado2);
        } else if (tipoFigura == 3) {

            System.out.println("Ingrese el valor de la base del triangulo:");
            double base = scanner.nextDouble();
            System.out.println("Ingrese el valor de la altura del triangulo:");
            double altura = scanner.nextDouble();
            figura = new Triangulo(nombre, color, base, altura);
        } else {
            System.out.println("Tipo de figura no valido.");
            scanner.close();
            return;
        }
/**
 * Complejidadtemporal:O(1)Tiempoconstante.
 */
        System.out.println("Area de la figura: " + figura.obtenerArea());
        System.out.println("Perimetro de la figura: " + figura.obtenerPerimetro());

        scanner.close();
    }
}
