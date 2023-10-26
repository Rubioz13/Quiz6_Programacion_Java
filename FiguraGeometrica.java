public class FiguraGeometrica {
    private String nombre;
    private String color;

    /**
     *
     * @param nombre,color
     * son variables que nos ayudan a darles una palabra y complementar a las siguientes clases como circulo, etc.
     * y asi poder completar el campo que se necesita con ayuda del getter o setter.
     */
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    /**
     * @return se realiza el retorno para que asi no continue a una varibale inexistente
     * y vuelva al inicio a que soliciten otra cosa
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double obtenerArea () {
        return 0.0 ;
    }
    public double obtenerPerimetro () {
        return 0.0 ;
        /**
         * Complejidadtemporal:O(1)Tiempoconstante.
         */
    }
}
