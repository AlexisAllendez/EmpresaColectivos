/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import accesoADatos.HorarioData;
import accesoADatos.RutaData;
import entidades.Horarios;
import entidades.Ruta;
import java.awt.Color;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

public class cargarHorarios extends javax.swing.JPanel {

    ArrayList<Ruta> listaRutas;
    Horarios horario = null;
    Ruta ruta;
    LocalTime horaSalida;
    LocalTime horaLlegada;

    public cargarHorarios() {
        initComponents();
        formatoSpinner();
        jCRuta.removeAllItems();
        listaRutas = new RutaData().listarRutas();
        llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLRuta = new javax.swing.JLabel();
        jCRuta = new javax.swing.JComboBox<>();
        jLHorarioSalida = new javax.swing.JLabel();
        jSPHorarioSalida = new javax.swing.JSpinner();
        jLHorarioLlegada = new javax.swing.JLabel();
        jTHorarioLlegada = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBLimpiar2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(817, 602));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));

        jLRuta.setForeground(new java.awt.Color(102, 102, 102));
        jLRuta.setText("Ruta ");

        jCRuta.setBackground(new java.awt.Color(255, 255, 255));
        jCRuta.setForeground(new java.awt.Color(102, 102, 102));
        jCRuta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jCRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCRutaActionPerformed(evt);
            }
        });

        jLHorarioSalida.setBackground(new java.awt.Color(51, 51, 51));
        jLHorarioSalida.setForeground(new java.awt.Color(102, 102, 102));
        jLHorarioSalida.setText("Horario de salida ");

        jSPHorarioSalida.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jSPHorarioSalida.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSPHorarioSalidaStateChanged(evt);
            }
        });

        jLHorarioLlegada.setForeground(new java.awt.Color(102, 102, 102));
        jLHorarioLlegada.setText("Horario Llegada");

        jTHorarioLlegada.setEditable(false);
        jTHorarioLlegada.setBackground(new java.awt.Color(255, 255, 255));
        jTHorarioLlegada.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jTHorarioLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTHorarioLlegadaActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuardar.setForeground(new java.awt.Color(102, 102, 102));
        jBGuardar.setText("Guardar");
        jBGuardar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jBGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBGuardarMouseExited(evt);
            }
        });
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBLimpiar2.setBackground(new java.awt.Color(255, 255, 255));
        jBLimpiar2.setForeground(new java.awt.Color(102, 102, 102));
        jBLimpiar2.setText("Limpiar");
        jBLimpiar2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jBLimpiar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBLimpiar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBLimpiar2MouseExited(evt);
            }
        });
        jBLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jTHorarioLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLHorarioSalida)
                            .addComponent(jLRuta)
                            .addComponent(jLHorarioLlegada))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSPHorarioSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(80, 80, 80)
                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jBLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLHorarioSalida)
                    .addComponent(jSPHorarioSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLHorarioLlegada)
                    .addComponent(jTHorarioLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Cargar Horarios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
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

    private void jBGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuardarMouseEntered
        jBGuardar.setBackground(new Color(0, 102, 102));
        jBGuardar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBGuardarMouseEntered

    private void jBGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuardarMouseExited
        jBGuardar.setBackground(new Color(255, 255, 255));
        jBGuardar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBGuardarMouseExited

    private void jBLimpiar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiar2MouseEntered
        jBLimpiar2.setBackground(new Color(0, 102, 102));
        jBLimpiar2.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBLimpiar2MouseEntered

    private void jBLimpiar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiar2MouseExited
        jBLimpiar2.setBackground(new Color(255, 255, 255));
        jBLimpiar2.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBLimpiar2MouseExited

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if(ruta==null||horaLlegada==null||horaSalida==null){
            JOptionPane.showMessageDialog(this, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.ERROR_MESSAGE);
        }else{
            guardar();
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiar2ActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBLimpiar2ActionPerformed

    private void jSPHorarioSalidaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSPHorarioSalidaStateChanged
        calcularLlegada();
    }//GEN-LAST:event_jSPHorarioSalidaStateChanged

    private void jTHorarioLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTHorarioLlegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTHorarioLlegadaActionPerformed

    private void jCRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCRutaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCRutaActionPerformed

    public void formatoSpinner() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date hora = sdf.parse("00:00");

            SpinnerDateModel sm = new SpinnerDateModel(hora, null, null, Calendar.HOUR_OF_DAY);
            jSPHorarioSalida.setModel(sm);

            JSpinner.DateEditor de = new JSpinner.DateEditor(jSPHorarioSalida, "HH:mm");
            jSPHorarioSalida.setEditor(de);

            JFormattedTextField txt = ((JSpinner.DefaultEditor) jSPHorarioSalida.getEditor()).getTextField();
            txt.setEditable(false);

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "El formato de horario ingresado no es válido, reintente.");
        }
    }

    public void llenarCombo() {
        for (Ruta rt : listaRutas) {
            jCRuta.addItem(rt.toString());
        }
        jCRuta.setSelectedIndex(-1);
    }

    public void guardar() {
        horario = new Horarios(ruta, horaLlegada, horaSalida, true);
        new HorarioData().guardarHorario(horario);
        limpiarCampos();
    }

    public void limpiarCampos() {
        formatoSpinner();
        jTHorarioLlegada.setText("");
        jCRuta.setSelectedIndex(-1);
        ruta = null;
        horaSalida = null;
        horaLlegada = null;
    }

    private void calcularLlegada() {
        LocalTime s = LocalTime.of(00, 00);
        int indice = jCRuta.getSelectedIndex();
        if(indice>=0){
            ruta = listaRutas.get(indice);      //Recupero la ruta seleccionada

    // Obtener la hora de salida del JSpinner y convertirla a LocalTime
            Time time = new Time((long)jSPHorarioSalida.getValue().hashCode());
            horaSalida = time.toLocalTime();

    //         Calcular la hora de llegada sumando la duración estimada de la ruta a la hora de salida
            LocalTime duracion = ruta.getDuracionEst();
            long min = s.until(duracion, ChronoUnit.MINUTES);
            horaLlegada = horaSalida.plusMinutes(min);
            jTHorarioLlegada.setText(horaLlegada.toString());            
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar2;
    private javax.swing.JComboBox<String> jCRuta;
    private javax.swing.JLabel jLHorarioLlegada;
    private javax.swing.JLabel jLHorarioSalida;
    private javax.swing.JLabel jLRuta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSPHorarioSalida;
    private javax.swing.JTextField jTHorarioLlegada;
    // End of variables declaration//GEN-END:variables
}
