/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoADatos;

import entidades.Colectivos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 54266
 */
public class ColectivosData {
   private Connection con =  null;
    Colectivos colectivo = null;

    public ColectivosData() {
       con = Conexion.getConexion();
    }

    public void guardarColectivo(Colectivos colectivo) {
        String sql = "INSERT INTO colectivos (matricula, marca, modelo, capacidad, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, colectivo.getMatricula());
            ps.setString(2, colectivo.getMarca());
            ps.setString(3, colectivo.getModelo());
            ps.setInt(4, colectivo.getCapacidad());
            ps.setBoolean(5, colectivo.isEstado());
            
            ps.executeUpdate();
            ResultSet idColectivo = ps.getGeneratedKeys();
            if (idColectivo.next()) {
                colectivo.setIdColectivo(idColectivo.getInt(1));
                JOptionPane.showMessageDialog(null, "Se guardo el colectivo");
            }
            ps.close();
        } catch (SQLException ex) {
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Colectivo repetido");               
            }else{
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
            }
        }
    }

    public Colectivos buscarColectivo(int id) {
        String sql = "SELECT * FROM colectivos WHERE estado = 1 AND id_colectivo = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                colectivo = new Colectivos();
                
                colectivo.setIdColectivo(rs.getInt("id_colectivo"));
                colectivo.setMatricula(rs.getString("matricula"));
                colectivo.setMarca(rs.getString("marca"));
                colectivo.setModelo(rs.getString("modelo"));
                colectivo.setCapacidad(rs.getInt("capacidad"));
                colectivo.setEstado(rs.getBoolean("estado"));
               
            } else {
                JOptionPane.showMessageDialog(null, "No existe un colectivo con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
        }
        return colectivo;
    }

    public void modificarColectivo(Colectivos colectivo) {
        String sql = "UPDATE colectivos SET matricula = ?, marca = ?, modelo = ?, capacidad = ? WHERE id_colectivo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, colectivo.getMatricula());
            ps.setString(2, colectivo.getMarca());
            ps.setString(3, colectivo.getModelo());
            ps.setInt(4, colectivo.getCapacidad());
            ps.setInt(5, colectivo.getIdColectivo());
            
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó el colectivo");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el colectivo a modificar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
        }
    }

    public void eliminarColectivo(int id) {
        String sql = "UPDATE colectivos SET estado = 0 WHERE id_colectivo = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó exitosamente el colectivo");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el colectivo a eliminar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
        }
    }
    
    public ArrayList<Colectivos> listarColectivos() {
        ArrayList<Colectivos> listaColectivos = new ArrayList<>();
        String sql = "SELECT * FROM colectivos WHERE estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                colectivo = new Colectivos();
                
                colectivo.setIdColectivo(rs.getInt("id_colectivo"));
                colectivo.setMatricula(rs.getString("matricula"));
                colectivo.setMarca(rs.getString("marca"));
                colectivo.setModelo(rs.getString("modelo"));
                colectivo.setCapacidad(rs.getInt("capacidad"));
                
                listaColectivos.add(colectivo);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
        }
        return listaColectivos;
    }
    
//LISTO COLECTIVOS ASIGNADOS A DETERMINADO RECOORRIDO - USO EN VENTAS PARA CARGAR EL COLECTIVO
    public ArrayList<Colectivos> listarColectivosAsignados(int id_ruta, LocalDate fechaViaje, LocalTime horaViaje){
        ArrayList<Colectivos> listaColeAsig = new ArrayList<>();
        String sql = "SELECT DISTINCT c.* FROM pasajes p " +
                    "JOIN colectivos c ON p.id_colectivo = c.id_colectivo " +
                    "WHERE p.id_ruta = ? AND p.fecha_viaje = ? AND p.hora_viaje = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_ruta);
            ps.setDate(2, Date.valueOf(fechaViaje));
            ps.setTime(3, Time.valueOf(horaViaje));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                colectivo = new Colectivos();
                
                colectivo.setIdColectivo(rs.getInt("id_colectivo"));
                colectivo.setMatricula(rs.getString("matricula"));
                colectivo.setMarca(rs.getString("marca"));
                colectivo.setModelo(rs.getString("modelo"));
                colectivo.setCapacidad(rs.getInt("capacidad"));
                colectivo.setEstado(true);
                
                listaColeAsig.add(colectivo);                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajes" + ex);
        }
        return listaColeAsig;
    }
    
//LISTO LOS COLECTIVOS DISPONIBLES - LO UTILIZO PARA ASIGNAR NUEVA UNIDAD
    public ArrayList<Colectivos> listarColectivosDisponibles(int id_ruta, LocalDate fechaViaje, LocalTime horaSalida) {
        ArrayList<Colectivos> listaColectivos = new ArrayList<>();
        String sql = "SELECT DISTINCT c.* FROM colectivos c "
                    + "WHERE estado = 1 ";
//        String sql = "SELECT DISTINCT c.* FROM pasajes p "
//                    + "RIGHT JOIN colectivos c ON p.id_colectivo = c.id_colectivo "
//                    + "WHERE (NOT(p.id_ruta = ? AND p.fecha_viaje = ? AND p.hora_viaje = ?) OR id_ruta IS NULL) AND estado = 1 ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1,id_ruta);
//            ps.setDate(2, Date.valueOf(fechaViaje));
//            ps.setTime(3, Time.valueOf(horaSalida));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                colectivo = new Colectivos();
                
                colectivo.setIdColectivo(rs.getInt("id_colectivo"));
                colectivo.setMatricula(rs.getString("matricula"));
                colectivo.setMarca(rs.getString("marca"));
                colectivo.setModelo(rs.getString("modelo"));
                colectivo.setCapacidad(rs.getInt("capacidad"));
                
                listaColectivos.add(colectivo);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
        }
        return listaColectivos;
    }    

    
    
    
    public ArrayList<Colectivos> listarColePorMatricula(String matri) {
        ArrayList<Colectivos> lista = new ArrayList<>();
        String sql = "SELECT matricula, marca, modelo, capacidad FROM colectivos WHERE matricula = ? AND estado = 1";
     try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, matri);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                colectivo = new Colectivos();
                
                colectivo.setMatricula(rs.getString("matricula"));
                colectivo.setMarca(rs.getString("marca"));
                colectivo.setModelo(rs.getString("modelo"));
                colectivo.setCapacidad(rs.getInt("capacidad"));
                colectivo.setEstado(true);
                
                lista.add(colectivo);                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
        }
        return lista;
    }
    
     public ArrayList<Colectivos> listarColePorMarca(String marca) {
        ArrayList<Colectivos> lista = new ArrayList<>();
        String sql = "SELECT matricula, marca, modelo, capacidad FROM colectivos WHERE marca = ? AND estado = 1";
     try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, marca);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                colectivo = new Colectivos();
                
                colectivo.setMatricula(rs.getString("matricula"));
                colectivo.setMarca(rs.getString("marca"));
                colectivo.setModelo(rs.getString("modelo"));
                colectivo.setCapacidad(rs.getInt("capacidad"));
                colectivo.setEstado(true);
                
                lista.add(colectivo);                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
        }
        return lista;
    }
     
      public ArrayList<Colectivos> listarColePorCapaci(int cap) {
        ArrayList<Colectivos> lista = new ArrayList<>();
        String sql = "SELECT matricula, marca, modelo, capacidad FROM colectivos WHERE capacidad = ? AND estado = 1";
     try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cap);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                colectivo = new Colectivos();
                
                colectivo.setMatricula(rs.getString("matricula"));
                colectivo.setMarca(rs.getString("marca"));
                colectivo.setModelo(rs.getString("modelo"));
                colectivo.setCapacidad(rs.getInt("capacidad"));
                colectivo.setEstado(true);
                
                lista.add(colectivo);                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
        }
        return lista;
    }
    
    public ArrayList<Colectivos> listarColePorEspec(String matri, String marca, int cap) {
        ArrayList<Colectivos> lista = new ArrayList<>();
        String sql = "SELECT matricula, marca, modelo, capacidad FROM colectivos WHERE matricula = ? AND marca = ? AND capacidad = ? AND estado = 1";
     try {
            PreparedStatement ps = con.prepareStatement(sql);
         
            ps.setString(1, matri);
            ps.setString(2, marca);
            ps.setInt(3, cap);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                colectivo = new Colectivos();
                
                colectivo.setMatricula(rs.getString("matricula"));
                colectivo.setMarca(rs.getString("marca"));
                colectivo.setModelo(rs.getString("modelo"));
                colectivo.setCapacidad(rs.getInt("capacidad"));
                colectivo.setEstado(true);
                
                lista.add(colectivo);                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
        }
        return lista;
    }
      public ArrayList<Colectivos> listaColeDist() {
          ArrayList<Colectivos> lista = new ArrayList<>();
          String sql = "SELECT DISTINCT marca FROM colectivos WHERE estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Colectivos marca = new Colectivos();
                marca.setMarca(rs.getString("marca"));
                lista.add(marca);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
        }
        return lista;
    }
      
       public ArrayList<Colectivos> listaColeDistCap() {
          ArrayList<Colectivos> lista = new ArrayList<>();
          String sql = "SELECT DISTINCT capacidad FROM colectivos WHERE estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Colectivos capa = new Colectivos();
                capa.setCapacidad(rs.getInt("capacidad"));
                lista.add(capa);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex);
        }
        return lista;
    }
      }
    
     
       
