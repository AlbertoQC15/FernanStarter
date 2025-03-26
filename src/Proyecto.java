import java.time.LocalDate;
import java.util.ArrayList;

public class Proyecto{

    public String nombre;
    public String descripcion;
    public String categoria;
    public double cantidadNecesaria;
    public double cantidadFinanciada;
    public LocalDate fechaInicio;
    public LocalDate fechaFin;
    public ArrayList<String> recompensas;
    private String creador;

    public Proyecto(String nombre, String descripcion, String categoria, double cantidadNecesaria, LocalDate fechaInicio, LocalDate fechaFin, String creador) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.cantidadNecesaria = cantidadNecesaria;
        this.cantidadFinanciada = 0;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.recompensas = new ArrayList<>();
        this.creador = creador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCantidadNecesaria() {
        return cantidadNecesaria;
    }

    public double getCantidadFinanciada() {
        return cantidadFinanciada;
    }

    public String getCreador() {
        return creador;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidadNecesaria(double cantidadNecesaria) {
        this.cantidadNecesaria = cantidadNecesaria;
    }
    }

