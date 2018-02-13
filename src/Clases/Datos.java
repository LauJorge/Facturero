package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datos {
    private int maxUsu =100;
    private Usuario misUsuarios[] = new Usuario[maxUsu];
    private int conUsuarios = 0;  
    private int maxProd = 100;
    private Producto misProductos[] = new Producto[maxProd];
    private int conProductos = 0;   
    private int maxCli = 200;
    private Cliente misClientes[] = new Cliente [maxCli];
    private int conClientes = 0;
       
    public Datos(){
        Usuario miUsuario;
        miUsuario = new Usuario("lau", "lau", "lau", "lau", 1);
        misUsuarios[conUsuarios] = miUsuario;
        conUsuarios ++;
        miUsuario = new Usuario("lau1", "lau", "jorge", "lau", 2);
        misUsuarios[conUsuarios] = miUsuario;
        conUsuarios ++;
        miUsuario = new Usuario("lau2", "lau", "jorge", "lau", 3);
        misUsuarios[conUsuarios] = miUsuario;
        conUsuarios ++;
        miUsuario = new Usuario("lau3", "lau", "jorge", "lau", 1);
        misUsuarios[conUsuarios] = miUsuario;
        conUsuarios ++;
        
        
        Producto miProducto;
        miProducto = new Producto("gato","lau", 20, "lau");
        misProductos[conProductos] = miProducto;
        conProductos ++;
        miProducto = new Producto("gato1", "lau", 30, "lau");
        misProductos[conProductos] = miProducto;
        conProductos ++;
        miProducto = new Producto("gato2", "lau", 40, "lau");
        misProductos[conProductos] = miProducto;
        conProductos ++;
        miProducto = new Producto ("gato3","lau", 20, "lau");
        misProductos[conProductos] = miProducto;
        conProductos ++;
        
        Cliente miCliente;
        miCliente = new Cliente("gato","lau", "Av Siempre Viva 666", "algo");
        misClientes [conClientes] = miCliente;
        conClientes ++;
        miCliente = new Cliente("gato1","lau", "Av Siempre Viva 666", "algo");
        misClientes [conClientes] = miCliente;
        conClientes ++;
        miCliente = new Cliente("gato2","lau", "Av Siempre Viva 666", "algo");
        misClientes [conClientes] = miCliente;
        conClientes ++;
        miCliente = new Cliente("gato3","lau", "Av Siempre Viva 666", "algo");
        misClientes [conClientes] = miCliente;
        conClientes ++;
    }
    public int numeroUsuarios (){
    return conUsuarios;
    }         
    public Usuario[] getUsuarios(){
    return misUsuarios;}                   
    public boolean validarUsuario (String usuario, String contrasena){
        
        boolean aux = false;
        for (int i = 0; i < conUsuarios; i++) {
            if(misUsuarios[i].getIdUsuario().equals(usuario)&& misUsuarios[i].getClave().equals(contrasena))
            {return true;}
            }return false;
     
    }
    public int getPerfil (String usuario){
                int aux = -1;
        for (int i = 0; i < conUsuarios; i++) {
            if(misUsuarios[i].getIdUsuario().equals(usuario))
            {
                return misUsuarios[i].getPerfil();
                        }
            }return -1;
     
    }
    public int posicionUsuario (String usuario){      
        for (int i = 0; i < conUsuarios; i++) {
            if(misUsuarios[i].getIdUsuario().equals(usuario))
            {return i;}
            }return -1;     
        }
    public String agregarUsuario (Usuario miUsuario){
        if (conUsuarios == maxUsu){
            return "se alcanzo el numero máximo de usuarios";
        }
        misUsuarios[conUsuarios]=miUsuario;
        conUsuarios++;
        return "Usuario agregado correctamente";
    }
    public String modificarUsuario (Usuario miUsuario, int pos){
        {
            misUsuarios[pos].setNombre(miUsuario.getNombre());
            misUsuarios[pos].setApellido(miUsuario.getApellido());
            misUsuarios[pos].setClave(miUsuario.getClave());
            misUsuarios[pos].setPerfil(miUsuario.getPerfil());                                                         
                       
        return "Usuario agregado correctamente";
        }
        
        }
    public String borrarUsuario (int pos){
        
    for (int i = pos; i < conUsuarios -1; i++) {
        misUsuarios[i] = misUsuarios[i++];
    }
        conUsuarios--;

        return "Usuario borrado correctamente";
        }
//::::::::::::::::::::::::::PRODUCTOS::::::::::::::::::::::::::::::::::
    public int numeroProductos (){
    return conProductos;
    }
    public Producto[] getProductos(){
    return misProductos;}                  
    public int posicionProducto (String producto){      
        for (int i = 0; i < conProductos; i++) {
            if(misProductos[i].getIdProducto().equals(producto))
            {return i;}
            }return -1;     
        }
    public String agregarProducto (Producto miProducto){
        if (conProductos == maxProd){
            return "se alcanzo el numero máximo de productos";
        }
        misProductos[conProductos]= miProducto;
        conProductos++;
        return "Producto agregado correctamente";
    }
    public String modificarProducto (Producto miProducto, int pos){
        {
            misProductos[pos].setDescripcion(miProducto.getDescripcion());
            misProductos[pos].setPrecio(miProducto.getPrecio());
                       
        return "Producto agregado correctamente";
        }
        
        }
    public String borrarProducto (int pos){
        
    for (int i = pos; i < conProductos -1; i++) {
        misProductos[i] = misProductos[i++];
    }
        conProductos--;

        return "Producto borrado correctamente";
        }
//::::::::::::::::::::::::::CLIENTES::::::::::::::::::::::::::::::::::
    public int numeroClientes (){
    return conClientes;
    }         
    public Cliente[] getClientes(){
    return misClientes;}                  
    public int posicionCliente (String cliente){      
        for (int i = 0; i < conClientes; i++) {
            if(misClientes[i].getIdCliente().equals(cliente))
            {return i;}
            }return -1;     
        }
    public String agregarCliente (Cliente miCliente){
        if (conClientes == maxCli){
            return "se alcanzo el numero máximo de clientes";
        }
        misClientes[conClientes]= miCliente;
        conClientes++;
        return "Cliente agregado correctamente";
    }
    public String modificarCliente (Cliente miCliente, int pos){
        {
            misClientes[pos].setNombre(miCliente.getNombre());
            misClientes[pos].setDocumento(miCliente.getDocumento());
            misClientes[pos].setTelefono(miCliente.getTelefono());
       return "Cliente agregado correctamente";
        }
        
        }
    public String borrarCliente (int pos){
        
    for (int i = pos; i < conClientes -1; i++) {
        misClientes[i] = misClientes[i++];
    }
        conClientes--;

        return "Cliente borrado correctamente";
        }
    public void grabarTodo(){
    grabarUsuarios();
    grabarClientes();
    grabarProductos();
}
//::::::::::::::::::::::::::DataBase:::::::::::::::::::::::::::::::::::
    public void grabarUsuarios() {
    FileWriter fw = null;
    PrintWriter pw = null;
        try{
        fw= new FileWriter("Data/usuarios.txt");
        pw = new PrintWriter(fw);
            for (int i = 0; i < conUsuarios; i++) {
                pw.println(misUsuarios[i].toString());
            }
        }catch(Exception e1){
            e1.printStackTrace();
        }finally {
            try{
                if (fw != null) fw.close(); 
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    
    }
    public void grabarClientes() {
    FileWriter fw = null;
    PrintWriter pw = null;
        try{
        fw= new FileWriter("Data/clientes.txt");
        pw = new PrintWriter(fw);
            for (int i = 0; i < conClientes; i++) {
                pw.println(misClientes[i].toString());
            }
        }catch(Exception e1){
            e1.printStackTrace();
        }finally {
            try{
                if (fw != null) fw.close(); 
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        
}
    public void grabarProductos() {
    FileWriter fw = null;
    PrintWriter pw = null;
        try{
        fw= new FileWriter("Data/productos.txt");
        pw = new PrintWriter(fw);
            for (int i = 0; i < conProductos; i++) {
                pw.println(misProductos[i].toString());
            }
        }catch(Exception e1){
            e1.printStackTrace();
        }finally {
            try{
                if (fw != null) fw.close(); 
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    
}
//video 30 te hace las cargas a DB juan carlos zuluaga
    public void cargarUsuarios(){
    
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    
    try{
        archivo = new File ("Data/usuarios.txt");
        fr = new FileReader(archivo);
        br = new BufferedReader(fr);
        
        int pos;
        String aux;
        String linea;
        
        String idUsuario;
        String nombre;
        String apellido;
        String clave;
        
        while ((linea=br.readLine())!= null){
            //saco el id del usuairo
            pos = linea.indexOf('|');
            aux = linea.substring(0, pos);
            idUsuario = aux;
            
            linea = linea.substring(pos +1);
        }
                
    }catch (Exception e){
        e.printStackTrace();
    }
            
}
//::::::::::::::::::::::::::::CLAVE:::::::::::::::::::::::::::::::::::
    public void cambioClave(String usuario, String clave){
        for (int i = 0; i < conUsuarios; i++) {
            if (misUsuarios[i].getIdUsuario().equals(usuario)) {
                misUsuarios[i].setClave(clave);
            } 
        }    
    }

















        
}






























