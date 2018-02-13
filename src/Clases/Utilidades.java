
package Clases;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author LAURA
 */
public class Utilidades {
    public static boolean isNumeric (String Cadena){
        try{
            Integer.parseInt(Cadena);
            return true;
        }catch(NumberFormatException nfe) {
            return false;
        }              
    }
    
    public static Date formatDate (String fecha){
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/MM/dd");
        Date aux = null;
        try{
            aux = formatoDelTexto.parse(fecha);
        }catch(Exception ex){
            
        }      
        return aux;
    }
    
    public static String formatDate (Date fecha){
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/MM/dd");
        return formatoDelTexto.format(fecha);
    }
    
    public static int objectToInt(Object Obj) {
        int NumInt = Integer.parseInt(objectToString(Obj)); 
        return NumInt; 
    } 
    
    public static double objectToDouble(Object Obj) { 
        String Str = Obj.toString(); 
        double NumDouble = Double.valueOf(Str).doubleValue(); 
        return NumDouble; 
    } 
    
    public static boolean objectToBoolean(Object Obj) { 
        String CadBooleana = objectToString(Obj); 
        Boolean booleano = new Boolean(CadBooleana); 
        return booleano; 
    } 
    
    public static String objectToString(Object Obj) { 
        String Str = ""; 
        if (Obj != null) { 
            Str = Obj.toString(); 
        } return Str; 
    }
    
    
    
    
    
}
