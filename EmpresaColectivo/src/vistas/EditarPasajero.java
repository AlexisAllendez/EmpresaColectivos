
package vistas;

import accesoADatos.PasajerosData;
import entidades.Pasajero;
import java.awt.Color;
import javax.swing.JOptionPane;

public class EditarPasajero extends javax.swing.JDialog {

    Pasajero pasajero = null;
    PasajerosData pasa;
    public EditarPasajero(java.awt.Frame parent, boolean modal,String dni) {
        super(parent, modal);
        initComponents();
        pasa = new PasajerosData();
        cargarDatos(dni);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLDNI = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        jLCorreo = new javax.swing.JLabel();
        jLTelefono = new javax.swing.JLabel();
        jBEditar = new javax.swing.JButton();
        jTDNI = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTCorreo = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jLCargaPasajero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLDNI.setForeground(new java.awt.Color(102, 102, 102));
        jLDNI.setText("DNI");

        jLNombre.setForeground(new java.awt.Color(102, 102, 102));
        jLNombre.setText("Nombre");

        jLApellido.setForeground(new java.awt.Color(102, 102, 102));
        jLApellido.setText("Apellido");

        jLCorreo.setForeground(new java.awt.Color(102, 102, 102));
        jLCorreo.setText("Correo");

        jLTelefono.setForeground(new java.awt.Color(102, 102, 102));
        jLTelefono.setText("Telefono");

        jBEditar.setBackground(new java.awt.Color(255, 255, 255));
        jBEditar.setForeground(new java.awt.Color(102, 102, 102));
        jBEditar.setText("Editar");
        jBEditar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jBEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEditarMouseExited(evt);
            }
        });
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jTDNI.setBackground(new java.awt.Color(255, 255, 255));
        jTDNI.setForeground(new java.awt.Color(153, 153, 153));
        jTDNI.setText("Ingrese su DNI");
        jTDNI.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 153)));
        jTDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTDNIMousePressed(evt);
            }
        });

        jTNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTNombre.setForeground(new java.awt.Color(153, 153, 153));
        jTNombre.setText("Ingrese su nombre");
        jTNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 153)));
        jTNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTNombreMousePressed(evt);
            }
        });

        jTApellido.setBackground(new java.awt.Color(255, 255, 255));
        jTApellido.setForeground(new java.awt.Color(153, 153, 153));
        jTApellido.setText("Ingrese su apellido");
        jTApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 153)));
        jTApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTApellidoMousePressed(evt);
            }
        });

        jTCorreo.setBackground(new java.awt.Color(255, 255, 255));
        jTCorreo.setForeground(new java.awt.Color(153, 153, 153));
        jTCorreo.setText("Ingrese su correo electronico");
        jTCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 153)));
        jTCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTCorreoMousePressed(evt);
            }
        });

        jTTelefono.setBackground(new java.awt.Color(255, 255, 255));
        jTTelefono.setForeground(new java.awt.Color(153, 153, 153));
        jTTelefono.setText("Ingrese el numero de su telefono");
        jTTelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 153)));
        jTTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTTelefonoMousePressed(evt);
            }
        });

        jLCargaPasajero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLCargaPasajero.setForeground(new java.awt.Color(51, 51, 51));
        jLCargaPasajero.setText("Editar pasajero");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLCargaPasajero)
                .addGap(307, 307, 307))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDNI)
                    .addComponent(jLNombre)
                    .addComponent(jLApellido)
                    .addComponent(jLCorreo)
                    .addComponent(jLTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTDNI, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)))
                .addGap(197, 197, 197))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLCargaPasajero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDNI)
                    .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLApellido)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCorreo)
                    .addComponent(jTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefono)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEditarMouseEntered
        jBEditar.setBackground(new Color(0, 102, 102));
        jBEditar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBEditarMouseEntered

    private void jBEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEditarMouseExited
        jBEditar.setBackground(new Color(255, 255, 255));
        jBEditar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBEditarMouseExited

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        // TODO add your handling code here:
        if (jTDNI.getText().isEmpty() || jTNombre.getText().isEmpty() || jTApellido.getText().isEmpty() || jTCorreo.getText().isEmpty() || jTTelefono.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos para guardar un Pasajero");
        } else {
            String dni = jTDNI.getText();
            String nombre = jTNombre.getText();
            String apellido = jTApellido.getText();
            String correo = jTCorreo.getText();
            String telefono = jTTelefono.getText();
            boolean estado = true;

            pasajero = new Pasajero(nombre, apellido, dni, correo, telefono,estado);

            new PasajerosData().modificarPasajeroPorDni(pasajero);
            this.dispose();
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jTDNIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDNIMousePressed
        if (jTDNI.getText().equals("Ingrese su DNI")) {
            jTDNI.setText("");
            jTDNI.setForeground(Color.BLACK);
        }
        if (jTNombre.getText().isEmpty()) {
            jTNombre.setText("Ingrese su nombre");
            jTNombre.setForeground(Color.GRAY);
        }
        if (jTApellido.getText().isEmpty()) {
            jTApellido.setText("Ingrese su apellido");
            jTApellido.setForeground(Color.GRAY);
        }
        if (jTCorreo.getText().isEmpty()) {
            jTCorreo.setText("Ingrese su correo electrónico");
            jTCorreo.setForeground(Color.GRAY);
        }
        if (jTTelefono.getText().isEmpty()) {
            jTTelefono.setText("Ingrese el numero de su telefono");
            jTTelefono.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jTDNIMousePressed

    private void jTNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTNombreMousePressed
        if (jTNombre.getText().equals("Ingrese su nombre")) {
            jTNombre.setText("");
            jTNombre.setForeground(Color.BLACK);
        }
        if (jTDNI.getText().isEmpty()) {
            jTDNI.setText("Ingrese su DNI");
            jTDNI.setForeground(Color.GRAY);
        }
        if (jTApellido.getText().isEmpty()) {
            jTApellido.setText("Ingrese su apellido");
            jTApellido.setForeground(Color.GRAY);
        }
        if (jTCorreo.getText().isEmpty()) {
            jTCorreo.setText("Ingrese su correo electronico");
            jTCorreo.setForeground(Color.GRAY);
        }
        if (jTTelefono.getText().isEmpty()) {
            jTTelefono.setText("Ingrese el numero de su telefono");
            jTTelefono.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jTNombreMousePressed

    private void jTApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTApellidoMousePressed
        if (jTApellido.getText().equals("Ingrese su apellido")) {
            jTApellido.setText("");
            jTApellido.setForeground(Color.BLACK);
        }
        if (jTDNI.getText().isEmpty()) {
            jTDNI.setText("Ingrese su DNI");
            jTDNI.setForeground(Color.GRAY);
        }
        if (jTNombre.getText().isEmpty()) {
            jTNombre.setText("Ingrese su nombre");
            jTNombre.setForeground(Color.GRAY);
        }
        if (jTCorreo.getText().isEmpty()) {
            jTCorreo.setText("Ingrese su correo electronico");
            jTCorreo.setForeground(Color.GRAY);
        }
        if (jTTelefono.getText().isEmpty()) {
            jTTelefono.setText("Ingrese el numero de su telefono");
            jTTelefono.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jTApellidoMousePressed

    private void jTCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCorreoMousePressed
        if (jTCorreo.getText().equals("Ingrese su correo electronico")) {
            jTCorreo.setText("");
            jTCorreo.setForeground(Color.BLACK);
        }
        if (jTDNI.getText().isEmpty()) {
            jTDNI.setText("Ingrese su DNI");
            jTDNI.setForeground(Color.GRAY);
        }
        if (jTNombre.getText().isEmpty()) {
            jTNombre.setText("Ingrese su nombre");
            jTNombre.setForeground(Color.GRAY);
        }
        if (jTApellido.getText().isEmpty()) {
            jTApellido.setText("Ingrese su apellido");
            jTApellido.setForeground(Color.GRAY);
        }
        if (jTTelefono.getText().isEmpty()) {
            jTTelefono.setText("Ingrese el numero de su telefono");
            jTTelefono.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jTCorreoMousePressed

    private void jTTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTTelefonoMousePressed
        if (jTTelefono.getText().equals("Ingrese el numero de su telefono")) {
            jTTelefono.setText("");
            jTTelefono.setForeground(Color.BLACK);
        }
        if (jTDNI.getText().isEmpty()) {
            jTDNI.setText("Ingrese su DNI");
            jTDNI.setForeground(Color.GRAY);
        }
        if (jTNombre.getText().isEmpty()) {
            jTNombre.setText("Ingrese su nombre");
            jTNombre.setForeground(Color.GRAY);
        }
        if (jTApellido.getText().isEmpty()) {
            jTApellido.setText("Ingrese su apellido");
            jTApellido.setForeground(Color.GRAY);
        }
        if (jTCorreo.getText().isEmpty()) {
            jTCorreo.setText("Ingrese su correo electronico");
            jTCorreo.setForeground(Color.GRAY);
        }

    }//GEN-LAST:event_jTTelefonoMousePressed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEditar;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLCargaPasajero;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLDNI;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCorreo;
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    // End of variables declaration//GEN-END:variables

 private void limpiarCampos(){
        
            jTDNI.setText("Ingrese su DNI");
        jTDNI.setForeground(Color.gray);
        jTNombre.setText("Ingrese su nombre");
        jTNombre.setForeground(Color.gray);
        jTApellido.setText("Ingrese su apellido");
        jTApellido.setForeground(Color.gray);
        jTCorreo.setText("Ingrese su correo electronico");
        jTCorreo.setForeground(Color.gray);
        jTTelefono.setText("Ingrese el numero de su telefono");
        jTTelefono.setForeground(Color.gray);
    }
 
 private void cargarDatos(String dni) {
        this.pasajero= pasa.buscarPasajeroDNI(dni);
         
     jTDNI.setText(pasajero.getDni());
     jTDNI.setForeground(Color.black);
     jTNombre.setText(pasajero.getNombre());
     jTNombre.setForeground(Color.black);
     jTApellido.setText(pasajero.getApellido());
     jTApellido.setForeground(Color.black);
     jTCorreo.setText(pasajero.getCorreo());
     jTCorreo.setForeground(Color.black);
     jTTelefono.setText(pasajero.getTelefono());
     jTTelefono.setForeground(Color.black);

    }

}
