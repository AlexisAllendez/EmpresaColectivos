
package vistas;

import accesoADatos.PasajerosData;
import entidades.Pasajeros;
import java.awt.Color;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class buscarPasajeros extends javax.swing.JPanel {

    Pasajeros pasajero = null;
    List<Pasajeros> listaPasajeroDni;
    List<Pasajeros> listaPasajero;
    PasajerosData pasajeroData = new PasajerosData();

 
    public buscarPasajeros() {
        initComponents();
        listaPasajero = pasajeroData.listarPasajeros();
        jLBusquedaPasajero.requestFocusInWindow();
        armarCabecera();
        llenarTabla();
    }

    private DefaultTableModel modeloTabla = new DefaultTableModel() {
        public boolean isCellEditable(int i, int i1) {

            return true;

        }
    };

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLBusquedaPasajero = new javax.swing.JLabel();
        jLDNI = new javax.swing.JLabel();
        jTDNI = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBVerTodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jBLimpiar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(811, 466));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        jPanel5.setPreferredSize(new java.awt.Dimension(817, 472));

        jLBusquedaPasajero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLBusquedaPasajero.setForeground(new java.awt.Color(51, 51, 51));
        jLBusquedaPasajero.setText("Busqueda de pasajero");

        jLDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLDNI.setForeground(new java.awt.Color(102, 102, 102));
        jLDNI.setText("DNI");

        jTDNI.setBackground(new java.awt.Color(255, 255, 255));
        jTDNI.setForeground(new java.awt.Color(153, 153, 153));
        jTDNI.setText("Ingrese su DNI");
        jTDNI.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 153)));
        jTDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTDNIMousePressed(evt);
            }
        });

        jBBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jBBuscar.setForeground(new java.awt.Color(102, 102, 102));
        jBBuscar.setText("Buscar");
        jBBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jBBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBBuscarMouseExited(evt);
            }
        });
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jBVerTodos.setBackground(new java.awt.Color(255, 255, 255));
        jBVerTodos.setForeground(new java.awt.Color(102, 102, 102));
        jBVerTodos.setText("Ver todos");
        jBVerTodos.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jBVerTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVerTodosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVerTodosMouseExited(evt);
            }
        });
        jBVerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerTodosActionPerformed(evt);
            }
        });

        jTable.setBackground(new java.awt.Color(255, 255, 255));
        jTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jBLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setForeground(new java.awt.Color(102, 102, 102));
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jBLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBLimpiarMouseExited(evt);
            }
        });
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

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

        jBEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jBEliminar.setForeground(new java.awt.Color(102, 102, 102));
        jBEliminar.setText("Eliminar");
        jBEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jBEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEliminarMouseExited(evt);
            }
        });
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBVerTodos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBVerTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLBusquedaPasajero)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLDNI)
                .addGap(78, 78, 78)
                .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLBusquedaPasajero)
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDNI)
                    .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarMouseExited
        jBBuscar.setBackground(new Color(255, 255, 255));
        jBBuscar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBBuscarMouseExited

    private void jBBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarMouseEntered
        jBBuscar.setBackground(new Color(0, 102, 102));
        jBBuscar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBBuscarMouseEntered

    private void jTDNIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDNIMousePressed
        if (jTDNI.getText().equals("Ingrese su DNI")) {
            jTDNI.setText("");
            jTDNI.setForeground(Color.BLACK);
        }


    }//GEN-LAST:event_jTDNIMousePressed

    private void jBEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminarMouseExited
        jBEliminar.setBackground(new Color(255, 255, 255));
        jBEliminar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBEliminarMouseExited

    private void jBEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminarMouseEntered
        jBEliminar.setBackground(new Color(0, 102, 102));
        jBEliminar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBEliminarMouseEntered

    private void jBEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEditarMouseExited
        jBEditar.setBackground(new Color(255, 255, 255));
        jBEditar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBEditarMouseExited

    private void jBEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEditarMouseEntered
        jBEditar.setBackground(new Color(0, 102, 102));
        jBEditar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBEditarMouseEntered

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        llenarTabla();

    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseExited
        jBLimpiar.setBackground(new Color(255, 255, 255));
        jBLimpiar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBLimpiarMouseExited

    private void jBLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseEntered
        jBLimpiar.setBackground(new Color(0, 102, 102));
        jBLimpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBLimpiarMouseEntered

    private void jBVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerTodosActionPerformed
        borrarFilas();
        llenarTabla();
    }//GEN-LAST:event_jBVerTodosActionPerformed

    private void jBVerTodosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVerTodosMouseExited
        jBVerTodos.setBackground(new Color(255, 255, 255));
        jBVerTodos.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBVerTodosMouseExited

    private void jBVerTodosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVerTodosMouseEntered
        jBVerTodos.setBackground(new Color(0, 102, 102));
        jBVerTodos.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBVerTodosMouseEntered

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jTable.getSelectedRow();
        if (filaSeleccionada != -1) {
            String dni = (String) jTable.getValueAt(filaSeleccionada, 0);
            String nombre = (String) jTable.getValueAt(filaSeleccionada, 1);
            String apellido = (String) jTable.getValueAt(filaSeleccionada, 2);
            String correo = (String) jTable.getValueAt(filaSeleccionada, 3);
            String telefono = (String) jTable.getValueAt(filaSeleccionada, 4);
            boolean estado = true;
            Pasajeros p1 = new Pasajeros(nombre, apellido, dni, correo, telefono, estado);
            pasajeroData.eliminarPasajerosPorDni(p1);

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un pasajero para eliminar");
        }
        limpiarCampos();
        llenarTabla();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        String dni = jTDNI.getText();
        buscarpasajero(dni);
        limpiarCampos();
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
       
             //controla que no esta vacia
        if (jTable.getRowCount() > 0) {
            // se controla que se selecciono una categoria
            if (jTable.getSelectedRow() != -1) {
                //Obtengo id de la categoria
                String dni =(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 0)));
                
                Frame f = JOptionPane.getFrameForComponent(this);
                EditarPasajero v1 = new EditarPasajero(f, true,dni);
                v1.setLocationRelativeTo(null);
                v1.setVisible(true);
            }
            else{
            JOptionPane.showMessageDialog(null, "No se selecciono ningun pasajero ");
            }
         
        }
        else{
             JOptionPane.showMessageDialog(null, "No hay nada para eliminar en la tabla");
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void limpiarCampos() {

        jTDNI.setText("");

    }

    private void armarCabecera() {
        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Telefono");
        jTable.setModel(modeloTabla);
    }

    private void borrarFilas() {
        int filas = modeloTabla.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }

    private void llenarTabla() {
        borrarFilas();
        PasajerosData pasajeroData = new PasajerosData();
        listaPasajero = pasajeroData.listarPasajeros();
        for (Pasajeros c : listaPasajero) {
            modeloTabla.addRow(new Object[]{c.getDni(), c.getNombre(), c.getApellido(), c.getCorreo(), c.getTelefono()});
        }
    }

    private void buscarpasajero(String dni) {
        listaPasajeroDni = new ArrayList();
        listaPasajeroDni.addAll(pasajeroData.listarPasajerosPorDni(dni));
        if (listaPasajeroDni.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encuentra el Pasajero/a");
            llenarTabla();
        } else {
            for (Pasajeros pasajeros : listaPasajeroDni) {
                modeloTabla.addRow(new Object[]{pasajeros.getDni(), pasajeros.getNombre(), pasajeros.getApellido(), pasajeros.getCorreo(), pasajeros.getTelefono()});
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBVerTodos;
    private javax.swing.JLabel jLBusquedaPasajero;
    private javax.swing.JLabel jLDNI;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
