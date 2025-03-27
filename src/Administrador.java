class Administrador extends Usuario implements Bloqueable {
    public Administrador(int id, String nombre, String email, String contrasena) {
        super(id, nombre, email,TipoUsuario.ADMIN ,contrasena);
    }
    public void bloquearUsuario(Usuario usuario) {
        System.out.println("Usuario " + usuario.getNombre() + " bloqueado.");
    }
    public void desbloquearUsuario(Usuario usuario) {
        System.out.println("Usuario " + usuario.getNombre() + " desbloqueado.");
    }
    public String toString() {
        return "Administrador{id=" + getId() + ", nombre='" + getNombre() + "', email='" + getEmail() + "'}";
    }
}
