public class Recurso {
    private String tipo;
    private String calidad;
    private String cantidad;

    // Constructor
    public Recurso(String tipo, String calidad, String cantidad) {
        this.tipo = tipo;
        this.calidad = calidad;
        this.cantidad = cantidad;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public String getCalidad() {
        return calidad;
    }

    public String getCantidad() {
        return cantidad;
    }
}