
package vistas;

import accesoADatos.ColectivosData;
import accesoADatos.HorarioData;
import accesoADatos.PasajeData;
import accesoADatos.PasajerosData;
import accesoADatos.RutaData;
import entidades.Colectivos;
import entidades.Horarios;
import entidades.Pasaje;
import entidades.Pasajeros;
import entidades.Ruta;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class venderPasajes extends javax.swing.JPanel {

    List<Pasajeros> listaPasajeros;
    List<Ruta> listaRutasOrigen;
    List<Colectivos> listaColectivos;
    List<Horarios> listaHorarios;

    private ArrayList lista = new ArrayList();
    RutaData rutaData = new RutaData();
    PasajerosData pasajeroData = new PasajerosData();
    HorarioData horarioData = new HorarioData();
    ColectivosData colectivoData = new ColectivosData();

    public venderPasajes() {
        initComponents();
        listaHorarios = horarioData.listarHorarios();
        listaPasajeros = pasajeroData.listarPasajeros();
        listaRutasOrigen = rutaData.listarRutas();
//        listaRutasOrigen = rutaData.listarRutasPorOrigenBusqueda();
        listaColectivos = colectivoData.listarColectivos();
        limpiarCampos();
        llenarComboPasajero();
        llenarComboRutaorigen();
        llenarComboHorariosValoresPorDefecto();
        llenarComboColectivos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo3 = new javax.swing.JPanel();
        jLBuscarPasaje = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();
        jCHFecha = new com.toedter.calendar.JDateChooser();
        jPanel11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBPasajero = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLRuta = new javax.swing.JLabel();
        jLOrigen = new javax.swing.JLabel();
        jCBOrigen = new javax.swing.JComboBox<>();
        jBVender = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLAsiento = new javax.swing.JLabel();
        jCBAsiento = new javax.swing.JComboBox<>();
        jLCargaColectivo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCBColectivo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jCBHorario = new javax.swing.JComboBox<>();
        jLHorario = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLCargaColectivo1 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(817, 602));

        jPFondo3.setBackground(new java.awt.Color(255, 255, 255));
        jPFondo3.setPreferredSize(new java.awt.Dimension(805, 433));

        jLBuscarPasaje.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLBuscarPasaje.setForeground(new java.awt.Color(51, 51, 51));
        jLBuscarPasaje.setText("Vender Pasaje");

        jLFecha.setForeground(new java.awt.Color(102, 102, 102));
        jLFecha.setText("Fecha");

        jCHFecha.setBackground(new java.awt.Color(255, 255, 255));
        jCHFecha.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jCHFecha.setForeground(new java.awt.Color(102, 102, 102));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));

        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Pasajero");

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Pasajero");

        jCBPasajero.setBackground(new java.awt.Color(255, 255, 255));
        jCBPasajero.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jCBPasajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBPasajeroMouseClicked(evt);
            }
        });
        jCBPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPasajeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCBPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));

        jLRuta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLRuta.setForeground(new java.awt.Color(51, 51, 51));
        jLRuta.setText("Ruta");

        jLOrigen.setForeground(new java.awt.Color(102, 102, 102));
        jLOrigen.setText("Origen - Destino");

        jCBOrigen.setBackground(new java.awt.Color(255, 255, 255));
        jCBOrigen.setForeground(new java.awt.Color(102, 102, 102));
        jCBOrigen.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jCBOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBOrigenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLRuta)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLOrigen)
                        .addGap(26, 26, 26)
                        .addComponent(jCBOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLRuta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLOrigen))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jBVender.setBackground(new java.awt.Color(255, 255, 255));
        jBVender.setForeground(new java.awt.Color(102, 102, 102));
        jBVender.setText("Vender pasaje");
        jBVender.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jBVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVenderMouseExited(evt);
            }
        });
        jBVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVenderActionPerformed(evt);
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

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));

        jLAsiento.setForeground(new java.awt.Color(102, 102, 102));
        jLAsiento.setText("Seleccionar asiento");

        jCBAsiento.setBackground(new java.awt.Color(255, 255, 255));
        jCBAsiento.setForeground(new java.awt.Color(102, 102, 102));
        jCBAsiento.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));

        jLCargaColectivo.setForeground(new java.awt.Color(51, 51, 51));
        jLCargaColectivo.setText("Seleccion de colectivo");

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Colectivo");

        jCBColectivo.setBackground(new java.awt.Color(255, 255, 255));
        jCBColectivo.setForeground(new java.awt.Color(102, 102, 102));
        jCBColectivo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jCBColectivo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBColectivoItemStateChanged(evt);
            }
        });
        jCBColectivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBColectivoMouseClicked(evt);
            }
        });
        jCBColectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBColectivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLCargaColectivo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLAsiento)
                .addGap(18, 18, 18)
                .addComponent(jCBAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLCargaColectivo)
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLAsiento)
                    .addComponent(jCBAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));

        jCBHorario.setBackground(new java.awt.Color(255, 255, 255));
        jCBHorario.setForeground(new java.awt.Color(102, 102, 102));
        jCBHorario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jCBHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBHorarioActionPerformed(evt);
            }
        });

        jLHorario.setForeground(new java.awt.Color(102, 102, 102));
        jLHorario.setText("Horario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLHorario)
                .addGap(18, 18, 18)
                .addComponent(jCBHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLHorario))
                .addGap(19, 19, 19))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));

        jLCargaColectivo1.setForeground(new java.awt.Color(51, 51, 51));
        jLCargaColectivo1.setText("Precio");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLCargaColectivo1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLCargaColectivo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPFondo3Layout = new javax.swing.GroupLayout(jPFondo3);
        jPFondo3.setLayout(jPFondo3Layout);
        jPFondo3Layout.setHorizontalGroup(
            jPFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondo3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLFecha)
                .addGap(40, 40, 40)
                .addComponent(jCHFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPFondo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPFondo3Layout.createSequentialGroup()
                        .addGroup(jPFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPFondo3Layout.createSequentialGroup()
                                .addComponent(jLBuscarPasaje)
                                .addGap(12, 12, 12)))
                        .addGroup(jPFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPFondo3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBVender, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPFondo3Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPFondo3Layout.setVerticalGroup(
            jPFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLBuscarPasaje)
                .addGap(2, 2, 2)
                .addGroup(jPFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCHFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFecha))
                .addGroup(jPFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPFondo3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPFondo3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jBVender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo3, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo3, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBVenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVenderMouseEntered
        jBVender.setBackground(new Color(0, 102, 102));
        jBVender.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBVenderMouseEntered

    private void jBVenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVenderMouseExited
        jBVender.setBackground(new Color(255, 255, 255));
        jBVender.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBVenderMouseExited

    private void jBLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseEntered
        jBLimpiar.setBackground(new Color(0, 102, 102));
        jBLimpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBLimpiarMouseEntered

    private void jBLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseExited
        jBLimpiar.setBackground(new Color(255, 255, 255));
        jBLimpiar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBLimpiarMouseExited

    private void jCBPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPasajeroActionPerformed
        if (jCBPasajero != null) {
            jCBOrigen.setEnabled(true);
            jCBHorario.setEnabled(true);
            jCBColectivo.setEnabled(true);
            jCBAsiento.setEnabled(true);
        }
    }//GEN-LAST:event_jCBPasajeroActionPerformed

    private void jBVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVenderActionPerformed
        StringBuilder errorMessage = new StringBuilder();

            Date fechaHoy = new Date();
            Date fechaSeleccionada = jCHFecha.getDate();
            if (fechaSeleccionada == null) {
                errorMessage.append("Seleccione una fecha válida.\n");
            } else {
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                String fechaFormateada = formato.format(fechaSeleccionada);

                if (fechaSeleccionada.before(fechaHoy) && !fechaFormateada.equals(formato.format(fechaHoy))) {
                    errorMessage.append("Seleccione una fecha válida. No puede ser una fecha anterior a hoy.\n");
                }
            }

            if (jCBPasajero.getSelectedItem() == null || jCBPasajero.getSelectedItem().toString().isEmpty()) {
                errorMessage.append("Seleccione un pasajero válido. Este campo no puede estar vacío.\n");
            }

            if (jCBOrigen.getSelectedItem() == null || jCBOrigen.getSelectedItem().toString().isEmpty()) {
                errorMessage.append("Seleccione una ruta válida. Este campo no puede estar vacío.\n");
            }

            if (jCBHorario.getSelectedItem() == null || jCBHorario.getSelectedItem().toString().isEmpty()) {
                errorMessage.append("Seleccione un horario válido. Este campo no puede estar vacío.\n");
            }

            if (jCBColectivo.getSelectedItem() == null || jCBColectivo.getSelectedItem().toString().isEmpty() ||
                jCBAsiento.getSelectedItem() == null || jCBAsiento.getSelectedItem().toString().isEmpty()) {
                errorMessage.append("Debe seleccionar un colectivo y un asiento válido.\n");
            }

            if (txtPrecio.getText().isEmpty()) {
                errorMessage.append("Debe ingresar un precio válido.\n");
            }

            if (errorMessage.length() > 0) {
                JOptionPane.showMessageDialog(null, errorMessage.toString(), "Errores de Validación", JOptionPane.ERROR_MESSAGE);
                return; // Detener la ejecución si hay errores
            }
        
                   
               
            
        
        
        Pasajeros pasajero = (Pasajeros) jCBPasajero.getSelectedItem();
        Ruta ruta = (Ruta) jCBOrigen.getSelectedItem();
        Colectivos colectivo = (Colectivos) jCBColectivo.getSelectedItem();
        LocalDate fechaViaje = null;
        List<Integer> asientosDisponibles = null;
        if(jCHFecha.getDate() != null){
            Instant instant = jCHFecha.getDate().toInstant();
            fechaViaje = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        }
        Horarios horario = (Horarios) jCBHorario.getSelectedItem();
        LocalTime horaSalida = horario.getHoraSalida();
        
        Pasaje pasaje = new Pasaje(pasajero, ruta, colectivo, fechaViaje,
                                   horario.getHoraSalida(),
                                   (int) jCBAsiento.getSelectedItem(),
                                   (double) Integer.valueOf(txtPrecio.getText()),
                                   true
        );
        
        PasajeData pasajeData = new PasajeData();
        pasajeData.guardarPasaje(pasaje);
        limpiarCampos();
    }//GEN-LAST:event_jBVenderActionPerformed

    private void jCBPasajeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBPasajeroMouseClicked

    }//GEN-LAST:event_jCBPasajeroMouseClicked

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jCBColectivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBColectivoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jCBColectivoMouseClicked

    private void jCBColectivoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBColectivoItemStateChanged
        // TODO add your handling code here:


    }//GEN-LAST:event_jCBColectivoItemStateChanged

    private void jCBHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBHorarioActionPerformed
        jCBAsiento.removeAllItems();
        jCBAsiento.setSelectedIndex(-1);
    }//GEN-LAST:event_jCBHorarioActionPerformed

    private void jCBOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBOrigenActionPerformed
        jCBAsiento.removeAllItems();
        jCBAsiento.setSelectedIndex(-1);
        jCBHorario.setSelectedIndex(-1);
        
        Ruta rutaSeleccionada = (Ruta) jCBOrigen.getSelectedItem();

        if (rutaSeleccionada != null) {
            listaHorarios = horarioData.listarHorariosXRuta(rutaSeleccionada.getIdRuta());
            jCBHorario.removeAllItems();
            for (Horarios horariosVisibles : listaHorarios) {
                jCBHorario.addItem(horariosVisibles);
            }
            jCBHorario.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jCBOrigenActionPerformed

    private void jCBColectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBColectivoActionPerformed
        jCBAsiento.setSelectedIndex(-1);
        jCBAsiento.removeAllItems();
        PasajeData pasajeData = new PasajeData();
        
        LocalDate localDate = null;
        List<Integer> asientosDisponibles = null;
        if(jCHFecha.getDate() != null){
            Instant instant = jCHFecha.getDate().toInstant();
            localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
            
            System.out.println("colectivo=" + (Colectivos) jCBColectivo.getSelectedItem());
            System.out.println("ruta= " + (Ruta) jCBOrigen.getSelectedItem());
            System.out.println("horario= " + (Horarios) jCBHorario.getSelectedItem());
            
            asientosDisponibles = pasajeData.getAsientosDisponibles(
                (Colectivos) jCBColectivo.getSelectedItem(),
                (Ruta) jCBOrigen.getSelectedItem(),
                (Horarios) jCBHorario.getSelectedItem(),
                localDate
            );
        }
        
        if(asientosDisponibles == null){
            System.out.println("No hay registro de asientos disponibles en esa fecha");
        }
        
        if(asientosDisponibles != null){
            for(Integer asiento : asientosDisponibles){
                System.out.println("[" + asiento + "]");
                jCBAsiento.addItem(asiento);
            }
        }
    }//GEN-LAST:event_jCBColectivoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBVender;
    private javax.swing.JComboBox<Integer> jCBAsiento;
    private javax.swing.JComboBox<Colectivos> jCBColectivo;
    private javax.swing.JComboBox<Horarios> jCBHorario;
    private javax.swing.JComboBox<Ruta> jCBOrigen;
    private javax.swing.JComboBox<Pasajeros> jCBPasajero;
    private com.toedter.calendar.JDateChooser jCHFecha;
    private javax.swing.JLabel jLAsiento;
    private javax.swing.JLabel jLBuscarPasaje;
    private javax.swing.JLabel jLCargaColectivo;
    private javax.swing.JLabel jLCargaColectivo1;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLHorario;
    private javax.swing.JLabel jLOrigen;
    private javax.swing.JLabel jLRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPFondo3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void llenarCombo(JComboBox<String> combo, Collection lista) {
        combo.removeAllItems();
        combo.addItem("---");
        for (Object x : lista) {
            combo.addItem(x.toString());
        }
    }

    private String recuperarDato(String cadena, String patron) {
        Pattern pattern = Pattern.compile(patron, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(cadena);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "No se encontro";
    }

    public void llenarComboPasajero() {
        for (Pasajeros pasajeros : listaPasajeros) {
            jCBPasajero.addItem(pasajeros);
//            jCBPasajero.addItem(pasajeros.getNombre() + ", " + pasajeros.getApellido());

        }
        jCBPasajero.setSelectedIndex(-1);
    }

    public void llenarComboRutaorigen() {
        for (Ruta ruta : listaRutasOrigen) {
            jCBOrigen.addItem(ruta);

        }
        jCBOrigen.setSelectedIndex(-1);
    }

    public void llenarComboHorariosValoresPorDefecto() {
        for (Horarios Horariosmuestra : listaHorarios) {
            jCBHorario.addItem(Horariosmuestra);
//            jCBHorario.addItem("Salida " + Horariosmuestra.getHoraSalida() + " - " + "Llegada " + Horariosmuestra.getHoraLLegada());
        }
        jCBHorario.setSelectedIndex(-1);
    }

    private void llenarComboColectivos() {
        for (Colectivos cole : listaColectivos) {
            jCBColectivo.addItem(cole);
//            jCBColectivo.addItem(cole.getMarca() + " - " + cole.getModelo());

            jCBColectivo.setSelectedIndex(-1);
        }

    }

    private void llenarComboasientos() {

    }

    private void limpiarCampos() {
         Date fechaHoy = new Date();
        
        jCBOrigen.setSelectedIndex(-1);
        jCBPasajero.setSelectedIndex(-1);
        jCBHorario.setSelectedIndex(-1);
        jCBColectivo.setSelectedIndex(-1);
        jCBAsiento.setSelectedIndex(-1);
        jCHFecha.setDate(fechaHoy);
        txtPrecio.setText("");
    }

}
