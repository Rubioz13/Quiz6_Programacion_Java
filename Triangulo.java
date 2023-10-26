public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    /**
     * se usa el super para traer las variables de la clase FigurasGeometricas que es la super clase
     * y se llama a la variable antes creada de base,altura para asi poder realizar las operaciones y darle valores en la clase Principal
     */
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * @return en el return se usa la operacion para realizar lo pedido como obtenerArea, etc. y cuando ya se completa retorna para asi no seguir con algo inexistente
     */
    public double obtenerArea() {
        return 0.5 * base * altura;
    }

    public double obtenerPerimetro() {
        return 0.0;
        /**
         * Complejidadtemporal:O(1)Tiempoconstante.
         */
    }
}