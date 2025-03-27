import java.util.ArrayList;

public  class Gestor extends Usuario {

    private static ArrayList<Proyecto> proyectos = new ArrayList<>();

    public Gestor(int id, String nombre, String email, TipoUsuario tipo, String contrasena) {
        super(id, nombre, email, TipoUsuario.GESTOR, contrasena);
    }
    public String toString() {
        return "Gestor{id=" + getId() + ", nombre='" + getNombre() + "', email='" + getEmail() + "'}";
    }
    public void crearProyecto(String nombre, String categoria, double cantidadNecesaria, double cantidadFinanciada, String[] recompensas) {
        Proyecto nuevoProyecto = new Proyecto(proyectos.size() + 1, nombre, categoria, cantidadNecesaria, cantidadFinanciada, recompensas);
        proyectos.add(nuevoProyecto);
        System.out.println("Proyecto creado: " + nuevoProyecto);
    }

    public void visualizarProyectos() {
        for (Proyecto proyecto : proyectos) {
            System.out.println(proyecto);
        }
    }

    public void modificarProyecto(int id, String nuevoNombre, String nuevaCategoria, double nuevaCantidadNecesaria, double nuevaCantidadFinanciada) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getId() == id) {
                if (proyecto.getGestorId() != this.getId()) {
                    System.out.println("No puedes modificar este proyecto porque no te pertenece.");
                    return;
                }
                proyecto.setNombre(nuevoNombre);
                proyecto.setCategoria(nuevaCategoria);
                proyecto.setCantidadNecesaria(nuevaCantidadNecesaria);
                proyecto.setCantidadFinanciada(nuevaCantidadFinanciada);
                System.out.println("Proyecto modificado: " + proyecto);
                return;
            }
        }
        System.out.println("Proyecto no encontrado.");
    }

    public void eliminarProyecto(int id) {
        Proyecto proyectoAEliminar = null;
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getId() == id) {
                if (proyecto.getGestorId() != this.getId()) {
                    System.out.println("No puedes eliminar este proyecto porque no te pertenece.");
                    return;
                }
                proyectoAEliminar = proyecto;
                break;
            }
        }
        if (proyectoAEliminar != null) {
            proyectos.remove(proyectoAEliminar);
            System.out.println("Proyecto eliminado: " + proyectoAEliminar);
        } else {
            System.out.println("Proyecto no encontrado.");
        }
    }
}
