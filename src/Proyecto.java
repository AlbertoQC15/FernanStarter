import java.time.LocalDate;
import java.util.ArrayList;

public class Proyecto extends GestionProyecto {

    public String nombre;
    public String descripcion;
    public String categoria;
    public double cantidadNecesaria;
    public double cantidadFinanciada;
    public LocalDate fechaInicio;
    public LocalDate fechaFin;
    public ArrayList<String> recompensas;

    public Proyecto(String nombre, String descripcion, String categoria, double cantidadNecesaria, LocalDate fechaInicio, LocalDate fechaFin) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.cantidadNecesaria = cantidadNecesaria;
        this.cantidadFinanciada = 0;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.recompensas = new ArrayList<>();
    }

    public void agregarRecompensa(String recompensa) {
        recompensas.add(recompensa);
    }

    public ArrayList<String> getRecompensas() {
        return recompensas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getCantidadNecesaria() {
        return cantidadNecesaria;
    }

    public void setCantidadNecesaria(double cantidadNecesaria) {
        this.cantidadNecesaria = cantidadNecesaria;
    }

    public double getCantidadFinanciada() {
        return cantidadFinanciada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}
