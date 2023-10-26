public class Rectangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;

    /**
     * se usa el super para traer las variables de la clase FigurasGeometricas que es la super clase
     * y se llama a la variable antes creada de lado1,lado2 para asi poder realizar las operaciones y darle valores en la clase Principal
     *
     */
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * @return en el return se usa la operacion para realizar lo pedido como obtenerArea, etc. y cuando ya se completa retorna para asi no seguir con algo inexistente
     */

    public double obtenerArea() {
        return lado1 * lado2;
    }

    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
        /**
         * Complejidadtemporal:O(1)Tiempoconstante.
         */
    }
}