/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoADatos;

import entidades.Pasajeros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 54266
 */
public class PasajerosData {
     private Connection con = null;
    
    public PasajerosData() {
        con = Conexion.getConexion();
    }
    
    public void guardarPasajero(Pasajeros pasajero) {
        String sql = "INSERT INTO pasajeros(nombre, apellido, dni, correo, telefono, estado) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pasajero.getNombre());
            ps.setString(2, pasajero.getApellido());
            ps.setString(3, pasajero.getDni());
            ps.setString(4, pasajero.getCorreo());
            ps.setString(5, pasajero.getTelefono());
            ps.setBoolean(6, pasajero.isEstado());
            
            ps.executeUpdate();
            
            ResultSet idPasajero = ps.getGeneratedKeys();
            
            if(idPasajero.next()){  //si se genero un id es porque se guardo
                
                pasajero.setIdPasajero(idPasajero.getInt(1));
                JOptionPane.showMessageDialog(null, "Pasajero Guardado ID = "+pasajero.getIdPasajero());
            }
            ps.close();
        } catch (SQLException ex) {
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Pasajero repetido");               
            }else{
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero" + ex);
            }
        }
    }
    
    public Pasajeros buscarPasajero(int id) {
        Pasajeros pasaj = null;
        String sql = "SELECT * FROM pasajeros WHERE id_pasajero = ? AND estado = true";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                pasaj = new Pasajeros();
                
                pasaj.setIdPasajero(rs.getInt("id_pasajero"));
                pasaj.setNombre(rs.getString("nombre"));
                pasaj.setApellido(rs.getString("apellido"));
                pasaj.setDni(rs.getString("dni"));
                pasaj.setCorreo(rs.getString("correo"));
                pasaj.setTelefono(rs.getString("telefono"));
                pasaj.setEstado(rs.getBoolean("estado"));
              
            }else{
                JOptionPane.showMessageDialog(null, "No existe un pasajero con ese ID");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero" + ex);
        }
        return pasaj;
    }
    
    public Pasajeros buscarPasajeroDNI(String dni) {
        Pasajeros pasaj = null;
        String sql = "SELECT * FROM pasajeros WHERE dni = ? AND estado = true";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pasaj = new Pasajeros();

                pasaj.setIdPasajero(rs.getInt("id_pasajero"));
                pasaj.setNombre(rs.getString("nombre"));
                pasaj.setApellido(rs.getString("apellido"));
                pasaj.setDni(rs.getString("dni"));
                pasaj.setCorreo(rs.getString("correo"));
                pasaj.setTelefono(rs.getString("telefono"));
                pasaj.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe un pasajero con ese DNI");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero" + ex);
        }
        return pasaj;
    }
   
    public void modificarPasajero(Pasajeros psj) {
        String sql = "UPDATE pasajeros SET nombre= ?, apellido= ?, dni= ?, correo= ?, telefono= ? "
               + " WHERE id_Pasajero = ?";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, psj.getNombre());
            ps.setString(2, psj.getApellido());
            ps.setString(3, psj.getDni());
            ps.setString(4, psj.getCorreo());
            ps.setString(5, psj.getTelefono());
            ps.setInt(6, psj.getIdPasajero());
            
            int filasAf = ps.executeUpdate();
            if(filasAf == 1) {
                JOptionPane.showMessageDialog(null, "Pasajero modificado");
            }
            else {
                JOptionPane.showMessageDialog(null, "No se encontro el pasajero" );
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero" + ex);
        }
    }
     public void modificarPasajeroPorDni(Pasajeros psj) {
        String sql = "UPDATE pasajeros SET nombre= ?, apellido= ?, dni= ?, correo= ?, telefono= ? "
               + " WHERE dni = ?";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, psj.getNombre());
            ps.setString(2, psj.getApellido());
            ps.setString(3, psj.getDni());
            ps.setString(4, psj.getCorreo());
            ps.setString(5, psj.getTelefono());
            ps.setString(6, psj.getDni());
            
            int filasAf = ps.executeUpdate();
            if(filasAf == 1) {
                JOptionPane.showMessageDialog(null, "Pasajero modificado");
            }
            else {
                JOptionPane.showMessageDialog(null, "No se encontro el pasajero" );
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero" + ex);
        }
    }
   
    public void eliminarPasajeros(int id) {
        String sql = "UPDATE pasajeros SET estado = 0 WHERE id_pasajero = ? AND estado = 1";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            int filasAf = ps.executeUpdate();
            if (filasAf == 1) {
                JOptionPane.showMessageDialog(null, "Pasajero eliminado");
            }
            else {
                JOptionPane.showMessageDialog(null, "No se encontro el pasajero a eliminar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero" + ex);
        }       
    }
    
     public void eliminarPasajerosPorDni(Pasajeros psj) {
         
         String sql = "UPDATE pasajeros SET estado = 0 WHERE dni = ? AND estado = 1";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, psj.getDni());
            
            int filasAf = ps.executeUpdate();
            if (filasAf == 1) {
                JOptionPane.showMessageDialog(null, "Pasajero eliminado");
            }
            else {
                JOptionPane.showMessageDialog(null, "No se encontro el pasajero a eliminar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero" + ex);
        }       
    }
   
    public List<Pasajeros> listarPasajeros() {
        ArrayList<Pasajeros> listaPasajeros = new ArrayList<>();
        String sql = "SELECT * FROM pasajeros WHERE estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Pasajeros pasaj = new Pasajeros();
                
                pasaj.setIdPasajero(rs.getInt("id_Pasajero"));
                pasaj.setNombre(rs.getString("nombre"));
                pasaj.setApellido(rs.getString("apellido"));
                pasaj.setDni(rs.getString("dni"));
                pasaj.setCorreo(rs.getString("correo"));
                pasaj.setTelefono(rs.getString("telefono"));
                pasaj.setEstado(true);

                listaPasajeros.add(pasaj);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero" + ex);
        }
        return listaPasajeros;
    }
    
    public List<Pasajeros> listarPasajerosPorDni(String dni) {
        ArrayList<Pasajeros> listaPasajeros = new ArrayList<>();
        String sql = "SELECT nombre, apellido, dni, correo, telefono FROM pasajeros WHERE dni = ? AND estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Pasajeros pasaj = new Pasajeros();
                
                pasaj.setNombre(rs.getString("nombre"));
                pasaj.setApellido(rs.getString("apellido"));
                pasaj.setDni(rs.getString("dni"));
                pasaj.setCorreo(rs.getString("correo"));
                pasaj.setTelefono(rs.getString("telefono"));
               

                listaPasajeros.add(pasaj);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero" + ex);
        }
        return listaPasajeros;
    }
}
