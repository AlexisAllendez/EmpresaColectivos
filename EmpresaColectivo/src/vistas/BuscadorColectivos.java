
package vistas;
import accesoADatos.ColectivoData;
import dashboard.Dashboard;
import entidades.Colectivo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class BuscadorColectivos extends javax.swing.JPanel {
    List<Colectivo> listaCole;
    ColectivoData coleData = new ColectivoData();
    List<Colectivo> listaMatri;
    List<Colectivo> listaMarca;
    List<Colectivo> listaCapac;
    List<Colectivo> listaEspecifica;
    List<Colectivo> listaColeDist;
    List<Colectivo> listaColeDistCap;
    
    public BuscadorColectivos() {
         initComponents();
       
        listaCole = coleData.listarColectivos();
        listaColeDist = coleData.listaColeDist();
        listaColeDistCap = coleData.listaColeDistCap();
        armarCabecera();
        llenarTabla();
        llenarComboMatricula();
        llenarComboMarca();
        llenarComboCapac();

    }

    private DefaultTableModel modeloTabla = new DefaultTableModel(){
        public boolean isCellEditable(int i, int i1) {

            return true
                    ;

        }
     };
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLColectivo = new javax.swing.JLabel();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jLMatricula = new javax.swing.JLabel();
        jLMarca = new javax.swing.JLabel();
        jLCapacidad = new javax.swing.JLabel();
        jCBMatricula = new javax.swing.JComboBox<>();
        jCBMarca = new javax.swing.JComboBox<>();
        jCBCapacidad = new javax.swing.JComboBox<>();
        Limpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(772, 397));
        setPreferredSize(new java.awt.Dimension(817, 602));

        jScrollPane1.setBackground(new java.awt.Color(0, 51, 51));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(0, 51, 51));

        jTable.setBackground(new java.awt.Color(255, 255, 255));
        jTable.setBorder(new javax.swing.border.MatteBorder(null));
        jTable.setForeground(new java.awt.Color(0, 51, 51));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Modelo", "Marca", "Matricula", "Capacidad"
            }
        ));
        jTable.setGridColor(new java.awt.Color(0, 51, 51));
        jTable.setOpaque(false);
        jScrollPane1.setViewportView(jTable);

        jLColectivo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLColectivo.setForeground(new java.awt.Color(51, 51, 51));
        jLColectivo.setText("Colectivos");

        jBModificar.setBackground(new java.awt.Color(255, 255, 255));
        jBModificar.setForeground(new java.awt.Color(102, 102, 102));
        jBModificar.setText("Modificar");
        jBModificar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jBModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBModificarMouseExited(evt);
            }
        });
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
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

        jLMatricula.setForeground(new java.awt.Color(102, 102, 102));
        jLMatricula.setText("Matricula");

        jLMarca.setForeground(new java.awt.Color(102, 102, 102));
        jLMarca.setText("Marca");

        jLCapacidad.setForeground(new java.awt.Color(102, 102, 102));
        jLCapacidad.setText("Capacidad");

        jCBMatricula.setBackground(new java.awt.Color(255, 255, 255));
        jCBMatricula.setForeground(new java.awt.Color(102, 102, 102));

        jCBMarca.setBackground(new java.awt.Color(255, 255, 255));
        jCBMarca.setForeground(new java.awt.Color(102, 102, 102));

        jCBCapacidad.setBackground(new java.awt.Color(255, 255, 255));
        jCBCapacidad.setForeground(new java.awt.Color(102, 102, 102));

        Limpiar.setBackground(new java.awt.Color(255, 255, 255));
        Limpiar.setForeground(new java.awt.Color(102, 102, 102));
        Limpiar.setText("Limpiar");
        Limpiar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        Limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LimpiarMouseExited(evt);
            }
        });
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLMarca)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jCBMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLCapacidad)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCBCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMatricula)
                    .addComponent(jLMarca)
                    .addComponent(jLCapacidad)
                    .addComponent(jCBMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBModificarMouseEntered
        jBModificar.setBackground(new Color(0, 102, 102));
        jBModificar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBModificarMouseEntered

    private void jBModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBModificarMouseExited
        jBModificar.setBackground(new Color(255, 255, 255));
        jBModificar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBModificarMouseExited

    private void jBEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminarMouseEntered
        jBEliminar.setBackground(new Color(0, 102, 102));
        jBEliminar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBEliminarMouseEntered

    private void jBEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminarMouseExited
        jBEliminar.setBackground(new Color(255, 255, 255));
        jBEliminar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBEliminarMouseExited

    private void jBBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarMouseEntered
        jBBuscar.setBackground(new Color(0, 102, 102));
        jBBuscar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBBuscarMouseEntered

    private void jBBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarMouseExited
        jBBuscar.setBackground(new Color(255, 255, 255));
        jBBuscar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBBuscarMouseExited

    private void LimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseEntered
           Limpiar.setBackground(new Color(0, 102, 102));
        Limpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_LimpiarMouseEntered

    private void LimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseExited
         Limpiar.setBackground(new Color(255, 255, 255));
        Limpiar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_LimpiarMouseExited

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        int filaSeleccionada = jTable.getSelectedRow();
        if (filaSeleccionada != -1) {
            String matricula = (String) jTable.getValueAt(filaSeleccionada, 3); // Obtener la matrícula actual
            String nuevaMatricula = JOptionPane.showInputDialog(null, "Modificar matrícula:", matricula);

            if (nuevaMatricula != null && !nuevaMatricula.isEmpty()) {
                // Actualizar la matrícula en la tabla y en la base de datos
                jTable.setValueAt(nuevaMatricula, filaSeleccionada, 3); // Actualizar en la tabla
                int idColectivo = (int) jTable.getValueAt(filaSeleccionada, 0);
                String marca = (String) jTable.getValueAt(filaSeleccionada, 1);
                String modelo = (String) jTable.getValueAt(filaSeleccionada, 2);
                int capacidad = (int) jTable.getValueAt(filaSeleccionada, 4);

                Colectivo colectivo = new Colectivo(idColectivo, nuevaMatricula, marca, modelo, capacidad);
                coleData.modificarColectivo(colectivo); // Actualizar en la base de datos
            } else {
                JOptionPane.showMessageDialog(null, "La matrícula no puede estar vacía");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un colectivo para modificar");


    }//GEN-LAST:event_jBModificarActionPerformed
    }
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        borrarFilas();

        String matricula = (String) jCBMatricula.getSelectedItem();
        String marca = (String) jCBMarca.getSelectedItem();
        String capac = (String) jCBCapacidad.getSelectedItem();

        if (capac == null && marca == null) {
            buscarTabla(matricula);
        } else if (marca == null && matricula == null) {
            buscarTablaCapac(capac);
        } else if (matricula == null && capac == null) {
            buscarTablaMarca(marca);
        } else if (marca != null && matricula != null && capac != null) {
            buscarTablaEspec(matricula, marca, capac);

        } else {
            JOptionPane.showMessageDialog(null, "No se encuentra el colectivo ");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int filaSeleccionada = jTable.getSelectedRow();
        if (filaSeleccionada != -1) {
            int matricula = (Integer) jTable.getValueAt(filaSeleccionada, 0);
            coleData.eliminarColectivo(matricula);
              
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un colectivo para eliminar");
        }
        
        limpiarCampos();
        llenarTabla();

    }//GEN-LAST:event_jBEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JComboBox<String> jCBCapacidad;
    private javax.swing.JComboBox<String> jCBMarca;
    private javax.swing.JComboBox<String> jCBMatricula;
    private javax.swing.JLabel jLCapacidad;
    private javax.swing.JLabel jLColectivo;
    private javax.swing.JLabel jLMarca;
    private javax.swing.JLabel jLMatricula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables


    public void limpiarCampos(){
       
        llenarTabla();
        jCBMarca.setSelectedItem(null);
        jCBMatricula.setSelectedItem(null);
        jCBCapacidad.setSelectedItem(null);

        
    }
    
    public void llenarComboMatricula() {
    for (Colectivo c : listaCole){
        jCBMatricula.addItem(c.getMatricula());
    }
    jCBMatricula.setSelectedIndex(-1);
    }
    
    private void llenarComboMarca(){
        for (Colectivo c : listaColeDist) {
            jCBMarca.addItem(c.getMarca());
        }
        jCBMarca.setSelectedIndex(-1);
    }
    
    private void llenarComboCapac(){
        for(Colectivo c : listaColeDistCap) {
            jCBCapacidad.addItem(""+c.getCapacidad());
        }
          jCBCapacidad.setSelectedIndex(-1);
    }
    
     private void armarCabecera() {  
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Marca");
        modeloTabla.addColumn("Modelo");
        modeloTabla.addColumn("Matricula");
        modeloTabla.addColumn("Capacidad");
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
        listaCole = coleData.listarColectivos();
        for (Colectivo c : listaCole) {
            modeloTabla.addRow(new Object[] {c.getIdColectivo(), c.getMarca(), c.getModelo(), c.getMatricula(), c.getCapacidad()});
        }
    }
    
    private void buscarTabla(String matri) {
        listaMatri = new ArrayList();
        listaMatri.addAll(coleData.listarColePorMatricula(matri));
        for (Colectivo c : listaMatri) {
            modeloTabla.addRow(new Object[] {c.getIdColectivo(), c.getMarca(), c.getModelo(), c.getMatricula(), c.getCapacidad()});
            
        }
    }
        
    private void buscarTablaMarca(String marca) {
        listaMarca = new ArrayList();
        listaMarca.addAll(coleData.listarColePorMarca(marca));
        for (Colectivo c : listaMarca) {
            modeloTabla.addRow(new Object[] {c.getIdColectivo(), c.getMarca(), c.getModelo(), c.getMatricula(), c.getCapacidad()});
            
        }
}
    private void buscarTablaCapac(String cap) {
        listaCapac = new ArrayList();
        listaCapac.addAll(coleData.listarColePorCapaci(Integer.parseInt(cap)));
        for (Colectivo c : listaCapac) {
            modeloTabla.addRow(new Object[] {c.getIdColectivo(), c.getMarca(), c.getModelo(), c.getMatricula(), c.getCapacidad()});
            
        }
    }
    
    private void buscarTablaEspec(String matri, String marca, String cap) {
        listaEspecifica = new ArrayList<>();
        listaEspecifica.addAll(coleData.listarColePorEspec(matri, marca, Integer.parseInt(cap)));
        if (listaEspecifica.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encuentra el colectivo ");
        } else {
            for (Colectivo c : listaEspecifica) {
                modeloTabla.addRow(new Object[] {c.getIdColectivo(), c.getMarca(), c.getModelo(), c.getMatricula(), c.getCapacidad()});
            }
        
}
}


}
