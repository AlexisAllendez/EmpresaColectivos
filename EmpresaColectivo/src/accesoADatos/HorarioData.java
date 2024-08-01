/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoADatos;

import entidades.Horario;
import entidades.Ruta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 54266
 */
public class HorarioData {
     private Connection con = null;
    private RutaData rutaData = new RutaData();
    

    public HorarioData() {
        con = Conexion.getConexion();
    }

    public void guardarHorario(Horario horario) {
        String sql = "INSERT INTO horarios(id_ruta, hora_salida, hora_llegada, estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, horario.getRuta().getIdRuta());
            ps.setTime(2, Time.valueOf(horario.getHoraSalida()));
            ps.setTime(3, Time.valueOf(horario.getHoraLLegada()));
            ps.setBoolean(4, horario.isEstado());
            
            ps.executeUpdate();
            ResultSet idHorario = ps.getGeneratedKeys();

            if (idHorario.next()) {
                horario.setIdHorario(idHorario.getInt(1));
                JOptionPane.showMessageDialog(null, "Horario guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            if(ex.getErrorCode()==1062){
                System.out.println("Horario Repetido");                
            }else{
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario" + ex);
            }
        }
    }

    public Horario buscarHorario(int id) {
        String sql = "SELECT * FROM horarios WHERE estado = 1 AND id_horario = ?";
        Horario horario = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                horario = new Horario();
                
                horario.setIdHorario(rs.getInt("id_horario"));
                Ruta ruta = new RutaData().buscarRuta(rs.getInt("id_ruta"));
                horario.setRuta(ruta);
                horario.setHoraSalida(rs.getTime("hora_salida").toLocalTime());
                horario.setHoraLLegada(rs.getTime("hora_llegada").toLocalTime());
                horario.setEstado(rs.getBoolean("estado"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe un horario con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla horario" + ex);
        }
        return horario;
    }

    public void modificarHorario(Horario horario) {
        String sql = "UPDATE horarios SET id_ruta = ?, hora_salida = ?, hora_llegada = ? WHERE ID_Horario = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, horario.getRuta().getIdRuta());
            ps.setTime(2, Time.valueOf(horario.getHoraSalida()));
            ps.setTime(3, Time.valueOf(horario.getHoraLLegada()));
            ps.setInt(4, horario.getIdHorarios());
            
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó el horario");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el horario a modificar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario" + ex);
        }
    }

    public void eliminarHorario(int id) {
        String sql = "UPDATE horarios SET estado = 0 WHERE id_horario = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas ==1) {
                JOptionPane.showMessageDialog(null, "Se eliminó el horario");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el horario a eliminar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario" + ex);
        }
    }

    public ArrayList<Horario> listarHorarios() {
        ArrayList<Horario> horarios = new ArrayList<>();
        String sql = "SELECT * FROM horarios WHERE estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Horario horario = new Horario();
                
                horario.setIdHorario(rs.getInt("id_horario"));
                horario.setRuta(rutaData.buscarRuta(rs.getInt("id_ruta")));
                horario.setHoraSalida(rs.getTime("hora_salida").toLocalTime());
                horario.setHoraLLegada(rs.getTime("hora_llegada").toLocalTime());
                horario.setEstado(rs.getBoolean("estado"));
                
                horarios.add(horario);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario" + ex);
        }
        return horarios;
    }
    
    public ArrayList<Horario> listarHorariosXRuta(int idRuta) {
        ArrayList<Horario> listaHorarios = new ArrayList<>();
        String sql = "SELECT * FROM horarios WHERE estado = 1 AND id_ruta = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idRuta);
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Horario horario = new Horario();
                horario.setIdHorario(rs.getInt("id_horario"));
                horario.setRuta(rutaData.buscarRuta(rs.getInt("id_ruta")));
                horario.setHoraSalida(rs.getTime("hora_salida").toLocalTime());
                horario.setHoraLLegada(rs.getTime("hora_llegada").toLocalTime());
                horario.setEstado(rs.getBoolean("estado"));
                
                listaHorarios.add(horario);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario" + ex);
        }
        return listaHorarios;
    }
    
    public ArrayList<Horario> listarHorariosXSalida(LocalTime hora){
        ArrayList<Horario> horaSalidas = new ArrayList<>();
        String sql = "SELECT * FROM horarios WHERE estado = 1 AND hora_salida = ?";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTime(1, Time.valueOf(hora));
        
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
             Horario horario = new Horario();
            
             horario.setIdHorario(rs.getInt("id_horario"));
             horario.setRuta(rutaData.buscarRuta(rs.getInt("id_ruta")));
             horario.setHoraSalida(rs.getTime("hora_salida").toLocalTime());
             horario.setHoraLLegada(rs.getTime("hora_llegada").toLocalTime());
             horario.setEstado(rs.getBoolean("estado"));
            
             horaSalidas.add(horario);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario" + ex);
        }
        return horaSalidas;
    }
    
        public ArrayList<Horario> listarHorariosDoble(int id, LocalTime hora){
        ArrayList<Horario> horaSalidas = new ArrayList<>();
        String sql = "SELECT * FROM horarios WHERE estado = 1 AND id_ruta = ? AND  hora_salida = ?";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setTime(2, Time.valueOf(hora));
        
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
             Horario horario = new Horario();
            
             horario.setIdHorario(rs.getInt("id_horario"));
             horario.setRuta(rutaData.buscarRuta(rs.getInt("id_ruta")));
             horario.setHoraSalida(rs.getTime("hora_salida").toLocalTime());
             horario.setHoraLLegada(rs.getTime("hora_llegada").toLocalTime());
             horario.setEstado(rs.getBoolean("estado"));
            
             horaSalidas.add(horario);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario" + ex);
        }
        return horaSalidas;
    }
}
