public class Inversor extends Usuario {
    public Inversor(int id, String nombre, String email, TipoUsuario tipo, String contrasena) {
        super(id, nombre, email, TipoUsuario.INVERSOR, contrasena);
    }
    public String toString() {
        return "Inversor{id=" + getId() + ", nombre='" + getNombre() + "', email='" + getEmail() + "'}";
    }
}
