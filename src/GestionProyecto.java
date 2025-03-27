import java.util.ArrayList;

public class GestionProyecto {

    private ArrayList<Proyecto> proyectos;

    public GestionProyecto() {
        this.proyectos = new ArrayList<>();
    }

    public void crearProyecto(String nombre, String categoria, double cantidadNecesaria, double cantidadFinanciada, String[] recompensas) {
        Proyecto nuevoProyecto = new Proyecto(proyectos.size() + 1, nombre, categoria, cantidadNecesaria, cantidadFinanciada, recompensas);

        for (int i = 0; i < recompensas.length && i < 3; i++) {
            nuevoProyecto.agregarRecompensa(recompensas[i]);
        }

        proyectos.add(nuevoProyecto);
        System.out.println("Proyecto creado: " + nuevoProyecto);
    }

    public void visualizarProyectos() {
        if (proyectos.isEmpty()) {
            System.out.println("No hay proyectos disponibles.");
        } else {
            for (Proyecto p : proyectos) {
                System.out.println(p);
            }
        }
    }

    public void modificarProyecto(int id, String nuevoNombre, String nuevaCategoria, double nuevaCantidadNecesaria, double nuevaCantidadFinanciada) {
        Proyecto proyecto = buscarProyecto(id);
        if (proyecto != null) {
            proyecto.setNombre(nuevoNombre);
            proyecto.setCategoria(nuevaCategoria);
            proyecto.setCantidadNecesaria(nuevaCantidadNecesaria);
            proyecto.setCantidadFinanciada(nuevaCantidadFinanciada);
            System.out.println("Proyecto modificado: " + proyecto);
        } else {
            System.out.println("Proyecto no encontrado.");
        }
    }

    public void eliminarProyecto(int id) {
        Proyecto proyecto = buscarProyecto(id);
        if (proyecto != null) {
            proyectos.remove(proyecto);
            System.out.println("Proyecto eliminado.");
        } else {
            System.out.println("Proyecto no encontrado.");
        }
    }

    private Proyecto buscarProyecto(int id) {
        for (Proyecto p : proyectos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    }
