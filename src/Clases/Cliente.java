package Clases;

import java.util.Date;

/**
 *
 * @author LAURA
 */
public class Cliente {
    private String idCliente;
    private String nombre;
    private String documento;
    private String telefono;

    public Cliente(String idCliente, String nombre, String documento, 
            String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
    }

      public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
      @Override
    public String toString(){
        return idCliente + "|"
               + nombre + "|"
               + documento + "|"
               + telefono;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}