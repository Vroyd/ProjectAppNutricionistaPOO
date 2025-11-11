package Forms;

import java.util.Arrays;
import java.util.List;
import javax.swing.*;
<<<<<<< HEAD
import Controller.BottonController;
import Entities.Nutricionista;
import Utils.CargarDatosNutricionista;
import static java.awt.image.ImageObserver.WIDTH;
=======
import Controller.CargarDatosNutricionistas;
import Entities.Nutricionista;
import javax.swing.table.DefaultTableModel;
>>>>>>> a7bfe15d75b2364c879fa03ac26c6d92c990af2a

public class FormNutricionista extends javax.swing.JFrame {
    
    private CargarDatosNutricionistas controlador;
    
    public FormNutricionista() {
        initComponents();
        
        controlador = new CargarDatosNutricionistas(); 
        cargarTablaNutricionistas(); 
        txtid.setEditable(false);
        limpiarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        btnlimpiarcampos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btninsertar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbclientes = new javax.swing.JTable();
        btnmodificar = new javax.swing.JButton();
        btnestadocliente = new javax.swing.JButton();
        btninsertar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("DNI:");

        jLabel6.setText("Telefono:");

        jLabel7.setText("Email:");

        jLabel8.setText("Dirección:");

        btnlimpiarcampos.setText("LIMPIAR CAMPOS");
        btnlimpiarcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarcamposActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnlimpiarcampos, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtid))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(260, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnlimpiarcampos)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btninsertar.setText("INSERTAR");
        btninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarActionPerformed(evt);
            }
        });

        tbclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Nombre", "Apellido", "DNI", "Telefono", "Email", "Direccion", "FechaIngreso"
            }
        ));
        tbclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbclientes);

        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnestadocliente.setText("ACTIVAR/DESACTIVAR");
        btnestadocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnestadoclienteActionPerformed(evt);
            }
        });

        btninsertar1.setText("INICIAR");
        btninsertar1.setToolTipText("");
        btninsertar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btninsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnestadocliente, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(btninsertar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btninsertar1)
                        .addGap(18, 18, 18)
                        .addComponent(btninsertar)
                        .addGap(18, 18, 18)
                        .addComponent(btnmodificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnestadocliente)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
<<<<<<< HEAD
    private void inicializarCampos(){
        campos = Arrays.asList(
            txtnombre,
            txtapellido,
            txtdni,
            txttelefono,
            txtemail,
            txtdireccion,
            txtfecharegistro
        );
=======
    private void cargarTablaNutricionistas() {
    String[] columnas = {
        "ID Nutricionista", "Nombre", "Apellido", "DNI", "Telefono", "Email", "Dirección", "Fecha Registro", "Estado"
    };

    DefaultTableModel modelo = new DefaultTableModel(columnas, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Ninguna celda editable
        }
    };

    for (Nutricionista n : controlador.listarNutricionista()) {
        modelo.addRow(new Object[]{
            n.getId(),
            n.getNombre(),
            n.getApellido(),
            n.getDni(),
            n.getTelefono(),
            n.getEmail(),
            n.getDireccion(),
            n.getFechaRegistro(),
            n.isActivo()
        });
>>>>>>> a7bfe15d75b2364c879fa03ac26c6d92c990af2a
    }

    tbclientes.setModel(modelo);
}

    
    private void btninsertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertar1ActionPerformed
        Forms.FormClientes panelClientes = new Forms.FormClientes();
        panelClientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btninsertar1ActionPerformed

    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed
<<<<<<< HEAD
        Nutricionista nutricionista = CargarDatosNutricionista.cargarYValidarDatos(campos);
        if (nutricionista != null) {
            BottonController.insertarEnTabla(tbclientes, campos);
        }
=======
         String nombre = txtnombre.getText().trim();
        String apellido = txtapellido.getText().trim();
        String dni = txtdni.getText().trim();
        String telefono = txttelefono.getText().trim();
        String email = txtemail.getText().trim();
        String direccion = txtdireccion.getText().trim();

        controlador.crearNutricionista(nombre, apellido, email, telefono, dni, direccion);
        cargarTablaNutricionistas();
>>>>>>> a7bfe15d75b2364c879fa03ac26c6d92c990af2a
    }//GEN-LAST:event_btninsertarActionPerformed

    private void btnlimpiarcamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarcamposActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnlimpiarcamposActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
<<<<<<< HEAD
        int tabla = tbclientes.getSelectedRow();
        
        if(tabla==-1){
            JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.");
            return;
        }
        
        String Nombre = txtnombre.getText().trim();
        String Apellido = txtapellido.getText().trim();
        String DNI = txtdni.getText().trim();
        String Telefono = txttelefono.getText().trim();
        String Email = txtemail.getText().trim();
        String Direccion = txtdireccion.getText().trim();
        String FechaRegistro = txtfecharegistro.getText().trim();
        
        BottonController.modificarNutricionista(tbclientes, WIDTH, Nombre, Apellido, DNI, Telefono, Email, Direccion, FechaRegistro);
=======
        if(txtid.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Seleccione un nutricionista");
        return;
    }

        int id = Integer.parseInt(txtid.getText());
        String nombre = txtnombre.getText().trim();
        String apellido = txtapellido.getText().trim();
        String dni = txtdni.getText().trim();
        String telefono = txttelefono.getText().trim();
        String email = txtemail.getText().trim();
        String direccion = txtdireccion.getText().trim();

        controlador.actualizarNutricionista(id, nombre, apellido, email, telefono, dni, direccion);
        cargarTablaNutricionistas();
>>>>>>> a7bfe15d75b2364c879fa03ac26c6d92c990af2a
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnestadoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnestadoclienteActionPerformed
        int fila = tbclientes.getSelectedRow();
        if(fila == -1) return;

        int id = Integer.parseInt(tbclientes.getValueAt(fila,0).toString());
        boolean estadoActual = Boolean.parseBoolean(tbclientes.getValueAt(fila,8).toString());
        controlador.cambiarEstadoNutricionista(id, !estadoActual);
        cargarTablaNutricionistas();
    }//GEN-LAST:event_btnestadoclienteActionPerformed

    private void tbclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbclientesMouseClicked
        int fila = tbclientes.getSelectedRow();

    if(fila != -1){
        Object idObj = tbclientes.getValueAt(fila, 0);
        if(idObj != null) txtid.setText(idObj.toString());

        Object nombreObj = tbclientes.getValueAt(fila, 1);
        if(nombreObj != null) txtnombre.setText(nombreObj.toString());

        Object apellidoObj = tbclientes.getValueAt(fila, 2);
        if(apellidoObj != null) txtapellido.setText(apellidoObj.toString());

        Object dniObj = tbclientes.getValueAt(fila, 3);
        if(dniObj != null) txtdni.setText(dniObj.toString());

        Object telefonoObj = tbclientes.getValueAt(fila, 4);
        if(telefonoObj != null) txttelefono.setText(telefonoObj.toString());

        Object emailObj = tbclientes.getValueAt(fila, 5);
        if(emailObj != null) txtemail.setText(emailObj.toString());

        Object direccionObj = tbclientes.getValueAt(fila, 6);
        if(direccionObj != null) txtdireccion.setText(direccionObj.toString());
    }
    }//GEN-LAST:event_tbclientesMouseClicked
    
    private void limpiarCampos() {
        txtid.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtdni.setText("");
        txttelefono.setText("");
        txtemail.setText("");
        txtdireccion.setText("");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnestadocliente;
    private javax.swing.JButton btninsertar;
    private javax.swing.JButton btninsertar1;
    private javax.swing.JButton btnlimpiarcampos;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbclientes;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}