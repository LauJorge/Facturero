package Formulario;

import Clases.Datos;
import Clases.Opcion;
import Clases.Utilidades;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LAURA
 */
public class frmFactura extends javax.swing.JInternalFrame {

    private Datos misDatos;
    private DefaultTableModel miTabla;

    public void setDatos(Datos misDatos){
        this.misDatos = misDatos; 
    }
    public frmFactura() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox();
        cmbProducto = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtTotalCantidad = new javax.swing.JTextField();
        txtTotalValor = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEliminarTodo = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();

        setTitle("Nueva Factura");
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

        jLabel1.setText("Fecha");

        txtFecha.setEnabled(false);

        jLabel2.setText("Cliente");

        jLabel3.setText("Producto");

        jLabel4.setText("Cantidad");

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDetalle);

        jLabel5.setText("Totales");

        txtTotalCantidad.setEnabled(false);

        txtTotalValor.setEnabled(false);

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/003-plus.png"))); // NOI18N
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/002-minus.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEliminarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/009-rubbish.png"))); // NOI18N
        btnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoActionPerformed(evt);
            }
        });

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/014-check.png"))); // NOI18N
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGrabar)
                            .addComponent(jLabel4)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // cargar clientes
        Opcion opc = new Opcion("NA", "Seleccione un cliente");
        cmbCliente.addItem(opc);
        for (int i = 0; i < misDatos.numeroClientes(); i++) {
            opc = new Opcion(
                    misDatos.getClientes()[i].getIdCliente(),
                    misDatos.getClientes()[i].getNombre());
            cmbCliente.addItem(opc);
        }
         // cargar productos
        opc = new Opcion("NA", "Seleccione un producto");
        cmbProducto.addItem(opc);
        for (int i = 0; i < misDatos.numeroProductos(); i++) {
            opc = new Opcion(
                    misDatos.getProductos()[i].getIdProducto(),
                    misDatos.getProductos()[i].getDescripcion());
            cmbProducto.addItem(opc);
        }
        //cargo la fecha del sistema
        //txtFecha.setText(new Date());
        //totales
        txtTotalCantidad.setText("0");
        txtTotalValor.setText("0"); 
        llenarTabla();
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if (cmbProducto.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un producto");
            cmbProducto.requestFocusInWindow();
            return;
        }
        if (txtCantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe escribir una cantidad");
            txtCantidad.requestFocusInWindow();
            return;
        }
        if (cmbCliente.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un cliente");
            cmbCliente.requestFocusInWindow();
            return;
        }
        int cantidad = Integer.parseInt(txtCantidad.getText());
        int precio = 0;
        int pos = misDatos.posicionProducto(((Opcion)cmbProducto.getSelectedItem()).getValor());
        String registro[] = new String[5];
        registro[0] = misDatos.getProductos()[pos].getIdProducto();
        registro[1] = misDatos.getProductos()[pos].getDescripcion();
        registro[2] = ""+misDatos.getProductos()[pos].getPrecio();
        registro[3] = ""+ cantidad;
        registro[4] = ""+(cantidad * misDatos.getProductos()[pos].getPrecio());

        miTabla.addRow(registro);
        totales();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
            JOptionPane.showMessageDialog(rootPane, "Facturar guardada");
            limpiarTabla ();
            totales();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (cmbProducto.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un producto");
            cmbProducto.requestFocusInWindow();
            return;
        }    
        
        try{
            DefaultTableModel modelo = (DefaultTableModel) tblDetalle.getModel();
            int filas = tblDetalle.getRowCount();
            for (int i = 0; i < filas; i++) {
                String idTabla = Utilidades.objectToString(tblDetalle.getValueAt(i, 0));
                String idCombo = ((Opcion)cmbProducto.getSelectedItem()).getValor();
                if (idTabla.equals(idCombo)) {
                    modelo.removeRow(i);
                    totales();
                    return;
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoActionPerformed
        int rta = JOptionPane.showConfirmDialog(rootPane, 
                "Está seguro de querer borrar la factura?");
        if (rta !=0) {
            return;
        }
        
        limpiarTabla ();
        totales();
    }//GEN-LAST:event_btnEliminarTodoActionPerformed
    
    private void llenarTabla(){
        String titulos[]= {"Codigo de Producto", "Descripción", "Precio", "Cantidad", "Valor"};
        String registro[]= new String[5];
        miTabla = new DefaultTableModel(null, titulos);
        tblDetalle.setModel(miTabla);
        
        DefaultTableCellRenderer tcr  = new DefaultTableCellRenderer ();
        tcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tblDetalle.getColumnModel().getColumn(2).setCellRenderer(tcr);
        tblDetalle.getColumnModel().getColumn(3).setCellRenderer(tcr);
        tblDetalle.getColumnModel().getColumn(4).setCellRenderer(tcr);
        
    }

    private void totales (){
        int num = tblDetalle.getRowCount();
        int sumCant = 0; 
        int sumVal = 0;
        for (int i = 0; i < num; i++) {
            sumCant += Utilidades.objectToInt(tblDetalle.getValueAt(i, 3));
            sumVal += Utilidades.objectToInt(tblDetalle.getValueAt(i, 4));
        }
        txtTotalCantidad.setText("" + sumCant);
        txtTotalValor.setText("" + sumVal);
    }
    
    private void limpiarTabla (){
        try{
            DefaultTableModel modelo = (DefaultTableModel) tblDetalle.getModel();
            int filas = tblDetalle.getRowCount();
            for (int i = 0; i < filas; i++) {
                modelo.removeRow(0);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarTodo;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JComboBox cmbCliente;
    private javax.swing.JComboBox cmbProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtTotalCantidad;
    private javax.swing.JTextField txtTotalValor;
    // End of variables declaration//GEN-END:variables

  


}
