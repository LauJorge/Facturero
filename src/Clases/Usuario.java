package Clases;
/**
 *
 * @author LAURA
 */
public class Usuario {
    private String idUsuario;
    private String nombre;
    private String apellido;
    private String clave;
    private int perfil;

    public Usuario(String idUsuario, String nombre, String apellido, String clave, int perfil) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.perfil = perfil;
    }
    public String getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public int getPerfil() {
        return perfil;
    }
    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
    @Override
    public String toString(){
        return idUsuario + "|"
               + nombre + "|"
               + apellido + "|"
               + clave;
    }
    
    
    
    
    
    
    
    
    
}
