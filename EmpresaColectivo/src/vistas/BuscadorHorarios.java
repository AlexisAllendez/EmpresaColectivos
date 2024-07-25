/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import accesoADatos.HorarioData;
import accesoADatos.RutaData;
import entidades.Horario;
import entidades.Ruta;
import java.awt.Color;
import java.time.LocalTime;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 54266
 */
public class BuscadorHorarios extends javax.swing.JPanel {

    RutaData rutaData = new RutaData();
    HorarioData horarioData = new HorarioData();
    List<Horario> listadoHorariosXID;
    List<Ruta> listaRutas;
    List<Horario> listadoHorarios;
    List<Horario> listaXhora;
    List<Horario> listaXhorayRuta;

    private DefaultTableModel modeloTabla = new DefaultTableModel() {
        public boolean isCellEditable(int i, int i1) {
            return false;
        }
    };

    public BuscadorHorarios() {
        initComponents();
        armarCabecera();
        listaRutas = rutaData.listarRutas();
        listadoHorarios = horarioData.listarHorarios();
        llenarTablas();
        llenarComboRuta();
        llenarComboHoraSalida();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLRuta = new javax.swing.JLabel();
        jLHorarioSalida = new javax.swing.JLabel();
        jCRuta = new javax.swing.JComboBox<>();
        jCHoraSalida = new javax.swing.JComboBox<>();
        jBBuscar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jLBuscarHorario = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(772, 397));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(817, 602));

        jTable.setBackground(new java.awt.Color(255, 255, 255));
        jTable.setForeground(new java.awt.Color(0, 0, 0));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Salida", "Llegada", "Ruta"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Busqueda de Horarios");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));

        jLRuta.setForeground(new java.awt.Color(102, 102, 102));
        jLRuta.setText("Seleccionar ruta");

        jLHorarioSalida.setForeground(new java.awt.Color(102, 102, 102));
        jLHorarioSalida.setText("Horario de salida");

        jCRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCRutaActionPerformed(evt);
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

        jLBuscarHorario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLBuscarHorario.setForeground(new java.awt.Color(51, 51, 51));
        jLBuscarHorario.setText("Buscar Horario");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLBuscarHorario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLRuta)
                    .addComponent(jLHorarioSalida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jCHoraSalida, 0, 154, Short.MAX_VALUE)
                    .addComponent(jCRuta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83)
                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLBuscarHorario)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLRuta))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLHorarioSalida)
                            .addComponent(jCHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarMouseEntered
        jBBuscar.setBackground(new Color(0, 102, 102));
        jBBuscar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBBuscarMouseEntered

    private void jBBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarMouseExited
        jBBuscar.setBackground(new Color(255, 255, 255));
        jBBuscar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBBuscarMouseExited

    private void jBLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseEntered
        jBLimpiar.setBackground(new Color(0, 102, 102));
        jBLimpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBLimpiarMouseEntered

    private void jBLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseExited
        jBLimpiar.setBackground(new Color(255, 255, 255));
        jBLimpiar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBLimpiarMouseExited

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        borrarComboBox();
        llenarTablas();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
      if (jCRuta.getSelectedIndex() == -1 && jCHoraSalida.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione al menos una ruta o una hora de salida.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (jCRuta.getSelectedIndex() != -1 && jCHoraSalida.getSelectedIndex() == -1) {
        // Solo Ruta seleccionada
        Ruta i = (Ruta) jCRuta.getSelectedItem();
        listadoHorariosXID = horarioData.listarHorariosXRuta(i.getIdRuta());
        llenarComboHoraSalidaXRuta();
        buscarTabla();
    } else if (jCRuta.getSelectedIndex() == -1 && jCHoraSalida.getSelectedIndex() != -1) {
        // Solo Hora de salida seleccionada
        Horario h = (Horario) jCHoraSalida.getSelectedItem();
        listaXhora = horarioData.listarHorariosXSalida(h.getHoraSalida());
        llenarTablaHorarios();
    } else if (jCRuta.getSelectedIndex() != -1 && jCHoraSalida.getSelectedIndex() != -1) {
        // Ambas opciones seleccionadas
        Ruta i = (Ruta) jCRuta.getSelectedItem();
        Horario h = (Horario) jCHoraSalida.getSelectedItem();
        listaXhorayRuta = horarioData.listarHorariosDoble(i.getIdRuta(), h.getHoraSalida());
        llenarTablaDoble();
    }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jCRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCRutaActionPerformed

    private void armarCabecera() {
        modeloTabla.addColumn("Salida");
        modeloTabla.addColumn("Llegada");
        modeloTabla.addColumn("Ruta");
        jTable.setModel(modeloTabla);
    }

    private void borrarFilas() {
        int filas = modeloTabla.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }

    private void llenarTablas() {
        borrarFilas();
        for (Horario x : listadoHorarios) {
            modeloTabla.addRow(new Object[]{x.getHoraSalida(), x.getHoraLLegada(), x.getRuta()});
        }
    }

    public void llenarComboRuta() {
        for (Ruta e : listaRutas) {
            jCRuta.addItem(e);
        }
        jCRuta.setSelectedIndex(-1);
    }

    private void borrarComboBox() {
        jCRuta.setSelectedIndex(-1);
        jCHoraSalida.setSelectedIndex(-1);
    }

    public void llenarComboHoraSalida() {
        borrarComboBox();
        for (Horario s : listadoHorarios) {
            jCHoraSalida.addItem(s);
        }
        jCHoraSalida.setSelectedIndex(-1);
    }

    private void borrarComboBoxHoras() {
        jCHoraSalida.removeAllItems();
    }

    public void verificarYGuardar() {
        if (jCRuta.getSelectedIndex() == -1 || jCHoraSalida.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void llenarComboHoraSalidaXRuta() {
        borrarComboBoxHoras();
        for (Horario s : listadoHorariosXID) {
            jCHoraSalida.addItem(s);
        }
        jCHoraSalida.setSelectedIndex(-1);
    }

    public void buscarTabla() {
        borrarFilas();
        for (Horario x : listadoHorariosXID) {
            modeloTabla.addRow(new Object[]{x.getHoraSalida(), x.getHoraLLegada(), x.getRuta()});
        }
    }

    private void llenarTablaHorarios() {
        borrarFilas();
        for (Horario x : listaXhora) {
            modeloTabla.addRow(new Object[]{x.getHoraSalida(), x.getHoraLLegada(), x.getRuta()});
        }
    }
    
    private void llenarTablaDoble(){
        borrarFilas();
        for (Horario x : listaXhorayRuta) {
                modeloTabla.addRow(new Object[]{x.getHoraSalida(), x.getHoraLLegada(), x.getRuta()});
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JComboBox<Horario> jCHoraSalida;
    private javax.swing.JComboBox<Ruta> jCRuta;
    private javax.swing.JLabel jLBuscarHorario;
    private javax.swing.JLabel jLHorarioSalida;
    private javax.swing.JLabel jLRuta;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
