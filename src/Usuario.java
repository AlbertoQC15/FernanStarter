public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private TipoUsuario tipo;
    private String contrasena;

    public Usuario(int id, String nombre, String email, TipoUsuario tipo, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.tipo = tipo;
        this.contrasena = contrasena;
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
    public void cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
        System.out.println("Nombre de usuario cambiado a: " + nuevoNombre);
    }

    public void cambiarContrasena(String nuevaContrasena) {
        this.contrasena = nuevaContrasena;
        System.out.println("Contraseña cambiada correctamente.");
    }

    public void cerrarSesion() {
        System.out.println("El usuario " + nombre + " ha cerrado sesión.");
    }

}
