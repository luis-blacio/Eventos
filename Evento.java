import java.util.Date;

public class Evento {
    private final String nombre;
    private String descripcion;
    private String ubicacion;
    private Date fecha;


    // Constructor
    public Evento(String nombre, String descripcion, String ubicacion, Date fecha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Date getFecha() {
        return fecha;
    }
}



