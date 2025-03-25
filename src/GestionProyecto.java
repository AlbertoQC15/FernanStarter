import java.util.ArrayList;

public abstract class GestionProyecto {

    protected ArrayList<Proyecto> proyectos;

    public GestionProyecto() {
        this.proyectos = new ArrayList<>();
    }

    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

}
