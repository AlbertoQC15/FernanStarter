import java.time.LocalDate;
import java.util.ArrayList;

public class Proyecto{
    private int id;
    private String nombre;
    private String categoria;
    private double cantidadNecesaria;
    private double cantidadFinanciada;
    private ArrayList<String> recompensas;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int gestorId;

    public Proyecto(int id, String nombre, String categoria, double cantidadNecesaria, double cantidadFinanciada, String[] recompensas) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidadNecesaria = cantidadNecesaria;
        this.cantidadFinanciada = cantidadFinanciada;
        this.recompensas = new ArrayList<>();
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.gestorId = gestorId;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setCantidadFinanciada(double cantidadFinanciada) {
        this.cantidadFinanciada = cantidadFinanciada;
    }

    public void agregarRecompensa(String recompensa) {
        if (recompensas.size() < 3) {
            recompensas.add(recompensa);
        } else {
            System.out.println("No se pueden agregar más de 3 recompensas.");
        }
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

    public int getGestorId() {
        return gestorId;
    }

    public void setGestorId(int gestorId) {
        this.gestorId = gestorId;
    }

    public String toString() {
        return "Proyecto{id=" + id + ", nombre='" + nombre + "', categoria='" + categoria +
                "', cantidadNecesaria=" + cantidadNecesaria + ", cantidadFinanciada=" + cantidadFinanciada +
                ", gestorId=" + gestorId + "}";
    }

    }

