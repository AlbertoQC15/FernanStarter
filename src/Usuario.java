public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private TipoUsuario tipo;

    public Usuario(int id, String nombre, String email, TipoUsuario tipo) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.tipo = tipo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
    public String toString() {
        return "Usuario{id=" + id + ", nombre='" + nombre + "', email='" + email + "', tipo=" + tipo + "}";
    }
}
