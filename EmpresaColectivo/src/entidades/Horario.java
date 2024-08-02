
package entidades;

import java.time.LocalTime;


public class Horario {
    
    private int idHorarios;
    private Ruta ruta;
    private LocalTime horaLLegada;
    private LocalTime horaSalida;
    private boolean estado;

    public Horario(Ruta ruta, LocalTime horaLLegada, LocalTime horaSalida, boolean estado) {
        this.ruta = ruta;
        this.horaLLegada = horaLLegada;
        this.horaSalida = horaSalida;
        this.estado = estado;
    }

    public Horario(int idHorarios, Ruta ruta, LocalTime horaLLegada, LocalTime horaSalida, boolean estado) {
        this.idHorarios = idHorarios;
        this.ruta = ruta;
        this.horaLLegada = horaLLegada;
        this.horaSalida = horaSalida;
        this.estado = estado;
    }
    

    public Horario(int idHorarios, Ruta Ruta, LocalTime horaSalida, boolean estado) {
        this.idHorarios = idHorarios;
        this.ruta = Ruta;
        this.horaSalida = horaSalida;
        this.estado = estado;
    }

    public Horario(Ruta Ruta, LocalTime horaSalida, boolean estado) {
        this.ruta = Ruta;
        this.horaSalida = horaSalida;
        this.estado = estado;
    }

    public Horario() {
    }

    public int getIdHorarios() {
        return idHorarios;
    }

    public void setIdHorarios(int idHorarios) {
        this.idHorarios = idHorarios;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta Ruta) {
        this.ruta = Ruta;
    }

    public LocalTime getHoraLLegada() {
        return horaLLegada;
    }

    public void setHoraLLegada(LocalTime horaLLegada) {
        this.horaLLegada = horaLLegada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }    

    @Override
    public String toString() {
        return horaSalida + " - " + horaLLegada;
    }

}
