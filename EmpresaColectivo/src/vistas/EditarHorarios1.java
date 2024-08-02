
package vistas;

import accesoADatos.HorarioData;
import accesoADatos.PasajeroData;
import accesoADatos.RutaData;
import entidades.Horario;
import entidades.Pasajero;
import entidades.Ruta;
import java.awt.Color;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class EditarHorarios1 extends javax.swing.JDialog {
    HorarioData hd1;
    RutaData rd1;
    Ruta ruta = null;
    Horario horario = null;
    LocalTime horaSalida;
    LocalTime horaLlegada;
    int idHorario;
    int idRuta;

    public EditarHorarios1(java.awt.Frame parent, boolean modal,int idHorario,int idRuta) {
        initComponents();
        this.idHorario = idHorario;
        this.idRuta = idRuta;
        hd1 = new HorarioData();
        rd1 = new RutaData();
        horario = hd1.buscarHorario(idHorario);
        ruta = rd1.buscarRuta(idRuta);
        formatoSpinner();
        cargarDatos();

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLRuta = new javax.swing.JLabel();
        jCRuta = new javax.swing.JComboBox<>();
        jLHorarioSalida = new javax.swing.JLabel();
        jSPHorarioSalida = new javax.swing.JSpinner();
        jLHorarioLlegada = new javax.swing.JLabel();
        jTHorarioLlegada = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));

        jLRuta.setForeground(new java.awt.Color(102, 102, 102));
        jLRuta.setText("Ruta ");

        jCRuta.setBackground(new java.awt.Color(255, 255, 255));
        jCRuta.setEditable(true);
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
        jBGuardar.setText("Editar");
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

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Modificar horarios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLHorarioSalida)
                    .addComponent(jLRuta)
                    .addComponent(jLHorarioLlegada))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTHorarioLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSPHorarioSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLHorarioLlegada)
                        .addComponent(jTHorarioLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLHorarioSalida)
                            .addComponent(jSPHorarioSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCRutaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jCRutaActionPerformed

    private void jSPHorarioSalidaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSPHorarioSalidaStateChanged
calcularLlegada();
    }//GEN-LAST:event_jSPHorarioSalidaStateChanged

    private void jTHorarioLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTHorarioLlegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTHorarioLlegadaActionPerformed

    private void jBGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuardarMouseEntered
        jBGuardar.setBackground(new Color(0, 102, 102));
        jBGuardar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBGuardarMouseEntered

    private void jBGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuardarMouseExited
        jBGuardar.setBackground(new Color(255, 255, 255));
        jBGuardar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBGuardarMouseExited

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        modificar();
        this.dispose();
    }//GEN-LAST:event_jBGuardarActionPerformed



    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JComboBox<Ruta> jCRuta;
    private javax.swing.JLabel jLHorarioLlegada;
    private javax.swing.JLabel jLHorarioSalida;
    private javax.swing.JLabel jLRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSPHorarioSalida;
    private javax.swing.JTextField jTHorarioLlegada;
    // End of variables declaration//GEN-END:variables
private void cargarDatos() {
    jCRuta.addItem((horario.getRuta()));

    LocalTime horaSalidaBD = horario.getHoraSalida(); 

    Date horaSalidaDate = convertLocalTimeToDate(horaSalidaBD);

  
    if (horaSalidaDate != null) {
        try {

            jSPHorarioSalida.setValue(horaSalidaDate);
            jTHorarioLlegada.setText(String.valueOf(horario.getHoraLLegada()));
        } catch (IllegalArgumentException e) {

            JOptionPane.showMessageDialog(null, "El valor de hora de salida es inválido.");
        }
    } else {
        // Manejar el caso en que la conversión falla
        JOptionPane.showMessageDialog(null, "El valor de la hora de salida es inválido.");
    }

}
  public void modificar() {
       Horario horarioModificado = new Horario(idHorario,ruta, horaLlegada,horaSalida,true);
        new HorarioData().modificarHorario(horarioModificado);
      
    }


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
 
private Date convertLocalTimeToDate(LocalTime localTime) {
    return Date.from(localTime.atDate(LocalDate.now())
                              .atZone(ZoneId.systemDefault())
                              .toInstant());
}

 
 private void calcularLlegada() {
            
               LocalTime s = LocalTime.of(00, 00);
 

            Time time = new Time((long)jSPHorarioSalida.getValue().hashCode());
            horaSalida = time.toLocalTime();

    //         Calcular la hora de llegada sumando la duración estimada de la ruta a la hora de salida
            LocalTime duracion = ruta.getDuracionEst();
            long min = s.until(duracion, ChronoUnit.MINUTES);
            horaLlegada = horaSalida.plusMinutes(min);
            jTHorarioLlegada.setText(horaLlegada.toString());            
        }
 }
 


       
     

