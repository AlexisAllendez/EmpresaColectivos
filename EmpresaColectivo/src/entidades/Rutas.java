
package entidades;

import java.time.LocalTime;

public class Rutas {
    
    private int idRuta;
    private String origen;
    private String destino;
    private LocalTime duracionEst;
    private boolean estado;

    public Rutas(int idRuta, String origen, String destino, LocalTime duracionEst, boolean estado) {
        this.idRuta = idRuta;
        this.origen = origen;
        this.destino = destino;
        this.duracionEst = duracionEst;
        this.estado = estado;
    }

    public Rutas(String origen, String destino, LocalTime duracionEst, boolean estado) {
        this.origen = origen;
        this.destino = destino;
        this.duracionEst = duracionEst;
        this.estado = estado;
    }

    public Rutas() {
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalTime getDuracionEst() {
        return duracionEst;
    }

    public void setDuracionEst(LocalTime duracionEst) {
        this.duracionEst = duracionEst;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return origen + " - " + destino;
    }

}
