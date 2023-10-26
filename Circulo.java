public class Circulo extends FiguraGeometrica{
    private double radio;
/**
 * se usa el super para traer las variables de la clase FigurasGeometricas que es la super clase
 * y se llama a la variable antes creada de radio para asi poder realizar las operaciones y darles valores en la clase Principal
 */
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }


    /**
     *
     * @return en el return se usa la operacion para realizar lo pedido como obtenerArea, etc. y cuando ya se completa retorna para asi no seguir con algo inexistente
     */
    public double obtenerArea() {
        return 3.1415 * radio * radio;
    }

    public double obtenerPerimetro() {
        return 2 * 3.1415 * radio;
        /**
         * Complejidadtemporal:O(1)Tiempoconstante.
         */
    }
}
