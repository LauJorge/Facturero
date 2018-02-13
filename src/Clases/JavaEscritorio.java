package Clases;

import Formulario.frmLogin;

/**
 *
 * @author LAURA
 */
public class JavaEscritorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Datos misDatos = new Datos();
        
        frmLogin miLogin = new  frmLogin();
        miLogin.setDatos(misDatos);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
    }
    
}
