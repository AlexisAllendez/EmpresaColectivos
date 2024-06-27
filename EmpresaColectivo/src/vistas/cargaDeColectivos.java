/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import accesoADatos.ColectivosData;
import entidades.Colectivos;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class cargaDeColectivos extends javax.swing.JPanel {
 Colectivos colectivo = null;
   
    public cargaDeColectivos() {
        initComponents();
    }
    private static Map<String, String> capacidadMap;
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelColectivo = new javax.swing.JPanel();
        lblMarca = new javax.swing.JLabel();
        lblDatosColectivo = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblCapacidad = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        txtCapacidad = new javax.swing.JTextField();
        jBAgregar = new javax.swing.JButton();
        jBLimpieza = new javax.swing.JButton();
        lblModelo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelColectivo.setBackground(new java.awt.Color(255, 255, 255));
        panelColectivo.setForeground(new java.awt.Color(0, 204, 204));
        panelColectivo.setPreferredSize(new java.awt.Dimension(862, 240));

        lblMarca.setForeground(new java.awt.Color(102, 102, 102));
        lblMarca.setText("Marca");

        lblDatosColectivo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDatosColectivo.setForeground(new java.awt.Color(51, 51, 51));
        lblDatosColectivo.setText("Cargar colectivos");

        lblMatricula.setForeground(new java.awt.Color(102, 102, 102));
        lblMatricula.setText("Matricula");

        txtMatricula.setBackground(new java.awt.Color(255, 255, 255));
        txtMatricula.setForeground(new java.awt.Color(102, 102, 102));
        txtMatricula.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 153)));

        lblCapacidad.setForeground(new java.awt.Color(102, 102, 102));
        lblCapacidad.setText("Capacidad");

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Volkswagen", "Mercedez Benz", "Scania", "Marcopolo" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        txtCapacidad.setEditable(false);
        txtCapacidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCapacidad.setForeground(new java.awt.Color(102, 102, 102));
        txtCapacidad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 153)));

        jBAgregar.setBackground(new java.awt.Color(255, 255, 255));
        jBAgregar.setForeground(new java.awt.Color(102, 102, 102));
        jBAgregar.setText("Agregar");
        jBAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jBAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBAgregarMouseExited(evt);
            }
        });
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBLimpieza.setBackground(new java.awt.Color(255, 255, 255));
        jBLimpieza.setForeground(new java.awt.Color(102, 102, 102));
        jBLimpieza.setText("Limpiar");
        jBLimpieza.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jBLimpieza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBLimpiezaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBLimpiezaMouseExited(evt);
            }
        });
        jBLimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiezaActionPerformed(evt);
            }
        });

        lblModelo.setForeground(new java.awt.Color(102, 102, 102));
        lblModelo.setText("Modelo");

        javax.swing.GroupLayout panelColectivoLayout = new javax.swing.GroupLayout(panelColectivo);
        panelColectivo.setLayout(panelColectivoLayout);
        panelColectivoLayout.setHorizontalGroup(
            panelColectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColectivoLayout.createSequentialGroup()
                .addGroup(panelColectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelColectivoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBLimpieza, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelColectivoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelColectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelColectivoLayout.createSequentialGroup()
                                .addComponent(lblMarca)
                                .addGap(54, 54, 54)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(263, 263, 263))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColectivoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDatosColectivo)
                .addGap(342, 342, 342))
            .addGroup(panelColectivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblModelo)
                .addGap(290, 290, 290)
                .addGroup(panelColectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelColectivoLayout.createSequentialGroup()
                        .addComponent(lblMatricula)
                        .addGap(46, 46, 46)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelColectivoLayout.createSequentialGroup()
                        .addComponent(lblCapacidad)
                        .addGap(40, 40, 40)
                        .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(263, Short.MAX_VALUE))))
        );
        panelColectivoLayout.setVerticalGroup(
            panelColectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColectivoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblDatosColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(panelColectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(jComboBox1)
                    .addComponent(lblMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(panelColectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCapacidad)
                    .addComponent(lblCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2)
                    .addComponent(lblModelo))
                .addGap(45, 45, 45)
                .addGroup(panelColectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpieza, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelColectivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

  


    private void jBAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAgregarMouseEntered
        jBAgregar.setBackground(new Color(0, 102, 102));
        jBAgregar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBAgregarMouseEntered

    private void jBAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAgregarMouseExited
        jBAgregar.setBackground(new Color(255, 255, 255));
        jBAgregar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBAgregarMouseExited

    private void jBLimpiezaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiezaMouseEntered
        jBLimpieza.setBackground(new Color(0, 102, 102));
        jBLimpieza.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBLimpiezaMouseEntered

    private void jBLimpiezaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiezaMouseExited
        jBLimpieza.setBackground(new Color(255, 255, 255));
        jBLimpieza.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBLimpiezaMouseExited

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String selectedValue = (String) jComboBox1.getSelectedItem();
        actualizarCombo(jComboBox2, selectedValue);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed


    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
       inicializarCapacidades();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
                    String selectedModel = (String) jComboBox2.getSelectedItem();
                    if (selectedModel != null && capacidadMap.containsKey(selectedModel)) {
                        txtCapacidad.setText(capacidadMap.get(selectedModel));
                    } else {
                        txtCapacidad.setText("");
                    }
                }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
         if (jComboBox1.getSelectedItem()== null || jComboBox2.getSelectedItem()== null || txtMatricula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos para guardar");

        }else{
             Object seleccion1 = jComboBox1.getSelectedItem();
             Object seleccion2 = jComboBox2.getSelectedItem();
             
            String matricula = txtMatricula.getText();
            String marca = seleccion1.toString();
            String modelo = seleccion2.toString();
            
        
            int capacidad = Integer.parseInt(txtCapacidad.getText());
      
            boolean estado = true;
            colectivo = new Colectivos (matricula, marca, modelo, capacidad, estado);
            
            String texto = "DESEA GUARDAR LA UNIDAD/A:\n"+"Matricula: " + matricula 
                            + "\nMarca: " + marca + "\nModelo: " + modelo 
                            + "\nCapacidad: " + capacidad;
            int guardar = JOptionPane.showConfirmDialog(this, texto, "CONFIRMAR COLECTIVO", JOptionPane.YES_NO_OPTION);
            if(guardar == 0){                               
                new ColectivosData().guardarColectivo(colectivo);
                limpiarCampos();
            }
        }
         limpiarCampos();
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBLimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiezaActionPerformed
       limpiarCampos();
    }//GEN-LAST:event_jBLimpiezaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBLimpieza;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblDatosColectivo;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JPanel panelColectivo;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtMatricula;
    // End of variables declaration//GEN-END:variables
 
    
    
    private static void actualizarCombo(JComboBox<String> jComboBox2, String valorSeleccionado) {
        // Limpiar el segundo JComboBox
        jComboBox2.removeAllItems();

        // Definir las opciones para cada marca de vehículos
        String[] VolkswagenOpciones = {"VolksBus", "Meteor"};
        String[] MercedesOpciones = {"Intouro", "Citaro"};
        String[] opcionesScania = {"Citywide", "K-series"};
        String[] marcopoloOptions = {"Paradise","Viaggio"}; 

       
        switch (valorSeleccionado) {
            case "Volkswagen":
                for (String opcion : VolkswagenOpciones) {
                    jComboBox2.addItem(opcion);
                }
                break;
            case "Mercedez Benz":
                for (String opcion : MercedesOpciones) {
                    jComboBox2.addItem(opcion);
                }
                break;
            case "Scania":
                for (String opcion : opcionesScania) {
                    jComboBox2.addItem(opcion);
                }
                break;
            case "Marcopolo":
                for (String opcion : marcopoloOptions) {
                    jComboBox2.addItem(opcion);
                }
                break;
        }
    }
   
    private static void inicializarCapacidades() {
        capacidadMap = new HashMap<>();
        capacidadMap.put("VolksBus", "50");
        capacidadMap.put("Meteor", "60");
        capacidadMap.put("Intouro", "40");
        capacidadMap.put("Citaro", "45");
        capacidadMap.put("Citywide", "55");
        capacidadMap.put("K-series", "65");
          capacidadMap.put("Paradise", "60");
          capacidadMap.put("Viaggio", "42");
    }
    
   private static void actualizarCombo2(JComboBox<String> jComboBox2, String valorSeleccionado) {
        // Limpiar el segundo JComboBox
        jComboBox2.removeAllItems();

        // Definir las opciones para cada marca de vehículos
        String[] VolkswagenOpciones = {"VolksBus", "Meteor"};
        String[] MercedesOpciones = {"OL", "OH"};
        String[] ScaniaOpcines = {"Citywide", "K-series"};
        String[] MarcopoloOptions = {}; // Asumo que Marcopolo no tiene opciones, puedes agregar si es necesario

        // Agregar las opciones relevantes al segundo JComboBox según la marca seleccionada
        switch (valorSeleccionado) {
            case "Volkswagen":
                for (String opcion : VolkswagenOpciones) {
                    jComboBox2.addItem(opcion);
                }
                break;
            case "Mercedez Benz":
                for (String opcion : MercedesOpciones) {
                    jComboBox2.addItem(opcion);
                }
                break;
            case "Scania":
                for (String opcion : ScaniaOpcines) {
                    jComboBox2.addItem(opcion);
                }
                break;
            case "Marcopolo":
                for (String opcion : MarcopoloOptions) {
                    jComboBox2.addItem(opcion);
                }
                break;
        }
    }

    private void limpiarCampos() {
        
        jComboBox1.setSelectedItem("Seleccione");
        jComboBox2.setSelectedItem("");
        txtMatricula.setText("");
        txtCapacidad.setText("");
       
        
    }
}
