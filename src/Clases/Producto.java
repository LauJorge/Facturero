package Clases;

/**
 *
 * @author LAURA
 */
public class Producto {
    private String idProducto;
    private String descripcion;
    private int precio;
    private String nota;

    public Producto(String idProducto, String descripcion, int precio, String nota) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nota = nota;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

     @Override
    public String toString(){
        return idProducto + "|"
               + descripcion + "|"
               + precio + "|"
               + nota;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}