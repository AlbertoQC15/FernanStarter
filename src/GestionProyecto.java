import java.util.ArrayList;

public class GestionProyecto {

    private ArrayList<Proyecto> proyectos;

    public GestionProyecto() {
        this.proyectos = new ArrayList<>();
    }

    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public void eliminarProyecto(String nombreProyecto, String usuario) {
        for (int i = 0; i < proyectos.size(); i++) {
            Proyecto proyecto = proyectos.get(i);
            if (proyecto.getNombre().equals(nombreProyecto) && proyecto.getCreador().equals(usuario)) {
                proyectos.remove(i);
                break;
            }
        }
    }

    public void modificarProyecto(String nombreProyecto, String usuario, String nuevaDescripcion, double nuevaCantidadNecesaria) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getNombre().equals(nombreProyecto) && proyecto.getCreador().equals(usuario)) {
                proyecto.setDescripcion(nuevaDescripcion);
                proyecto.setCantidadNecesaria(nuevaCantidadNecesaria);
            }
        }
    }

    public ArrayList<Proyecto> visualizarProyectos() {
        return proyectos;
    }

    public void invertirEnProyecto(String nombreProyecto, double cantidad) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getNombre().equals(nombreProyecto)) {
                proyecto.invertir(cantidad);
            }
        }
    }

}
