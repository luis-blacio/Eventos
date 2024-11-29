import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear tipos de evento
        TipoEvento tipoEvento1 = new TipoEvento("Cultural", "Religioso", "Educativo", "Social", "Cultural");
        TipoEvento tipoEvento2 = new TipoEvento("Deportivo", "Religioso", "Educativo", "Social", "Cultural");

        // Crear eventos con fechas válidas
        Evento evento1 = new Evento("Concierto de Rock", "Un evento cultural de música rock", "Estadio Principal", new Date());
        Evento evento2 = new Evento("Conferencia de Tecnología", "Evento educativo sobre nuevas tecnologías", "Centro de Convenciones", new Date());

        // Crear organizadores
        Organizador organizador1 = new Organizador("Planificación Completa", "Proactivo y eficiente");
        Organizador organizador2 = new Organizador("Planificación Básica", "Enfoque en resultados rápidos");

        // Crear participantes
        Participante participante1 = new Participante("Espectador");
        Participante participante2 = new Participante("Ponente");

        // Crear personal de trabajo
        PersonalT personal1 = new PersonalT("Coordinador", "Organización de actividades");
        PersonalT personal2 = new PersonalT("Técnico", "Soporte técnico en eventos");

        // Crear recursos con el constructor adecuado
        Recurso recurso1 = new Recurso("Micrófono", "Alta calidad", "10");
        Recurso recurso2 = new Recurso("Pantalla LED", "Alta calidad", "5");

        // Crear salas de evento
        SalaEvento salaEvento1 = new SalaEvento("Auditorio", "Diseño en forma de círculo");
        SalaEvento salaEvento2 = new SalaEvento("Pabellón de Exhibición", "Diseño rectangular");

        // Crear transportador y vehículo
        Transportador transportador = new Transportador("Excelente puntualidad");
        Vehiculo vehiculo = new Vehiculo(10.5f, 2000.0f, "ABC123", "Camioneta", "Rojo");

        // Asignar eventos a organizadores
        organizador1.crearEvento();
        organizador2.crearEvento();

        // Agregar participantes a los eventos
        List<Participante> participantesEvento1 = new ArrayList<>();
        participantesEvento1.add(participante1);
        participantesEvento1.add(participante2);

        // Mostrar información de los eventos
        System.out.println("Evento 1: " + evento1.getNombre() + " | " + evento1.getDescripcion());
        System.out.println("Ubicación: " + evento1.getUbicacion() + " | Fecha: " + evento1.getFecha());
        System.out.println("Participantes: ");
        for (Participante participante : participantesEvento1) {
            System.out.println(" - " + participante.getTipo());
        }

        // Mostrar información del organizador
        System.out.println("Organizador 1: " + organizador1.getPlanificacion() + " | " + organizador1.getProactivo());

        // Mostrar recursos
        System.out.println("Recurso 1: " + recurso1.getTipo() + " | " + recurso1.getCalidad() + " | Cantidad: " + recurso1.getCantidad());
        System.out.println("Recurso 2: " + recurso2.getTipo() + " | " + recurso2.getCalidad() + " | Cantidad: " + recurso2.getCantidad());
    }
}