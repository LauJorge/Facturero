
package Formulario;

import Clases.Datos;
import Clases.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LAURA
 */
public class frmUsuarios extends javax.swing.JInternalFrame {

    private Datos misDatos;
    private int usuAct = 0;
    private boolean nuevo = false;
    private DefaultTableModel miTabla;
            
    public void setDatos(Datos misDatos){
        this.misDatos = misDatos;
    }
    
    public frmUsuarios() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtIDUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        txtConfirmaClave = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnPrimero = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnUltimo1 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setTitle("Usuarios");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("ID Usuario *:");

        txtIDUsuario.setEnabled(false);

        jLabel2.setText("Nombre*:");

        txtNombre.setEnabled(false);

        jLabel3.setText("Apellido*:");

        txtApellido.setEnabled(false);

        jLabel4.setText("Contraseña*:");

        txtClave.setEnabled(false);

        txtConfirmaClave.setEnabled(false);

        jLabel5.setText("Confirma Contraseña*:");

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Perfil", "Admin", "Empleado" }));
        cmbPerfil.setEnabled(false);

        jLabel6.setText("Tipo Usuario*:");

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/005-arrows.png"))); // NOI18N
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/004-rewind-button.png"))); // NOI18N
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/003-previous-track.png"))); // NOI18N
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnUltimo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/006-arrows-1.png"))); // NOI18N
        btnUltimo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimo1ActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/008-loupe.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/009-rubbish.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diskette.png"))); // NOI18N
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/create-group-button.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/013-cancel.png"))); // NOI18N
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("*Campos Obligatorios");

        tblTabla.setBackground(new java.awt.Color(204, 204, 204));
        tblTabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblTabla.setForeground(new java.awt.Color(102, 102, 255));
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblTabla.setSelectionForeground(new java.awt.Color(102, 102, 255));
        jScrollPane2.setViewportView(tblTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtConfirmaClave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(27, 27, 27)
                                .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtApellido)
                            .addComponent(txtNombre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrimero)
                                .addGap(5, 5, 5)
                                .addComponent(btnAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSiguiente))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBorrar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUltimo1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(txtConfirmaClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUltimo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditar)
                            .addComponent(btnGuardar)
                            .addComponent(btnBorrar)
                            .addComponent(btnBuscar)))
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        usuAct = 0;
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String usuario = JOptionPane.showInputDialog("Ingrese código de Usuario");
       if (usuario.equals("")){
           return;
       }
       int pos = misDatos.posicionUsuario(usuario);
       if(pos==-1){
           JOptionPane.showMessageDialog(rootPane, "Usuario no existe");
       }
           
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int rta = JOptionPane.showConfirmDialog(rootPane, "está seguro de querer borrar el registro?");
        if(rta != 0) 
        {
            return;
        }
        String msg;
        msg = misDatos.borrarUsuario(usuAct);
        JOptionPane.showMessageDialog(rootPane, msg);
        usuAct = 0;
        mostrarRegistro();
        llenarTabla();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtIDUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debee escribir el ID");
            txtIDUsuario.requestFocusInWindow();
            return;
        }
        if(cmbPerfil.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Debe Seleccionar un perfil");
            cmbPerfil.requestFocusInWindow();
            return;
        }
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe escribir un nombre (s)");
            txtNombre.requestFocusInWindow();
            return;
        }
        if(txtApellido.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe excribir un apellido");
            txtApellido.requestFocusInWindow();
            return;
        }
        String clave = new String (txtClave.getPassword());
        String confirmacion = new String (txtConfirmaClave.getPassword());
                
        if(clave.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe escribir una contraseña");
            txtClave.requestFocusInWindow();
            txtConfirmaClave.setText("");
            txtClave.setText("");
            return;
        }
        if(confirmacion.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe validar la contraseña");
            txtConfirmaClave.requestFocusInWindow();
            txtConfirmaClave.setText("");
            txtClave.setText("");
            return;

        }
         if(!clave.equals(confirmacion)){
            JOptionPane.showMessageDialog(rootPane, "Constraseña y confirmación son son iguales");
            txtConfirmaClave.setText("");
            txtClave.setText("");
            txtClave.requestFocusInWindow();
            return;
        }
         //validar q exista el usuario
         int pos = misDatos.posicionUsuario(txtIDUsuario.getText());
         if(nuevo){
            if(pos != -1){
                JOptionPane.showMessageDialog(rootPane, "Usuario Ya existe");
                txtIDUsuario.requestFocusInWindow();
                return;
             }
         }else {
            if(pos == -1){
                JOptionPane.showMessageDialog(rootPane, "Usuario NO existe");
                txtIDUsuario.requestFocusInWindow();
                return;
             }
         }
         
        Usuario miUsuario = new Usuario(
                txtIDUsuario.getText(), 
                txtNombre.getText(), 
                txtApellido.getText(),
                clave,
                cmbPerfil.getSelectedIndex());
        
        String msg;
        if (nuevo){
        msg = misDatos.agregarUsuario(miUsuario);
        }else {
        msg = misDatos.modificarUsuario(miUsuario, pos);
        }
        
        JOptionPane.showMessageDialog(rootPane, msg);
        
        btnPrimero.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnSiguiente.setEnabled(true);
        btnUltimo1.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnBorrar.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        txtIDUsuario.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtClave.setEnabled(false);
        txtConfirmaClave.setEnabled(false);
        cmbPerfil.setEnabled(false);
        
        llenarTabla();
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnPrimero.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnSiguiente.setEnabled(false);
        btnUltimo1.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        txtIDUsuario.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtClave.setEnabled(true);
        txtConfirmaClave.setEnabled(true);
        cmbPerfil.setEnabled(true);
        
        txtIDUsuario.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtClave.setText("");
        txtConfirmaClave.setText("");
        cmbPerfil.setSelectedIndex(0);
        
        nuevo = true;
        
        txtIDUsuario.requestFocusInWindow();

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnPrimero.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnSiguiente.setEnabled(true);
        btnUltimo1.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnBorrar.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        txtIDUsuario.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtClave.setEnabled(false);
        txtConfirmaClave.setEnabled(false);
        cmbPerfil.setEnabled(false);
        
        txtNombre.setText("");
        txtApellido.setText("");
        txtClave.setText("");
        txtConfirmaClave.setText("");
        cmbPerfil.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnPrimero.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnSiguiente.setEnabled(false);
        btnUltimo1.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtClave.setEnabled(true);
        txtConfirmaClave.setEnabled(true);
        cmbPerfil.setEnabled(true);
        nuevo = false;
        txtNombre.requestFocusInWindow();
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        mostrarRegistro();
        llenarTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnUltimo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimo1ActionPerformed
        usuAct = misDatos.numeroUsuarios()-1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimo1ActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        usuAct--;
        if (usuAct==-1){
            usuAct = misDatos.numeroUsuarios()-1;
        }mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        usuAct++;
        if (usuAct==misDatos.numeroUsuarios() ){
        usuAct = 0;
        }mostrarRegistro();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void mostrarRegistro(){
        txtIDUsuario.setText(misDatos.getUsuarios()[usuAct].getIdUsuario());
        txtNombre.setText(misDatos.getUsuarios()[usuAct].getNombre());
        txtApellido.setText(misDatos.getUsuarios()[usuAct].getApellido());
        txtClave.setText(misDatos.getUsuarios()[usuAct].getClave());
        txtConfirmaClave.setText(misDatos.getUsuarios()[usuAct].getClave());
        cmbPerfil.setSelectedIndex(misDatos.getUsuarios()[usuAct].getPerfil());

    }
    private void llenarTabla(){
        String titulos[]= {"ID Usuario", "Nombre", "Apellido", "Perfil"};
        String registro[]= new String[4];
        miTabla = new DefaultTableModel(null, titulos);
        for (int i = 0; i < misDatos.numeroUsuarios(); i++) {
            registro[0]= misDatos.getUsuarios()[i].getIdUsuario();
            registro[1]= misDatos.getUsuarios()[i].getNombre();
            registro[2]= misDatos.getUsuarios()[i].getApellido();
            registro[3]= perfil(misDatos.getUsuarios()[i].getPerfil());
            miTabla.addRow(registro);
            
        }
        tblTabla.setModel(miTabla);
    }
    
    private String perfil(int idPerfil){
        if(idPerfil == 1){
        return "Administrador";
        }else{
        return "Empleado";
        }
    }
            
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo1;
    private javax.swing.JComboBox cmbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JPasswordField txtConfirmaClave;
    private javax.swing.JTextField txtIDUsuario;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
