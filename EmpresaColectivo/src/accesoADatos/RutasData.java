/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoADatos;

import entidades.Rutas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 54266
 */
public class RutasData {
       private Connection con = null;

    public RutasData() {
        con =  Conexion.getConexion();
    }

    public void guardarRuta(Rutas ruta) {
        
        String sql = "INSERT INTO ruta(origen, destino, duracion_estimada, estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, ruta.getOrigen());
            ps.setString(2, ruta.getDestino());
            ps.setTime(3, Time.valueOf(ruta.getDuracionEst()));
            ps.setBoolean(4, ruta.isEstado());
            
            ps.executeUpdate();            
            ResultSet idRuta = ps.getGeneratedKeys();
            
            if (idRuta.next()) {
                ruta.setIdRuta(idRuta.getInt(1));
                JOptionPane.showMessageDialog(null, "Se creó exitosamente la ruta");
            }
            ps.close();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                System.out.println("Ruta Repetida");

            } else {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
            }
        }
    }
    
//BUSCO RUTA POR ID
    public Rutas buscarRuta(int id) {   
        String sql = "SELECT * FROM ruta WHERE estado = 1 AND id_ruta = ?";     
        Rutas ruta = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ruta = new Rutas();
                
                ruta.setIdRuta(rs.getInt("id_ruta"));
                ruta.setOrigen(rs.getString("origen"));
                ruta.setDestino(rs.getString("destino"));
                ruta.setDuracionEst(rs.getTime("duracion_estimada").toLocalTime());
                ruta.setEstado(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe una ruta con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
        return ruta;
    }
    
// BUSCO RUTA POR ORIGEN Y DESTINO ESPECIFICO //LO UTILIZO PARA BUSCAR EL HORARIO
    public Rutas buscarRuta(String origen, String destino) {   
        String sql = "SELECT * FROM ruta WHERE estado = 1 AND origen = ? AND destino = ?";
        Rutas ruta = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, origen);
            ps.setString(2, destino);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ruta = new Rutas();
                
                ruta.setIdRuta(rs.getInt("id_ruta"));
                ruta.setOrigen(rs.getString("origen"));
                ruta.setDestino(rs.getString("destino"));
                ruta.setDuracionEst(rs.getTime("duracion_estimada").toLocalTime());
                ruta.setEstado(true);
                     
            } else {
                JOptionPane.showMessageDialog(null, "No existe una ruta con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
        return ruta;
    }

    public void modificarRuta(Rutas ruta) {
        String sql = "UPDATE ruta SET origen= ?, destino= ?, duracion_estimada= ? WHERE id_ruta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ruta.getOrigen());
            ps.setString(2, ruta.getDestino());
            ps.setTime(3, Time.valueOf(ruta.getDuracionEst()));
            ps.setInt(4, ruta.getIdRuta());
            
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas ==1) {
                JOptionPane.showMessageDialog(null, "Se modificó la ruta");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la ruta a modificar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
    }

    public void eliminarRuta(int id) {
        String sql = "UPDATE ruta SET estado= 0 WHERE id_ruta = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó la ruta");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la ruta a eliminar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
    }
    
//LISTO TODAS LAS RUTAS
    public ArrayList<Rutas> listarRutas() {
        ArrayList<Rutas> rutas = new ArrayList<>();
        String sql = "SELECT * FROM ruta WHERE estado = 1";    
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Rutas ruta = new Rutas();
                
                ruta.setIdRuta(rs.getInt("id_ruta"));
                ruta.setOrigen(rs.getString("origen"));
                ruta.setDestino(rs.getString("destino"));
                ruta.setDuracionEst(rs.getTime("duracion_estimada").toLocalTime());
                ruta.setEstado(rs.getBoolean("estado"));
                rutas.add(ruta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
        return rutas;
    }
    
//LISTA TODOS LOS ORIGENES DISTINTOS
    public ArrayList<String> listarRutasPorOrigen() {       
        ArrayList<String> rutas = new ArrayList<>();
        String sql = "SELECT DISTINCT origen FROM ruta WHERE estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String origen = rs.getString("origen");
                rutas.add(origen);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
        return rutas;
    }
    
//LISTA TODOS LOS DESTINOS DISTINTOS
    public ArrayList<String> listarRutasDestino() {         
        ArrayList<String> rutas = new ArrayList<>();
        String sql = "SELECT DISTINCT destino FROM ruta WHERE estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String destino = rs.getString("destino");
                rutas.add(destino);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
        return rutas;
    }
    
//LISTA TODOS LOS DESTINOS DISTINTOS DE DETERMINADO ORIGEN
    public ArrayList<String> listarRutasDestino(String origen) {        
        ArrayList<String> rutas = new ArrayList<>();
        String sql = "SELECT DISTINCT destino FROM ruta WHERE estado = 1 AND origen = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, origen);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String destino = rs.getString("destino");
                rutas.add(destino);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
        return rutas;
    }
    
//LISTA TODAS LAS RUTAS CON DISTINTO ORIGEN
     public ArrayList<Rutas> listarRutasPorOrigenBusqueda() {       
        ArrayList<Rutas> rutas = new ArrayList<>();
        String sql = "SELECT DISTINCT origen FROM ruta WHERE estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Rutas origen = new Rutas();
                origen.setOrigen(rs.getString("origen"));
                rutas.add(origen);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
        return rutas;
    }

//LISTA TODAS LAS RUTAS CON DISTINTO DESTINO
       public ArrayList<Rutas> listarRutasPorDestinoBusqueda() {        
        ArrayList<Rutas> rutas = new ArrayList<>();
        String sql = "SELECT DISTINCT destino FROM ruta WHERE estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Rutas destino = new Rutas();
                destino.setDestino(rs.getString("destino"));
                rutas.add(destino);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta" + ex);
        }
        return rutas;
    }
    
}
