package vistas;

import accesoADatos.PasajeData;
import accesoADatos.PasajeroData;
import entidades.Pasaje;
import entidades.Pasajero;
import entidades.Ruta;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscadorPasajes extends javax.swing.JPanel {

    PasajeData pasajedata = null;

    public BuscadorPasajes() {
        initComponents();
        armarCabecera();
        pasajedata = new PasajeData();
    }

    DefaultTableModel tabla = new DefaultTableModel() {
        //Lleva el override por que estamos sobreescribiendo un metodo que ya existe 
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTPasaje = new javax.swing.JTextField();
        jTPasaje2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLRuta = new javax.swing.JLabel();
        jLHorarioSalida = new javax.swing.JLabel();
        jCRuta = new javax.swing.JComboBox<>();
        jCHoraSalida = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPasajes = new javax.swing.JTable();
        jBFiltrar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(817, 602));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Busqueda de pasajes");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Pasaje");

        jTPasaje.setBackground(new java.awt.Color(255, 255, 255));
        jTPasaje.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jTPasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPasajeActionPerformed(evt);
            }
        });
        jTPasaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPasajeKeyTyped(evt);
            }
        });

        jTPasaje2.setEditable(false);
        jTPasaje2.setBackground(new java.awt.Color(255, 255, 255));
        jTPasaje2.setForeground(new java.awt.Color(102, 102, 102));
        jTPasaje2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DNI pasajero");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTPasaje2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel3)
                        .addGap(0, 210, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(49, 49, 49)
                        .addComponent(jTPasaje)))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTPasaje2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(102, 102, 102));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLRuta)
                .addGap(114, 114, 114)
                .addComponent(jCRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jLHorarioSalida)
                .addGap(18, 18, 18)
                .addComponent(jCHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRuta)
                    .addComponent(jCRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLHorarioSalida))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        tablaPasajes.setBackground(new java.awt.Color(255, 255, 255));
        tablaPasajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaPasajes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaPasajes);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        jBFiltrar.setBackground(new java.awt.Color(255, 255, 255));
        jBFiltrar.setForeground(new java.awt.Color(102, 102, 102));
        jBFiltrar.setText("Buscar");
        jBFiltrar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jBFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBFiltrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBFiltrarMouseExited(evt);
            }
        });
        jBFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFiltrarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jBFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void jBFiltrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBFiltrarMouseEntered
        jBFiltrar.setBackground(new Color(0, 102, 102));
        jBFiltrar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBFiltrarMouseEntered

    private void jBFiltrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBFiltrarMouseExited
        jBFiltrar.setBackground(new Color(255, 255, 255));
        jBFiltrar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBFiltrarMouseExited

    private void jBLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseEntered
        jBLimpiar.setBackground(new Color(0, 102, 102));
        jBLimpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBLimpiarMouseEntered

    private void jBLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseExited
        jBLimpiar.setBackground(new Color(255, 255, 255));
        jBLimpiar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBLimpiarMouseExited

    private void jBEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminarMouseEntered
        jBEliminar.setBackground(new Color(0, 102, 102));
        jBEliminar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBEliminarMouseEntered

    private void jBEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminarMouseExited
        jBEliminar.setBackground(new Color(255, 255, 255));
        jBEliminar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBEliminarMouseExited

    private void jBFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFiltrarActionPerformed
        if (jTPasaje.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un DNI para poder buscar un pasajero");
        }

        PasajeroData pasajeroData = new PasajeroData();

        Pasajero pasa = pasajeroData.buscarPasajeroDNI(jTPasaje.getText());

        if (pasa != null) {
            limpiarTabla();
            cargarTabla(pasa.getIdPasajero());

            jTPasaje2.setText(pasa.getNombre() + ", " + pasa.getApellido());
        }
    }//GEN-LAST:event_jBFiltrarActionPerformed

    private void jTPasajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPasajeKeyTyped
        if(jTPasaje.getText().length() >= 8){
           evt.consume();
       }
        char c = evt.getKeyChar();
        // Permitir solo números y el punto decimal
        if (!Character.isDigit(c)) {
            evt.consume(); // Ignorar el evento
        }
    }//GEN-LAST:event_jTPasajeKeyTyped

    private void jTPasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPasajeActionPerformed

    }//GEN-LAST:event_jTPasajeActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCampos();
        limpiarTabla();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        if (tablaPasajes.getRowCount() > 0) {

            if (tablaPasajes.getSelectedRow() != -1) {
                int id = Integer.parseInt(String.valueOf(tablaPasajes.getValueAt(tablaPasajes.getSelectedRow(), 0)));

                int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres ELIMINAR?", "confirmar eliminación", JOptionPane.YES_NO_OPTION);
                if (confirmacion == JOptionPane.YES_OPTION) {
                    pasajedata.eliminarVenta(id);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se seleccionó ningún pasaje");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay nada para eliminar");
        }
        limpiarCampos();
        limpiarTabla();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jCRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCRutaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBFiltrar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JComboBox<entidades.Horario> jCHoraSalida;
    private javax.swing.JComboBox<Ruta> jCRuta;
    private javax.swing.JLabel jLHorarioSalida;
    private javax.swing.JLabel jLRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTPasaje;
    private javax.swing.JTextField jTPasaje2;
    private javax.swing.JTable tablaPasajes;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla(int id) {
//Definir el modelo de la tabla y decimos que no es editable

        //Establecer los nombres de las columnas
        String titulos[] = {"idPasaje", "Fecha viaje", "Hora viaje", "butaca", "Precio"};
        tabla.setColumnIdentifiers(titulos);

        PasajeData pasaje = new PasajeData();
        List<Pasaje> listaPasaje = pasaje.listarVentasXPasajero(id);

        //recorre la lista y mostrar los elementos
        if (listaPasaje != null) {
            for (Pasaje pasaj : listaPasaje) {
                Object[] objeto = {pasaj.getIdPasaje(), pasaj.getFechaViaje(), pasaj.getHoraViaje(), pasaj.getAsiento(), pasaj.getPrecio()};

                tabla.addRow(objeto);
            }
        }

        //Asignamos a la tabla los valores 
        tablaPasajes.setModel(tabla);

    }

    private void limpiarCampos() {
        jTPasaje.setText("");
        jTPasaje2.setText("");
    }

    private void limpiarTabla() {
        int filas = tablaPasajes.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            tabla.removeRow(f);
        }

    }

    private void armarCabecera() {
        tabla.addColumn("idPasaje");
        tabla.addColumn("Fecha viaje");
        tabla.addColumn("Hora viaje");
        tabla.addColumn("Butaca");
        tabla.addColumn("Precio");
        tablaPasajes.setModel(tabla);
    }

}
